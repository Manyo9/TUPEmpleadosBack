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
VALUES (1, 1, 2022, 110000, 11000, 5500.50, 18250.34, 3850.53);	 # 1
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (1, 2, 2022, 113000.00, 11300, 5678.36, 18336.01, 3985.36);	 # 2
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (1, 3, 2022, 116300.00, 11630, 5852.22, 18450.33, 4036.44);	 # 3

### Empleado 2
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (2, 1, 2022, 90000.00, 8000.00, 4500.15, 12580.33, 1350.48);	 # 4
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (2, 2, 2022, 91000.00, 8100.25, 4555.55, 12601.10, 1360.53);	 # 5
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (2, 3, 2022, 93300.00, 8233.33, 2623.03, 12650.00, 1401.69);	 # 6

### Empleado 3
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (3, 1, 2022, 145120.00, 20100.50, 9112.23, 16300.00, 2223.56);	 # 7
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (3, 2, 2022, 146200.00, 20320.36, 9162.60, 16325.00, 2250.36);	 # 8
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (3, 3, 2022, 147350.00, 21003.30, 9210.01, 16402.96, 2320.74);	 # 9

### Empleado 4
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (4, 1, 2022, 95120.00, 9100.50, 5102.25, 10310.00, 1563.16);	 # 10
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (4, 2, 2022, 97200.00, 9320.36, 5132.67, 10321.00, 1557.31);	 # 11
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (4, 3, 2022, 98050.00, 9003.30, 5220.81, 10412.96, 1571.61);	 # 12

### Recibos del 2021
INSERT INTO recibos 
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (1, 12, 2021, 107000, 10700, 5463.55, 17250.34, 3780.55);				# 13
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (2, 12, 2021, 87930.00, 8000.00, 4459.16, 12580.33, 1301.48);	 		# 14
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (3, 12, 2021, 142350.00, 20100.50, 9052.23, 15908.00, 2183.56);	 		# 15
INSERT INTO recibos
(legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, ded_jubilacion, ded_obra_social, ded_fondo_alta_compl)
VALUES (4, 12, 2021, 92320.00, 9100.50, 5022.25, 10210.00, 1453.16);			# 16