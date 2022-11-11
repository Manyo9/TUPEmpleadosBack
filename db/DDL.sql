CREATE DATABASE db_empleados;
USE db_empleados;

CREATE TABLE empleados(
    legajo INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(32) NOT NULL,
    apellido VARCHAR(32) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    fecha_ingreso DATE NOT NULL,
    sueldo_bruto DECIMAL(9,2) NOT NULL,
    area varchar(50) NOT NULL,
    PRIMARY KEY (legajo)
);

CREATE TABLE recibos(
    nro_recibo INT AUTO_INCREMENT NOT NULL,
    mes TINYINT NOT NULL,
    anio SMALLINT NOT NULL,
    sueldo_bruto DECIMAL(9,2) NOT NULL,
    incremento_antiguedad DECIMAL(5,2) NOT NULL,
    ded_jubilacion DECIMAL(5,2) NOT NULL,
    ded_obra_social DECIMAL(5,2) NOT NULL,
    ded_fondo_alta_compl DECIMAL(5,2) NOT NULL,
    legajo_empleado INT NOT NULL, 
    PRIMARY KEY (nro_recibo),
    FOREIGN KEY (legajo_empleado) REFERENCES empleados (legajo)
);

DELIMITER //
CREATE FUNCTION calcularAntiguedad( fecha date )
RETURNS INT
READS SQL DATA
DETERMINISTIC
BEGIN
	DECLARE aniosAntiguedad INT;
    SET aniosAntiguedad = TIMESTAMPDIFF(YEAR, fecha, NOW());
    RETURN aniosAntiguedad;
END//

DELIMITER ;

CREATE VIEW empleadosConAntiguedad
AS
	select e.legajo, e.nombre, e.apellido, e.fecha_nacimiento,
    calcularAntiguedad(e.fecha_ingreso) as antiguedad,
    e.sueldo_bruto, e.area
    from empleados e

DELIMITER //

CREATE PROCEDURE getEmpleados()
BEGIN
	select * from empleadosConAntiguedad;
END//

CREATE PROCEDURE getRawEmpleados()
BEGIN
	select * from empleados;
END//

CREATE PROCEDURE getEmpleadoById(IN id INT)
BEGIN
	select * from empleadosConAntiguedad where legajo = id;
END//

CREATE PROCEDURE getRawEmpleadoById(IN id INT)
BEGIN
	select * from empleados where legajo = id;
END//

DELIMITER ;