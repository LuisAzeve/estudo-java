package br.com.fecaf;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

public class Geometria {
    public static void main(String[] args) {

        //instanciar objeto retangulo
        Retangulo retangulo1 = new Retangulo();

        retangulo1.nome = "retangulo1";
        retangulo1.lado1 = 4;
        retangulo1.lado2 = 4;

        retangulo1.exibirInformacoes();
        retangulo1.validarRetanguloEspecial();

        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();


        //intanciando objeto 2

        Retangulo retangulo2 = new Retangulo();

        retangulo2.nome = "Retangulo2";
        retangulo2.lado1 = 10;
        retangulo2.lado2 = 5;

        retangulo2.exibirInformacoes();
        retangulo2.validarRetanguloEspecial();

        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();

        //Intanciar objeto circulo
        Circulo circulo1 = new Circulo();

        circulo1.nome = "circulo1";
        circulo1.raio = 10;

        circulo1.exibirInformacoes();

        circulo1.calcularArea();
        circulo1.calcularDiametro();
        circulo1.calcularPerimetro();

        //instanciando triangulo

        Triangulo triangulo1 = new Triangulo();

        triangulo1.nome = "Triangulo1";
        triangulo1.base = 12;
        triangulo1.ladob = 9;
        triangulo1.ladoc = 15;
        triangulo1.altura = 8;

        boolean validaTriangulo = triangulo1.validarTriangulo();
        if (validaTriangulo) {
            triangulo1.exibirInformacoes();
            triangulo1.calcularArea();
            triangulo1.calculaPerimetro();
            triangulo1.definirTipoTriangulo();
            triangulo1.definirTrianguloRetangulo();
        }
    }
}
