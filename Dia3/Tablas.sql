use b7fc9nohtrp1anharl2f;

-- Crear tabla persona
create table persona(
	id_persona int primary key, -- auto
    nombre varchar(100),
    apellidos varchar(100),
    direccion varchar(255)
);

-- Crear tabla hospital 
create table hospital(
	id_hospital int primary key,
    nombre varchar(100),
    direccion varchar(255)
);


-- Crear tabla pabellon 
create table pabellon(
	id_pabellon int primary key,
    nombre varchar(100),
    capacidad int,
    id_hospital int,
    foreign key(id_hospital) references hospital(id_hospital)
);

-- Crear tabla paciente
create table paciente(
	id_paciente int primary key,
    edad int,
    fecha_nacimiento date,
    fecha_ingreso_hospital date,
    id_pabellon int,
    foreign key(id_pabellon) references pabellon(id_pabellon)
);

-- Crear tabla departamento 
create table departamento(
	id_departamento int primary key,
    id_hospital int,
    foreign key(id_hospital) references hospital(id_hospital)
);

-- Crear tabla personal_hospital
create table personal_hospital(
	id_personal_hospital int primary key,
    fecha_vinculacion date,
    salario int,
    tipo enum('Administrativo', 'Tecnico', 'Operaciones'),
    id_persona int,
    foreign key(id_persona) references persona(id_persona),
    id_hospital int,
    foreign key(id_hospital) references hospital(id_hospital)
);

-- Crear tabla doctores
create table doctores(
	id_doctores int,
    tipo enum('Asociado', 'Junior'),
    id_personal_hospital int,
    foreign key(id_personal_hospital) references personal_hospital(id_personal_hospital)
);

insert into persona values(1, "Andres", "Pedraza", "Cra 2e #27b");

show tables;