CREATE DATABASE db_automotivo;
USE db_automotivo;

CREATE TABLE marca (
    idMarca INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL
);

CREATE TABLE modelo (
    idModelo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    marca_FK INT NOT NULL,
    FOREIGN KEY (marca_FK) REFERENCES marca(idMarca)
);


CREATE TABLE veiculo (
    idVeiculo INT AUTO_INCREMENT PRIMARY KEY,
    modelo_FK INT NOT NULL,
    ano INT NOT NULL,
    cor VARCHAR(45) NOT NULL,
    preco DOUBLE NOT NULL,
    quilometragem INT NOT NULL,
    status VARCHAR(30) NOT NULL,
    FOREIGN KEY (modelo_FK) REFERENCES modelo(idModelo)
);