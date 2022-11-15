package com.lciv.tpiempleados.controllers;

import com.lciv.tpiempleados.entities.*;
import com.lciv.tpiempleados.services.EmpleadoService;
import com.lciv.tpiempleados.services.ReciboService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
//permitimos unicamente el puerto por defecto de angular
@CrossOrigin( origins = "http://localhost:4200")
@RequestMapping(path = "api/empleado")
public class EmpleadoController {
    private final EmpleadoService empleadoService;
    private final ReciboService reciboService;

    public EmpleadoController(EmpleadoService empleadoService, ReciboService reciboService) {
        this.empleadoService = empleadoService;
        this.reciboService = reciboService;
    }
    @GetMapping()
    public List<EmpleadoConAntiguedad> getEmpleados() {
        return this.empleadoService.getEmpleados();
    }
    @GetMapping(path = "{legajo}/recibos")
    public ResponseEntity<?> getReciboByLegajo(@PathVariable("legajo") Integer legajo) {
        Optional<List<ReciboNeto>> resultado = this.reciboService.obtenerPorLegajo(legajo);
        if(resultado.isPresent()){
            List<ReciboNeto> lst = resultado.get();
            if (lst.size() > 0) {
                return ResponseEntity.ok(lst);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontraron resultados para ese legajo");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en el servidor");


    }
    @PostMapping("/nuevo")
    public Empleado registrarEmpleado(@RequestBody Empleado empleado) {
        return this.empleadoService.guardarEmpleado(empleado);
    }

}
