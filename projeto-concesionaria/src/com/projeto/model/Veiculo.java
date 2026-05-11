package com.projeto.model;

public class Veiculo {

    //atributos
    private int idVeiculo;
    private int modelo_FK;
    private int ano;
    private String cor;
    private double preco;
    private int km;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getModelo_FK() {
        return modelo_FK;
    }

    public void setModelo_FK(int modelo_FK) {
        this.modelo_FK = modelo_FK;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
}
