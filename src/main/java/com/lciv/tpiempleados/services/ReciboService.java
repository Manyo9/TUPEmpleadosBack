package com.lciv.tpiempleados.services;

import com.lciv.tpiempleados.entities.Recibo;
import com.lciv.tpiempleados.entities.ReciboNeto;
import com.lciv.tpiempleados.entities.SueldoNetoPorArea;
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

    @Autowired
    public ReciboService(
            ReciboRepository reciboRepository,
            ReciboNetoRepository reciboNetoRepository,
            SueldoPorAreaRepository sueldoPorAreaRepository)
    {
        this.reciboRepository = reciboRepository;
        this.reciboNetoRepository = reciboNetoRepository;
        this.sueldoPorAreaRepository = sueldoPorAreaRepository;
    }
    public void guardarRecibo(Recibo recibo) {
        this.reciboRepository.save(recibo);
    }

    public List<ReciboNeto> obtenerPorLegajo(Integer legajo) {
        Optional<List<ReciboNeto>> resultado = this.reciboNetoRepository.getAllByLegajo(legajo);
        if(resultado.isPresent()) {
            return resultado.get();
        }
        return new ArrayList<>();
    }
    public List<SueldoNetoPorArea> obtenerPorMesAnioAgrupados(Short anio, Byte mes) {
        Optional<List<SueldoNetoPorArea>> resultado = this.sueldoPorAreaRepository.getAllByMesAnio(anio, mes);
        if(resultado.isPresent()) {
            return resultado.get();
        }
        return new ArrayList<>();
    }
}
