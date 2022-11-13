package com.lciv.tpiempleados.services;

import com.lciv.tpiempleados.entities.Empleado;
import com.lciv.tpiempleados.entities.EmpleadoConAntiguedad;
import com.lciv.tpiempleados.repositories.EmpleadoAntiguedadRepository;
import com.lciv.tpiempleados.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;
    private final EmpleadoAntiguedadRepository empleadoAntiguedadRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository, EmpleadoAntiguedadRepository empleadoAntiguedadRepository) {
        this.empleadoRepository = empleadoRepository;
        this.empleadoAntiguedadRepository=empleadoAntiguedadRepository;
    }

    public List<EmpleadoConAntiguedad> getEmpleados() {
        return this.empleadoAntiguedadRepository.findAll();
    }
    public Empleado guardarEmpleado(Empleado empleado) {
        return this.empleadoRepository.save(empleado);
    }
}
