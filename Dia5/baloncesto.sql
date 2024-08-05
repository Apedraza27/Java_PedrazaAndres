use b7fc9nohtrp1anharl2f;

-- Crear tabla partido
create table partido(
    id int AUTO_INCREMENT PRIMARY KEY,
    equipoLocal varchar(225),
    equipoVisitante varchar(225),
    cestasLocal int,
    cestasVisitante int,
    partido enum("Finalizado", "No finalizado"),
    fechaPartido date 
);

-- Crear tabla liga
create table liga (
    id int AUTO_INCREMENT PRIMARY KEY,
    id_partido int,
    Foreign Key (id_partido) REFERENCES partido(id),
    jornada int
);

-- Crear tabla playoffs
create table playoffs (
    id int AUTO_INCREMENT PRIMARY KEY,
    id_partido int,
    Foreign Key (id_partido) REFERENCES partido(id),
    ronda enum("Octavos", "Cuartos", "Final")
);