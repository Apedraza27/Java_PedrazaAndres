use b7fc9nohtrp1anharl2f;

Create table producto(
	id int primary key,
    nombre varchar(250),
    precio decimal(10,2)
);

create table cliente(
	id int primary key,
    tipo varchar(250),
    nombre varchar(250)
);

create table factura(
	id int primary key,
    total decimal(10,2),
    id_cliente int,
    foreign key(id_cliente) references cliente(id)
);

create table factura_almacenada(
	cantidad int,
	id_factura int,
    foreign key(id_factura) references factura(id),
    id_producto int,
    foreign key(id_producto) references producto(id)
);