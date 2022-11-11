package com.lciv.tpiempleados.services;

import com.lciv.tpiempleados.entities.Recibo;
import com.lciv.tpiempleados.entities.ReciboNeto;
import com.lciv.tpiempleados.repositories.ReciboNetoRepository;
import com.lciv.tpiempleados.repositories.ReciboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReciboService {
    private final ReciboRepository reciboRepository;
    private final ReciboNetoRepository reciboNetoRepository;

    @Autowired
    public ReciboService(ReciboRepository reciboRepository, ReciboNetoRepository reciboNetoRepository) {
        this.reciboRepository = reciboRepository;
        this.reciboNetoRepository = reciboNetoRepository;
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
}
