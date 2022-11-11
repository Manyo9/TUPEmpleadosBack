package com.lciv.tpiempleados.entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Mapping for DB view
 */
@Entity
@Immutable
@Table(name = "empleadosconantiguedad")
public class EmpleadoConAntiguedad {
    @Id
    @Column(name = "legajo", nullable = false)
    private Integer legajo;

    @Column(name = "nombre", nullable = false, length = 32)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 32)
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "antiguedad")
    private Integer antiguedad;

    @Column(name = "sueldo_bruto", nullable = false, precision = 9, scale = 2)
    private BigDecimal sueldoBruto;

    @Column(name = "area", nullable = false, length = 50)
    private String area;

    public Integer getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public BigDecimal getSueldoBruto() {
        return sueldoBruto;
    }

    public String getArea() {
        return area;
    }

    protected EmpleadoConAntiguedad() {
    }
}