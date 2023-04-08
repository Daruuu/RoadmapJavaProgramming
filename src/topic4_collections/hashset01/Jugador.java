package topic4_collections.hashset01;

import java.util.HashSet;

public class Jugador {
    private String dni;
    private Boleto boleto;

    public Jugador() {
    }

    public Jugador(String dni, Boleto boleto) {
        this.dni = dni;
        this.boleto = boleto;
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

    public boolean esGanadorJugador(HashSet<Integer> bolasSaco) {
        return boleto.esGanador(bolasSaco);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dni='" + dni + '\'' +
                ", boleto=" + boleto +
                '}';
    }
}
