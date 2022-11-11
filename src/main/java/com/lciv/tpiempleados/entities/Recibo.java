package com.lciv.tpiempleados.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "recibos")
public class Recibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_recibo", nullable = false)
    private Integer id;

    @Column(name = "mes", nullable = false)
    private Byte mes;

    @Column(name = "anio", nullable = false)
    private Short anio;

    @Column(name = "sueldo_bruto", nullable = false, precision = 9, scale = 2)
    private BigDecimal sueldoBruto;

    @Column(name = "incremento_antiguedad", nullable = false, precision = 5, scale = 2)
    private BigDecimal incrementoAntiguedad;

    @Column(name = "ded_jubilacion", nullable = false, precision = 5, scale = 2)
    private BigDecimal dedJubilacion;

    @Column(name = "ded_obra_social", nullable = false, precision = 5, scale = 2)
    private BigDecimal dedObraSocial;

    @Column(name = "ded_fondo_alta_compl", nullable = false, precision = 5, scale = 2)
    private BigDecimal dedFondoAltaCompl;

    @ManyToOne(targetEntity = Empleado.class)
    @JoinColumn(name = "legajo_empleado")
    @JsonBackReference
    private Empleado legajoEmpleado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getMes() {
        return mes;
    }

    public void setMes(Byte mes) {
        this.mes = mes;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public BigDecimal getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(BigDecimal sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public BigDecimal getIncrementoAntiguedad() {
        return incrementoAntiguedad;
    }

    public void setIncrementoAntiguedad(BigDecimal incrementoAntiguedad) {
        this.incrementoAntiguedad = incrementoAntiguedad;
    }

    public BigDecimal getDedJubilacion() {
        return dedJubilacion;
    }

    public void setDedJubilacion(BigDecimal dedJubilacion) {
        this.dedJubilacion = dedJubilacion;
    }

    public BigDecimal getDedObraSocial() {
        return dedObraSocial;
    }

    public void setDedObraSocial(BigDecimal dedObraSocial) {
        this.dedObraSocial = dedObraSocial;
    }

    public BigDecimal getDedFondoAltaCompl() {
        return dedFondoAltaCompl;
    }

    public void setDedFondoAltaCompl(BigDecimal dedFondoAltaCompl) {
        this.dedFondoAltaCompl = dedFondoAltaCompl;
    }

    public Empleado getLegajoEmpleado() {
        return legajoEmpleado;
    }

    public void setLegajoEmpleado(Empleado legajoEmpleado) {
        this.legajoEmpleado = legajoEmpleado;
    }

}