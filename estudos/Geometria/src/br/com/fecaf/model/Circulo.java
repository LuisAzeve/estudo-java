package br.com.fecaf.model;

public class Circulo {

    //atributos
    public String nome;
    public double diametro;
    public double raio;
    public double area;
    public double perimetro;


    //metodo

    public void exibirInformacoes(){
        System.out.println("/---------------------/");
        System.out.println("O nome do objeto é: " + nome);
        System.out.println("O raio do objeto é: " + raio);
        System.out.println("/---------------------/");
    }

    public void calcularDiametro(){
        diametro = raio * 2;
        System.out.println("O diametro do objeto " + nome + " é: " + diametro);
    }

    public void calcularArea(){
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do objeto " + nome + " é: " + area);
    }
    public void calcularPerimetro(){
        perimetro = 2 * Math.PI * raio;
        System.out.println("O perimetro do objeto " + nome + " é: " + perimetro);
    }

}
