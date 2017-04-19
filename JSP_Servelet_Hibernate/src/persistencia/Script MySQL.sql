DROP DATABASE javaAula6;
CREATE DATABASE javaAula6;
USE javaAula6;

CREATE TABLE tbcliente(
	idcliente 	INT				PRIMARY KEY AUTO_INCREMENT,
	nome		VARCHAR(30)		NOT NULL,
	email		VARCHAR(30)		NOT NULL	UNIQUE,
	cpf			VARCHAR(30)		NOT NULL	UNIQUE,
	sexo		CHAR			NOT NULL,
	dataNasc	DATE			NOT NULL,
	qtdDep		INT				NOT NULL);
	
	DESC tbcliente;
	
