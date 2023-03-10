package examenpoo.problema01;

public class Moto extends Vehiculo {
    private int kmsFet;
    private int kmsFetGasoil;

    public Moto() {
    }

    public Moto(int kmsFet, int kmsFetGasoil) {
        this.kmsFet = kmsFet;
        this.kmsFetGasoil = kmsFetGasoil;
    }

    public Moto(String model, int velocidad, int precioCompra, boolean vendido, int kmsFet, int kmsFetGasoil) {
        super(model, velocidad, precioCompra, vendido);
        this.kmsFet = kmsFet;
        this.kmsFetGasoil = kmsFetGasoil;
    }

    public int getKmsFet() {
        return kmsFet;
    }

    public void setKmsFet(int kmsFet) {
        this.kmsFet = kmsFet;
    }

    public int getKmsFetGasoil() {
        return kmsFetGasoil;
    }

    public void setKmsFetGasoil(int kmsFetGasoil) {
        this.kmsFetGasoil = kmsFetGasoil;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "kmsFet=" + kmsFet +
                ", kmsFetGasoil=" + kmsFetGasoil +
                '}';
    }
}
