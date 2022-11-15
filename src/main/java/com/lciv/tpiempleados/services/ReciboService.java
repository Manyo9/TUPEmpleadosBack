package com.lciv.tpiempleados.services;

import com.lciv.tpiempleados.entities.Recibo;
import com.lciv.tpiempleados.entities.ReciboNeto;
import com.lciv.tpiempleados.entities.SueldoNetoPorArea;
import com.lciv.tpiempleados.repositories.EmpleadoRepository;
import com.lciv.tpiempleados.repositories.ReciboNetoRepository;
import com.lciv.tpiempleados.repositories.ReciboRepository;
import com.lciv.tpiempleados.repositories.SueldoPorAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReciboService {
    private final ReciboRepository reciboRepository;
    private final ReciboNetoRepository reciboNetoRepository;
    private final SueldoPorAreaRepository sueldoPorAreaRepository;
    private final EmpleadoRepository empleadoRepository;
    @Autowired
    public ReciboService(
            ReciboRepository reciboRepository,
            ReciboNetoRepository reciboNetoRepository,
            SueldoPorAreaRepository sueldoPorAreaRepository,
            EmpleadoRepository empleadoRepository)
    {
        this.reciboRepository = reciboRepository;
        this.reciboNetoRepository = reciboNetoRepository;
        this.sueldoPorAreaRepository = sueldoPorAreaRepository;
        this.empleadoRepository = empleadoRepository;
    }
    public Recibo guardarRecibo(Recibo recibo) {
        if (this.empleadoRepository.existsById(recibo.getLegajoEmpleado().getLegajo())){
            return this.reciboRepository.save(recibo);
        }
        throw new IllegalArgumentException("No existe un empleado con el legajo ingresado");

    }

    public Optional<List<ReciboNeto>> obtenerPorLegajo(Integer legajo) {
        return this.reciboNetoRepository.getAllByLegajo(legajo);
    }
    public Optional<List<SueldoNetoPorArea>> obtenerPorMesAnioAgrupados(Short anio, Byte mes) {
        return this.sueldoPorAreaRepository.getAllByMesAnio(anio, mes);
    }
}
