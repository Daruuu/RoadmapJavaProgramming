package topic4_collections.exersCollection_01.hashset01;

import java.util.HashSet;
import java.util.Random;

public class Boleto {
    private HashSet<Integer> numerosBoletos;

    public Boleto() {
        Random random = new Random();
        numerosBoletos = new HashSet<>();
        while (numerosBoletos.size() < 4) {
            numerosBoletos.add(random.nextInt(101) * 100);
        }
    }

    public HashSet<Integer> getNumerosBoletos() {
        return numerosBoletos;
    }

    public void setNumerosBoletos(HashSet<Integer> numerosBoletos) {
        this.numerosBoletos = numerosBoletos;
    }

    public void listarBoletos() {
        for (Integer n : numerosBoletos) {
            System.out.println(n);
        }
    }

    public boolean comprobarBoleto(HashSet<Integer> bolas) {
        boolean ganador = true;
        for (Integer n : numerosBoletos) {
            if (!bolas.contains(n)) {
                ganador = false;
                break;
            }
        }
        return ganador;
    }

    // gano si un boleto tiene los 4 nuermos
    public boolean esGanador(HashSet<Integer> bolas) {
        return bolas.containsAll(numerosBoletos);
    }

    @Override
    public String toString() {
        return "Boleto{" +
                ", numerosBoletos=" + numerosBoletos +
                '}';
    }
}
