CREATE DATABASE db_empleados;
USE db_empleados;

CREATE TABLE t_areas(
    id SMALLINT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE t_empleados(
    legajo INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(32) NOT NULL,
    apellido VARCHAR(32) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    fecha_ingreso DATE NOT NULL,
    sueldo_bruto DECIMAL(9,2) NOT NULL,
    id_area SMALLINT NOT NULL,
    PRIMARY KEY (legajo),
    FOREIGN KEY (id_area) REFERENCES t_areas (id)
);

CREATE TABLE t_recibos(
    nro_recibo INT AUTO_INCREMENT NOT NULL,
    mes TINYINT NOT NULL,
    anio SMALLINT NOT NULL,
    sueldo_bruto DECIMAL(9,2) NOT NULL,
    incremento_antiguedad DECIMAL(5,2) NOT NULL,
    ded_jubilacion DECIMAL(5,2) NOT NULL,
    ded_obraSocial DECIMAL(5,2) NOT NULL,
    ded_fondo_alta_compl DECIMAL(5,2) NOT NULL,
    legajo_empleado INT NOT NULL, 
    PRIMARY KEY (nro_recibo),
    FOREIGN KEY (legajo_empleado) REFERENCES t_empleados (legajo)
);