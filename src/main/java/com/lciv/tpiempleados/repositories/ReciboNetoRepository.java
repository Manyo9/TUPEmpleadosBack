package com.lciv.tpiempleados.repositories;

import com.lciv.tpiempleados.entities.Recibo;
import com.lciv.tpiempleados.entities.ReciboNeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReciboNetoRepository extends JpaRepository<Recibo,Integer> {
    @Query("SELECT r FROM ReciboNeto r WHERE r.legajoEmpleado = ?1")
    Optional<List<ReciboNeto>> getAllByLegajo(Integer legajo);
}
