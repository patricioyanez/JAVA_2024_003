CREATE TABLE Sello
(
    idSello             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);

CREATE TABLE Cargo
(
    idCargo             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);


CREATE TABLE Persona
(
    idPersona           int             primary key auto_increment,
    idCargo             int             null,  -- colaboracion
    rut                 int             not null,
    digito              varchar(1)      not null,
    nombre              varchar(50)     not null,
    apellido            varchar(50)     not null,
	direccion			varchar(100)	not null,
	
    sueldo              int             null,  -- empleado
	descuento			int				null, --  cliente

	habilitado			int 			not null,
    UNIQUE(rut),
    FOREIGN KEY(idCargo)
                    REFERENCES Cargo(idCargo)
);


CREATE TABLE Produccion
(
    idProduccion        int             primary key auto_increment,
    idSello           	int             not null, -- colaboracion
    nombre             	varchar(100)	not null,
    anioEstreno      	int             not null,
    formato             varchar(100)    not null,
    precio      		int             not null,
    
	temporadas       	int             null, -- serie
	capitulos       	int             null, -- serie
	duracion       		int             null, -- serie y pelicula
    clasificacion       varchar(100)    null, -- pelicula
    UNIQUE(nombre),

    FOREIGN KEY(idSello)
                    REFERENCES Sello(idSello)
);