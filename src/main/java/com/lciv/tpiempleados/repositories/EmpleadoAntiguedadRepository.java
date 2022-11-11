package com.lciv.tpiempleados.repositories;

import com.lciv.tpiempleados.entities.EmpleadoConAntiguedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoAntiguedadRepository extends JpaRepository<EmpleadoConAntiguedad,Integer> {
}
