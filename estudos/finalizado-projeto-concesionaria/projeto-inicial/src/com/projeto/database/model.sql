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

##Inserts caso deseje começar já consultando algo
INSERT INTO marca (nome) VALUES ('Fiat'), ('Chevrolet'), ('Toyota');

INSERT INTO modelo (nome, marca_FK) VALUES
                                        ('Uno', 1),
                                        ('Argo', 1),
                                        ('Onix', 2),
                                        ('Cruze', 2),
                                        ('Corolla', 3),
                                        ('Hilux', 3);

INSERT INTO veiculo (modelo_FK, ano, cor, quilometragem, preco, status) VALUES
                                                                            (1, 2018, 'Branco', 80000, 28000.00, 'disponivel'),
                                                                            (2, 2021, 'Prata', 35000, 62000.00, 'disponivel'),
                                                                            (3, 2020, 'Preto', 50000, 55000.00, 'vendido'),
                                                                            (4, 2022, 'Cinza', 20000, 98000.00, 'disponivel'),
                                                                            (5, 2019, 'Branco', 60000, 85000.00, 'disponivel'),
                                                                            (6, 2023, 'Vermelho', 10000, 220000.00, 'disponivel');



##Caso necessite testar os insets e deletes do banco pode executar os SELECTS abaixo

SELECT * from marca;
SELECT * from veiculo;
SELECT * from modelo;