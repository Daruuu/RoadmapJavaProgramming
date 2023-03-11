package topic4_collections.exersCollection_01.hashset01;

import java.util.HashSet;

public class Jugador {
    private String dni;
    private HashSet<Integer> boleto;

    public Jugador() {
        this.boleto = new HashSet<>(4);
    }

    public Jugador(String dni, HashSet<Integer> boleto) {
        this.dni = dni;
        this.boleto = new HashSet<>(4);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public HashSet<Integer> getBoleto() {
        return boleto;
    }

    public void setBoleto(HashSet<Integer> boleto) {
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
