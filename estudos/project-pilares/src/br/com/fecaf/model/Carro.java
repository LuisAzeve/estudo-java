package br.com.fecaf.model;

public class Carro extends Veiculo {

    Veiculo carro1 = new Veiculo();

    //Metodo


    @Override
    public void acelerar() {
        System.out.println("VRUM VRUM som de carro");
    }
}
