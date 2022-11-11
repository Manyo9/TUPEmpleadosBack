use db_empleados;

############ AREAS ############

INSERT INTO areas (nombre) VALUES ('Sistemas'); 		# 1
INSERT INTO areas (nombre) VALUES ('RRHH'); 			# 2
INSERT INTO areas (nombre) VALUES ('Administración'); 	# 3

############ EMPLEADOS ############
INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, id_area) 
VALUES ('David','Martinez', '1985-01-08', '2019-12-20', 123000.00, 1); 		# 1

INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, id_area) 
VALUES ('Julia','Perez', '1973-02-13', '2020-06-25', 98000.00, 2); 			# 2

INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, id_area) 
VALUES ('George','Smith', '1962-02-11', '2010-03-01', 150500.00, 3); 		# 3

INSERT INTO empleados (nombre, apellido, fecha_nacimiento, fecha_ingreso, sueldo_bruto, id_area) 
VALUES ('Sofía','Marquez', '1995-07-23', '2021-08-06', 100600.00, 1); 		# 4

############ RECIBOS ############
### EMPLEADO 1
-- INSERT INTO recibos (legajo_empleado, mes, anio, sueldo_bruto, incremento_antiguedad, deb_jubilacion,
-- deb_obra_social, deb_fondo_alta_compl) VALUES (1, '01','2022','110000.00','','','');			 # 1


