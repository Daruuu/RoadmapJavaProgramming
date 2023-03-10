package examenpoo.problema01;

public class Vehiculo {
    private String model;
    private int velocidad;
    private int precioCompra;
    private boolean vendido;

    public Vehiculo() {
    }

    public Vehiculo(String model, int velocidad, int precioCompra, boolean vendido) {
        this.model = model;
        this.velocidad = velocidad;
        this.precioCompra = precioCompra;
        this.vendido = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "model='" + model + '\'' +
                ", velocidad=" + velocidad +
                ", precioCompra=" + precioCompra +
                ", vendido=" + vendido +
                '}';
    }


}
