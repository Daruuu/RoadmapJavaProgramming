package topic4_collections.exersCollection_01.hashset01;

import java.util.HashSet;
import java.util.Random;

public class Boleto {
    private HashSet<Integer> numerosBoletos;

    public Boleto() {
        Random random = new Random();
        numerosBoletos = new HashSet<>();
        while (numerosBoletos.size() < 4) {
            numerosBoletos.add(random.nextInt() * 100);
        }
    }

    public void listarBoletos() {
        for (Integer n : numerosBoletos) {
            System.out.println(n);
        }
    }

    public HashSet<Integer> getNumerosBoletos() {
        return numerosBoletos;
    }

    public void setNumerosBoletos(HashSet<Integer> numerosBoletos) {
        this.numerosBoletos = numerosBoletos;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                ", numerosBoletos=" + numerosBoletos +
                '}';
    }
}
