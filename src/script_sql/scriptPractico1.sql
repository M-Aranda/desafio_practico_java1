CREATE DATABASE bd_criminales;

USE bd_criminales;

CREATE TABLE criminal(
ID INT AUTO_INCREMENT,
nombre VARCHAR (30),
apellido VARCHAR (30),
sexo VARCHAR (15),
nacionalidad VARCHAR (20),
rutChileno VARCHAR (15),
estado VARCHAR (20),
PRIMARY KEY(ID)
);

TRUNCATE criminal;

SELECT * FROM criminal;


DROP DATABASE bd_criminales;