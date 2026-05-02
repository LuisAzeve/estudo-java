package br.com.fecaf.model;

public class Moto extends Veiculo{

    private boolean bauCarga;



    //Metodo
    @Override
    public void acelerar() {
        System.out.println("VRAUUUUUUUUUU PAPAPA *MOTO MOTO MOTO*");
    }

    //Get and setter
    public boolean isBauCarga() {
        return bauCarga;
    }

    public void setBauCarga(boolean bauCarga) {
        this.bauCarga = bauCarga;
    }
}
