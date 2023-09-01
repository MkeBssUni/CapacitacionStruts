CREATE DATABASE capacitacion;
USE capacitacion;

CREATE TABLE people (
idPerson int PRIMARY KEY AUTO_INCREMENT, 
name VARCHAR(250) NOT NULL,
lastname VARCHAR(250) NOT NULL,
surname VARCHAR(250),
gender CHAR,
birthdate VARCHAR(250)
);

CREATE TABLE users (
idUser int PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(250) NOT NULL,
status BOOLEAN DEFAULT true,
idPerson int NOT NULL,
FOREIGN KEY (idPerson) REFERENCES people (idPerson)
);

CREATE TABLE roles(
idRol int PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(250) NOT NULL,
description VARCHAR(250)
);

CREATE TABLE users_has_roles(
idUserRol int PRIMARY KEY AUTO_INCREMENT,
idUser int NOT NULL,
idRol int NOT NULL,
FOREIGN KEY (idUser) REFERENCES users (idUser),
FOREIGN KEY (idRol) REFERENCES roles (idRol)
);

CREATE TABLE posts(
idPost int PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(250),
description VARCHAR(250),
image BLOB,
reactions int DEFAULT 0,
idUser int NOT NULL,
FOREIGN KEY (idUser) REFERENCES users (idUser)
);