CREATE DATABASE Empleados;
USE Empleados;

CREATE TABLE Areas(
    id SMALLINT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Empleados(
    legajo int AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(32) NOT NULL,
    apellido VARCHAR(32) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    fechaIngreso DATE NOT NULL,
    sueldoBruto DECIMAL(9,2) NOT NULL,
    idArea SMALLINT NOT NULL,
    PRIMARY KEY (legajo),
    FOREIGN KEY (idArea) REFERENCES areas (id)
);

CREATE TABLE Recibos(
    nroRecibo int AUTO_INCREMENT NOT NULL,
    mes tinyint NOT NULL,
    anio SMALLINT NOT NULL,
    sueldoBruto DECIMAL(9,2) NOT NULL,
    incrementoAntiguedad DECIMAL(5,2) NOT NULL,
    dedJubilacion DECIMAL(5,2) NOT NULL,
    dedObraSocial DECIMAL(5,2) NOT NULL,
    dedFondoAltaCompl DECIMAL(5,2) NOT NULL,
    legajoEmpleado int NOT NULL, 
    PRIMARY KEY (nroRecibo),
    FOREIGN KEY (legajoEmpleado) REFERENCES empleados (legajo)
);