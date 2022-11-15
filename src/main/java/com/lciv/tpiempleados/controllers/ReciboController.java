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
@RequestMapping(path = "api/recibos")
public class ReciboController {
    private final ReciboService reciboService;

    public ReciboController(ReciboService reciboService) {
        this.reciboService = reciboService;
    }
    @GetMapping("/reporte")
    public ResponseEntity<?> getReciboByMesAnio(@RequestParam Short anio, @RequestParam Byte mes) {
        if(anio < 1901 || anio > 9999) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ingrese un año válido");
        }
        if (mes < 1 || mes > 12) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ingrese un mes válido");
        }
        Optional<List<SueldoNetoPorArea>> resultado = this.reciboService.obtenerPorMesAnioAgrupados(anio,mes);
        if(resultado.isPresent()){
            List<SueldoNetoPorArea> lst = resultado.get();
            if (lst.size() > 0) {
                return ResponseEntity.ok(lst);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay resultados para esa fecha");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en el servidor");
    }
    @PostMapping("/nuevo")
    public ResponseEntity<?> registrarRecibo(@RequestBody Recibo recibo) {
        try {
            return ResponseEntity.ok(this.reciboService.guardarRecibo(recibo));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro empleado con legajo: "
                    + recibo.getLegajoEmpleado().getLegajo());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en el servidor");
        }

    }
}
