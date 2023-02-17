package topic3_objectorientedprogramming.abstracta03.exer01;

public class Metros extends Transports {
    private double precioBillete;
    private int plusPrecio;

    public Metros(double precioBillete, int plusPrecio) {
        this.precioBillete = precioBillete;
        this.plusPrecio = plusPrecio;
    }

    public double getPrecioBillete() {
        return precioBillete;
    }

    public void setPrecioBillete(double precioBillete) {
        this.precioBillete = precioBillete;
    }

    public int getPlusPrecio() {
        return plusPrecio;
    }

    public void setPlusPrecio(int plusPrecio) {
        this.plusPrecio = plusPrecio;
    }

    @Override
    public int precioPagarUsuarioKm(int distanciaKm) {
        return 0;
    }
}
