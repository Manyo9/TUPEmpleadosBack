use Empleados;

############ AREAS ############

INSERT INTO Areas (nombre) VALUES ('Sistemas'); 		# 1
INSERT INTO Areas (nombre) VALUES ('RRHH'); 			# 2
INSERT INTO Areas (nombre) VALUES ('Administración'); 	# 3

############ EMPLEADOS ############
INSERT INTO Empleados (nombre, apellido, fechaNacimiento,  fechaIngreso, sueldoBruto, idArea) 
VALUES ('David','Martinez', '08/01/1985', '20/12/2019', 123000.00, 1); # 1

INSERT INTO Empleados (nombre, apellido, fechaNacimiento,  fechaIngreso, sueldoBruto, idArea) 
VALUES ('Julia','Perez', '13/02/1973', '25/06/2020', 98000.00, 2); # 2

INSERT INTO Empleados (nombre, apellido, fechaNacimiento,  fechaIngreso, sueldoBruto, idArea) 
VALUES ('George','Smith', '02/11/1962', '01/03/2010', 150500.00, 3); # 3

INSERT INTO Empleados (nombre, apellido, fechaNacimiento,  fechaIngreso, sueldoBruto, idArea) 
VALUES ('Sofía','Marquez', '23/07/1995', '06/08/2021', 100600.00, 1); # 4

############ RECIBOS ############