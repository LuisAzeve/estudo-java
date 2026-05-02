package br.com.fecaf;
import br.com.fecaf.model.Imc;

public class AppIMC {
    static void main(String[] args) {

        //instanciar IMC
        Imc objImc = new Imc();

        objImc.peso = 80;
        objImc.altura = 1.83;

        objImc.calcularImc();
        objImc.statusImc();
    }
}

