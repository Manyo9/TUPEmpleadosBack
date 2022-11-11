use db_empleados;

############ EMPLEADOS ############
INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, area) 
VALUES ('David','Martinez', '1985-01-08', '2019-12-20', 123000.00, 'Sistemas'); 		# 1

INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, area) 
VALUES ('Julia','Perez', '1973-02-13', '2020-06-25', 98000.00, 'RRHH'); 			# 2

INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, area) 
VALUES ('George','Smith', '1962-02-11', '2010-03-01', 150500.00, 'Administacion'); 		# 3

INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, area) 
VALUES ('Sofía','Marquez', '1995-07-23', '2021-08-06', 100600.00, 'Sistemas'); 		# 4

############ RECIBOS ############
### EMPLEADO 1
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (1, 1, 2022, 110000.00, 10.00, 5.00, 7.50, 3.50);	 # 1
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (1, 2, 2022, 113000.00, 10.00, 5.00, 7.50, 3.50);	 # 2
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (1, 3, 2022, 116300.00, 10.00, 5.00, 7.50, 3.50);	 # 3

### Empleado 2
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (2, 1, 2022, 90000.00, 8.00, 4.90, 8.50, 3.20);	 # 1
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (2, 2, 2022, 91000.00, 8.50, 5.00, 8.50, 3.20);	 # 2
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (2, 3, 2022, 93300.00, 8.50, 5.00, 8.50, 3.20);	 # 3

### Empleado 3
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (3, 1, 2022, 145120.00, 15.00, 8.00, 10.00, 5.25);	 # 1
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (3, 2, 2022, 146200.00, 15.50, 8.00, 10.00, 5.50);	 # 2
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (3, 3, 2022, 147350.00, 15.50, 8.10, 10.50, 6.00);	 # 3
