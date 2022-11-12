package com.lciv.tpiempleados.entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Immutable
@Table(name = "recibosnetos")
public class ReciboNeto {
    @Id
    @Column(name = "nro_recibo", nullable = false)
    private Integer nroRecibo;

    @Column(name = "legajo_empleado", nullable = false)
    private Integer legajoEmpleado;

    @Column(name = "mes", nullable = false)
    private Byte mes;

    @Column(name = "anio", nullable = false)
    private Short anio;

    @Column(name = "sueldo_bruto", nullable = false, precision = 9, scale = 2)
    private BigDecimal sueldoBruto;

    @Column(name = "incremento_antiguedad", nullable = false, precision = 7, scale = 2)
    private BigDecimal incrementoAntiguedad;

    @Column(name = "ded_jubilacion", nullable = false, precision = 7, scale = 2)
    private BigDecimal dedJubilacion;

    @Column(name = "ded_obra_social", nullable = false, precision = 7, scale = 2)
    private BigDecimal dedObraSocial;

    @Column(name = "ded_fondo_alta_compl", nullable = false, precision = 7, scale = 2)
    private BigDecimal dedFondoAltaCompl;

    @Column(name = "sueldo_neto", precision = 9, scale = 2)
    private BigDecimal sueldoNeto;

    public Integer getNroRecibo() {
        return nroRecibo;
    }

    public Integer getLegajoEmpleado() {
        return legajoEmpleado;
    }

    public Byte getMes() {
        return mes;
    }

    public Short getAnio() {
        return anio;
    }

    public BigDecimal getSueldoBruto() {
        return sueldoBruto;
    }

    public BigDecimal getIncrementoAntiguedad() {
        return incrementoAntiguedad;
    }

    public BigDecimal getDedJubilacion() {
        return dedJubilacion;
    }

    public BigDecimal getDedObraSocial() {
        return dedObraSocial;
    }

    public BigDecimal getDedFondoAltaCompl() {
        return dedFondoAltaCompl;
    }

    public BigDecimal getSueldoNeto() {
        return sueldoNeto;
    }

    protected ReciboNeto() {
    }
}