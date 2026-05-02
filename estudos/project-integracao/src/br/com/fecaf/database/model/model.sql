create database db_java;
use db_java;

CREATE TABLE departamento (
                              idDepartamento int not null auto_increment,
                              nome varchar (45) not null,
                              sigla varchar(45) not null,
                              PRIMARY KEY (idDepartamento)
);

CREATE TABLE funcionario(
                            idFuncionario int not null,
                            nome varchar(45) not null,
                            matricula int not null,
                            departamento_FK int,
                            CONSTRAINT FK_Departamento FOREIGN KEY (departamento_FK) REFERENCES departamento (idDepartamento)
);

insert into departamento(nome, sigla) values
                                          ("Desenvolvimento","DEV"),
                                          ("Qualidade","QA"),
                                          ("Engenharia","ENG");

insert into funcionario(idFuncionario, nome, matricula,departamento_FK) values
                                                                            (1,"João",59004345,2),
                                                                            (2,"Maria",59005555,3),
                                                                            (3,"Fernando",59004545,1);


