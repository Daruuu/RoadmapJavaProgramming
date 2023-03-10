package examenpoo.problema01;

import examenpoo.problema02.Venda;

public class Autobus extends Vehiculo {
    private int numPlaces;

    public Autobus() {
    }

    public Autobus(int numPlaces) {
        this.numPlaces = numPlaces;
    }

    public Autobus(String model, int velocidad, int precioCompra, boolean vendido, int numPlaces) {
        super(model, velocidad, precioCompra, vendido);
        this.numPlaces = numPlaces;
    }

    public int getNumPlaces() {
        return numPlaces;
    }

    public void setNumPlaces(int numPlaces) {
        this.numPlaces = numPlaces;
    }

    @Override
    public void realitzaVenda() {
        int nuevoPresupuestoStock = 0;
        nuevoPresupuestoStock += this.getPrecioCompra();
        setPrecioCompra(nuevoPresupuestoStock);
        setVendido(true);

    }

    @Override
    public String toString() {
        return "Autobus{" +
                "numPlaces=" + numPlaces +
                '}';
    }
}
