CREATE DATABASE db_empleados;
USE db_empleados;

CREATE TABLE empleados(
    legajo INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(32) NOT NULL,
    apellido VARCHAR(32) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    fecha_ingreso DATE NOT NULL,
    sueldo_bruto DECIMAL(12,2) NOT NULL,
    area varchar(50) NOT NULL,
    PRIMARY KEY (legajo)
);

CREATE TABLE recibos(
    nro_recibo INT AUTO_INCREMENT NOT NULL,
    mes TINYINT NOT NULL,
    anio SMALLINT NOT NULL,
    sueldo_bruto DECIMAL(12,2) NOT NULL,
    incremento_antiguedad DECIMAL(11,2) NOT NULL,
    ded_jubilacion DECIMAL(11,2) NOT NULL,
    ded_obra_social DECIMAL(11,2) NOT NULL,
    ded_fondo_alta_compl DECIMAL(11,2) NOT NULL,
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

CREATE FUNCTION calcularSueldoNeto(
	sueldo_b DECIMAL(12,2),
    inc_ant DECIMAL(11,2),
    ded_jub DECIMAL(11,2),
    deb_os DECIMAL(11,2),
    ded_fac DECIMAL(11,2))
RETURNS DECIMAL(12,2)
READS SQL DATA
DETERMINISTIC
BEGIN
	DECLARE sueldo_neto DECIMAL(12,2);
	SET sueldo_neto = sueldo_b + inc_ant - ded_jub - deb_os - ded_fac;
    RETURN sueldo_neto;
END//

DELIMITER ;

CREATE VIEW empleadosConAntiguedad
AS
	SELECT e.legajo, e.nombre, e.apellido, e.fecha_nacimiento,
    calcularAntiguedad(e.fecha_ingreso) AS antiguedad,
    e.sueldo_bruto, e.area
    FROM empleados e;
    
CREATE VIEW recibosNetos
AS
	SELECT nro_recibo, legajo_empleado, mes, anio, sueldo_bruto,
    incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl,
    calcularSueldoNeto(sueldo_bruto, incremento_antiguedad, ded_jubilacion,
    ded_obra_social, ded_fondo_alta_compl) as sueldo_neto
    from recibos;

CREATE VIEW sueldosNetosPorArea
AS
	SELECT e.area, sum(sueldo_neto)total,count(sueldo_neto) cantidad_recibos,
    r.anio, r.mes
    from recibosNetos r join empleados e
    on r.legajo_empleado = e.legajo
    group by e.area, r.anio, r.mes
    order by 2 desc;
