package examenuf05.problema01;

public class Ordenador {
    private String mac;
    private String modelo;
    private int precio;

    public Ordenador() {
    }

    public Ordenador(String mac, String modelo, int precio) {
        this.mac = mac;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "mac='" + mac + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
