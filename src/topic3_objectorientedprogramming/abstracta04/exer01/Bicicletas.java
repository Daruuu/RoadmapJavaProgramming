package topic3_objectorientedprogramming.abstracta04.exer01;

public class Bicicletas extends Transports{
    private int numMarchas;

    public Bicicletas(int id, int velocidadActualKMH, int numMarchas) {
        super(id, velocidadActualKMH);
        this.numMarchas = numMarchas;
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

    @Override
    public String toString() {
        return "Bicicletas{" +
                "numMarchas=" + numMarchas +
                '}';
    }
}
