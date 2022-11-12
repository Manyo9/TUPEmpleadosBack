package com.lciv.tpiempleados.repositories;

import com.lciv.tpiempleados.entities.SueldoNetoPorArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SueldoPorAreaRepository extends JpaRepository<SueldoNetoPorArea, String> {

    @Query("SELECT s FROM SueldoNetoPorArea s WHERE s.anio = ?1 AND s.mes = ?2")
    Optional<List<SueldoNetoPorArea>> getAllByMesAnio(Short anio,Byte mes );

}
