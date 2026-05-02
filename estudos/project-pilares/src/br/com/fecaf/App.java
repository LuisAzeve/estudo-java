package br.com.fecaf;

import br.com.fecaf.model.Carro;
import br.com.fecaf.model.Moto;
import br.com.fecaf.model.Veiculo;

public class App {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.acelerar();


        Moto moto1 = new Moto();
        moto1.acelerar();

        Veiculo desconhecido = new Veiculo();
        desconhecido.acelerar();

    }
}
