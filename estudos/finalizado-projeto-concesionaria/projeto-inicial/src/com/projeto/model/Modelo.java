package com.projeto.model;

public class Modelo {

    //atributo
    private int idModelo;
    private String nome;
    private int marca_FK;

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMarca_FK() {
        return marca_FK;
    }

    public void setMarca_FK(int marca_FK) {
        this.marca_FK = marca_FK;
    }
}
