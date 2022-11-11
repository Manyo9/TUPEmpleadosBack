create database empleados;
use empleados;

create table areas(
id smallint auto_increment not null,
nombre varchar(50) not null,
primary key (id)
);

create table empleados(
legajo int auto_increment not null,
nombre varchar(32) not null,
apellido varchar(32) not null,
fechaNacimiento date not null,
fechaIngreso date not null,
sueldoBruto decimal(9,2) not null,
idArea smallint not null,
primary key (legajo),
foreign key (idArea) references areas (id)
);

create table recibos(
nroRecibo int auto_increment not null,
mes tinyint not null,
anio smallint not null,
sueldoBruto decimal(9,2) not null,
incrementoAntiguedad decimal(5,2) not null,
dedJubilacion decimal(5,2) not null,
dedObraSocial decimal(5,2) not null,
dedFondoAltaCompl decimal(5,2) not null,
legajoEmpleado int not null, 
primary key (nroRecibo),
foreign key (legajoEmpleado) references empleados (legajo)
);