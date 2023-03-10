package examenpoo.problema01;

public class Cotxe extends Vehiculo {
    private int kms;
    private String pais;

    public Cotxe() {
    }

    public Cotxe(int kms, String pais) {
        this.kms = kms;
        this.pais = pais;
    }

    public Cotxe(String model, int velocidad, int precioCompra, boolean vendido, int kms, String pais) {
        super(model, velocidad, precioCompra, vendido);
        this.kms = kms;
        this.pais = pais;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "kms=" + kms +
                ", pais='" + pais + '\'' +
                '}';
    }
}
