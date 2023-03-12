package topic4_collections.exersCollection_01.hashmap01;

public class Movil {
    private String marca;
    private String modelo;
    private int numero;

    public Movil() {
    }

    public Movil(String marca, String modelo, int numero) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numero=" + numero +
                '}';
    }
}