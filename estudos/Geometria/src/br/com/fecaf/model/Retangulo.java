package br.com.fecaf.model;

public class Retangulo {

    //atributos
        public int lado1, lado2;
        public double area;
        public double perimetro;
        public String nome;


    //metodo

    public void exibirInformacoes (){
        System.out.println("/-----------------/");
        System.out.println("O nome é: " + nome);
        System.out.println("O lado1 é: " + lado1);
        System.out.println("O lado2 é: " + lado2);
        System.out.println("/-----------------/");
    }

    public void calcularArea(){
        area = lado1 * lado2;
        System.out.println("A area do objeto " + nome + " é: " + area);
    }

    public void calcularPerimetro(){
        perimetro = (2 * lado1) + (2 * lado2);
        System.out.println("O perimetro do objeto " + nome + " é: " + perimetro);
    }

    public void validarRetanguloEspecial(){
        if (lado1 == lado2){
            System.out.println("o objeto " + nome + " é um retangulo especial (Quadrado) ...");
        }
        else {
            System.out.println("o objeto " + nome + " não é um retangulo especial ...");
        }
    }



}

