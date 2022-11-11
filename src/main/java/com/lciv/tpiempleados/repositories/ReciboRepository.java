package com.lciv.tpiempleados.repositories;

import com.lciv.tpiempleados.entities.Recibo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReciboRepository extends JpaRepository<Recibo,Integer> {
}
