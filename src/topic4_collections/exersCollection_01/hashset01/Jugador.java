package topic4_collections.exersCollection_01.hashset01;

public class Jugador {
    private String dni;
    private Boleto boleto;

    public Jugador() {
    }

    public Jugador(String dni, Boleto boleto) {
        this.dni = dni;
        this.boleto = boleto;
    }

    public Jugador(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dni='" + dni + '\'' +
                ", boleto=" + boleto +
                '}';
    }
}
