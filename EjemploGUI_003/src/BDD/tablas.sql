CREATE TABLE Marca(
    id          int primary key auto_increment,
    nombre      varchar(100) not null,
    habilitado  int not null,
    unique(nombre)
);


-- crear CRUD para la tabla categoria
CREATE TABLE Categoria(
    id          int primary key auto_increment,
    nombre      varchar(100) not null,
    habilitado  int not null,
    unique(nombre)
);


CREATE TABLE Producto(
    id          int primary key auto_increment,
    idMarca     int             not null,
    idCategoria int             not null,
    codigo      bigint          not null,
    descripcion varchar(100)    not null,
    stock       int             not null,
    precioCosto int             not null,
    precioVenta int             not null,
    UNIQUE(codigo),
    FOREIGN KEY (idMarca)
        REFERENCE Marca(id),
    FOREIGN KEY (idCategoria)
        REFERENCE Categoria(id)
);


INSERT INTO Marca (nombre, habilitado) values ('Pepsi', 1);
INSERT INTO Marca (nombre, habilitado) values ('Coca Cola', 1);
INSERT INTO Marca (nombre, habilitado) values ('Bilz', 1);
INSERT INTO Marca (nombre, habilitado) values ('Pap', 1);

INSERT INTO Categoria (nombre, habilitado) values ('Bebidas', 1);
INSERT INTO Categoria (nombre, habilitado) values ('Alimentos', 1);
INSERT INTO Categoria (nombre, habilitado) values ('Perfumeria', 1);

