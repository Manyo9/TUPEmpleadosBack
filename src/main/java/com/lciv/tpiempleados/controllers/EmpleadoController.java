package com.lciv.tpiempleados.controllers;

import com.lciv.tpiempleados.entities.Empleado;
import com.lciv.tpiempleados.entities.EmpleadoConAntiguedad;
import com.lciv.tpiempleados.entities.Recibo;
import com.lciv.tpiempleados.entities.ReciboNeto;
import com.lciv.tpiempleados.services.EmpleadoService;
import com.lciv.tpiempleados.services.ReciboService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public List<ReciboNeto> getReciboByLegajo( @PathVariable("legajo") Integer legajo) {
        return this.reciboService.obtenerPorLegajo(legajo);
    }
    @PostMapping("/nuevo")
    public void registrarEmpleado(@RequestBody Empleado empleado) {
        this.empleadoService.guardarEmpleado(empleado);
    }
    @PostMapping("/recibos/nuevo")
    public void registrarRecibo(@RequestBody Recibo recibo) {
        this.reciboService.guardarRecibo(recibo);
    }
}
