package br.com.fecaf.model;

import java.util.Arrays;

public class Triangulo {

    //atributos
    public String nome;
    public double base;
    public double ladob;
    public double ladoc;
    public double altura;
    public double area;
    public double perimetro;

    //metodo
    public void exibirInformacoes(){
        System.out.println("/-------------------/");
        System.out.println("O nome do objeto é: " + nome);
        System.out.println("A base é: " + base);
        System.out.println("A ladob é: " + ladob);
        System.out.println("O ladoc é: " + ladoc);
        System.out.println("A altura é: " + altura);
        System.out.println("/-------------------/");
    }

    public Boolean validarTriangulo(){
        if (base + ladob >= ladoc && base + ladoc >= ladob && ladob + ladoc >= base){
            System.out.println("O objeto " + nome + " é um triânqulo");
            return true;
        }
        else {
            System.out.println("o objeto " + nome + " não é um triângulo");
            return false;
    }
    }

    public void calcularArea(){
        area = (base * altura) / 2;
        System.out.println("A aréa do objeto" + nome + " é: " + area);
    }

    public void calculaPerimetro(){
        perimetro = base + ladoc + ladob;
        System.out.println("O perimetro do objeto " + nome + " é: " + perimetro);
    }

    public void definirTipoTriangulo(){
        if (base == ladob && base == ladoc && ladob == ladoc){
            System.out.println("/-------------------/");
            System.out.println("O objeto " + nome + " é um triangulo equilatero");
            System.out.println("/-------------------/");
        } else if (base == ladob || base == ladoc || ladob == ladoc){
            System.out.println("/-------------------/");
            System.out.println("O objeto " + nome + " é um triangulo isoceles");
            System.out.println("/-------------------/");
        } else {
            System.out.println("/-------------------/");
            System.out.println("O objeto " + nome + " é um triangulo escaleno");
            System.out.println("/-------------------/");
        }
    }

    public void definirTrianguloRetangulo(){

        double [] ladosTriangulo = {base, ladob ,ladoc};

        Arrays.sort(ladosTriangulo);

        double cateto1 = ladosTriangulo[0];
        double cateto2 = ladosTriangulo[1];
        double hipotenusa = ladosTriangulo[2];

        if (Math.pow(cateto1, 2) + Math.pow(cateto2, 2) == Math.pow(hipotenusa, 2)){
            System.out.println("/-------------------/");
            System.out.println("Esse triângulo é um triangulo retangulo ");
            System.out.println("/-------------------/");
        } else {
            System.out.println("/-------------------/");
            System.out.println("Esse triângulo não é um triangulo retangulo ");
            System.out.println("/-------------------/");
        }

        }


}
