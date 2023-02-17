package topic3_objectorientedprogramming.abstracta03.exer01;

public class Bicicletas extends Transports{
    private int numMarchas;

    public Bicicletas() {
    }

    @Override
    public int precioPagarUsuarioKm(int distanciaKm) {
        return 0;
    }

    public Bicicletas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

}
