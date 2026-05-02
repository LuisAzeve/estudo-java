package br.com.fecaf.model;

import java.util.Scanner;

public class Veiculo {

    //Encapsulada
    private String modelo,marca;
    private int ano;

    Scanner scanner = new Scanner(System.in);

    //Atributo




    //metodo

    public void acelerar(){
        System.out.println("Som de acelerar aleatório");
    }





    //Get and setter
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
