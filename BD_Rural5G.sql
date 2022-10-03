CREATE DATABASE Rural_5G;
USE Rural_5G;

CREATE TABLE Escola(
	id_escola INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL UNIQUE,
    nome_coordenador VARCHAR(110) NOT NULL,
    estado VARCHAR(110) NOT NULL,
    cidade VARCHAR(110) NOT NULL,
    bairro VARCHAR(110) NOT NULL
);

CREATE TABLE Voluntario (
	id_voluntario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(110) NOT NULL,
    formacao VARCHAR(80),
    email VARCHAR(110) NOT NULL UNIQUE,
    celular VARCHAR(11) UNIQUE,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    estado VARCHAR(110) NOT NULL,
    cidade VARCHAR(110) NOT NULL,
    bairro VARCHAR(110) NOT NULL
    
);

CREATE TABLE Doador_pf(
	id_doador_pf INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(110) NOT NULL,
    email VARCHAR(110) NOT NULL UNIQUE,
    celular VARCHAR(11) UNIQUE,
    cpf VARCHAR(11) UNIQUE NOT NULL
);


CREATE TABLE Doador_pj(
	id_doador_pj INT PRIMARY KEY AUTO_INCREMENT, 
    nome VARCHAR(110) NOT NULL,
    email VARCHAR(110) NOT NULL UNIQUE,
    celular VARCHAR(11) UNIQUE,
    cnpj VARCHAR(14) UNIQUE NOT NULL
);

CREATE TABLE Doacao(
	id_doacao INT PRIMARY KEY AUTO_INCREMENT, 
	nome VARCHAR(110) NOT NULL,
    id_escola INT NOT NULL,
    id_doador INT NOT NULL,
    entidade_doador VARCHAR(2) CHECK(entidade_doador = "pf" or entidade_doador ="pj")
    
);

CREATE TABLE Professor(
	id_professor INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(110) NOT NULL,
    email VARCHAR(110) NOT NULL UNIQUE,
    celular VARCHAR(11) UNIQUE,
    cpf VARCHAR(11) UNIQUE NOT NULL, 
    estado VARCHAR(110) NOT NULL,
    cidade VARCHAR(110) NOT NULL,
    bairro VARCHAR(110) NOT NULL,
    materia VARCHAR(110) NOT NULL
);

CREATE TABLE Aluno(
	id_aluno INT PRIMARY KEY AUTO_INCREMENT, 
    nome VARCHAR(110) NOT NULL,
    email VARCHAR(110) NOT NULL UNIQUE,
    celular VARCHAR(11) UNIQUE,
    cpf VARCHAR(11) UNIQUE NOT NULL, 
    estado VARCHAR(110) NOT NULL,
    cidade VARCHAR(110) NOT NULL,
    bairro VARCHAR(110) NOT NULL
);

CREATE TABLE Patrocinador(
	id_patrocinador INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(110) NOT NULL,
    email VARCHAR(110) NOT NULL UNIQUE,
    celular VARCHAR(11) UNIQUE,
    cpf VARCHAR(11) UNIQUE NOT NULL, 
    estado VARCHAR(110) NOT NULL,
    cidade VARCHAR(110) NOT NULL,
    bairro VARCHAR(110) NOT NULL
);
