package com.lciv.tpiempleados.entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@Entity
@Immutable
@Table(name = "sueldosnetosporarea")
public class SueldoNetoPorArea {
    @Id
    @Column(name = "area", nullable = false, length = 50)
    private String area;

    @Column(name = "total", precision = 31, scale = 2)
    private BigDecimal total;

    @Column(name = "cantidad_recibos", nullable = false)
    private Long cantidadRecibos;

    @Column(name = "anio", nullable = false)
    private Short anio;

    @Column(name = "mes", nullable = false)
    private Byte mes;

    public String getArea() {
        return area;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Long getCantidadRecibos() {
        return cantidadRecibos;
    }

    public Short getAnio() {
        return anio;
    }

    public Byte getMes() {
        return mes;
    }

    protected SueldoNetoPorArea() {
    }
}