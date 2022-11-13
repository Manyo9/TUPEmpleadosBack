package com.lciv.tpiempleados.controllers;

import com.lciv.tpiempleados.entities.*;
import com.lciv.tpiempleados.services.EmpleadoService;
import com.lciv.tpiempleados.services.ReciboService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/recibos")
public class ReciboController {
    private final ReciboService reciboService;

    public ReciboController(ReciboService reciboService) {
        this.reciboService = reciboService;
    }
    @GetMapping("/reporte")
    public List<SueldoNetoPorArea> getReciboByLegajo(@RequestParam Short anio, @RequestParam Byte mes) {
        return this.reciboService.obtenerPorMesAnioAgrupados(anio,mes);
    }
    @PostMapping("/nuevo")
    public Recibo registrarRecibo(@RequestBody Recibo recibo) {
        return this.reciboService.guardarRecibo(recibo);
    }
}
