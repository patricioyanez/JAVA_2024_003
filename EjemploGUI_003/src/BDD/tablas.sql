CREATE TABLE Marca(
    id          int primary key auto_increment,
    nombre      varchar(100) not null,
    habilitado  int not null,
    unique(nombre)
);


INSERT INTO Marca (nombre, habilitado) values ('Pepsi', 1);
INSERT INTO Marca (nombre, habilitado) values ('Bilz', 1);
INSERT INTO Marca (nombre, habilitado) values ('Pap', 1);
INSERT INTO Marca (nombre, habilitado) values ('Kem', 1);
INSERT INTO Marca (nombre, habilitado) values ('Coca cola', 1);

