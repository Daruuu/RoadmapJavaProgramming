package topic4_collections.hashset01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SacoBolas {
    private HashSet<Integer> sacoBolas;

    public SacoBolas() {
        sacoBolas = new HashSet<>();
        int i = 0;
        while (i <= 100) {
            sacoBolas.add(i);
//            System.out.printf("%d ", i);
            i++;
        }
    }

    public SacoBolas(HashSet<Integer> sacoBolas) {
        this.sacoBolas = sacoBolas;
    }

    public HashSet<Integer> getSacoBolas() {
        return sacoBolas;
    }

    public void setSacoBolas(HashSet<Integer> sacoBolas) {
        this.sacoBolas = sacoBolas;
    }

    public HashSet<Integer> extraerBolas(int n) {
        Random random = new Random();
        HashSet<Integer> numerosBolasExtraidas = new HashSet<>();

        while (numerosBolasExtraidas.size() < n) {
            int bola = random.nextInt(101);
            if (sacoBolas.contains(bola)) {
                numerosBolasExtraidas.add(bola);
                sacoBolas.remove(bola);
            }
        }
        return numerosBolasExtraidas;
    }

    // si el saco no esta vacio
    // creamos un iterador para recorrer el hasset del saco de bolas
    // interamos por cada elemento del saco
    // lo eliminamos del saco si es que coincide con alguna bola
    // retornamos la bola extraida o -1 si esta vacio
    public int extraerUnaBola() {
        int bola = -1;
        if (!sacoBolas.isEmpty()) {
            Iterator<Integer> it = sacoBolas.iterator();
            bola = it.next();
            it.remove();
        }
        return bola;
    }

    @Override
    public String toString() {
        return "SacoBolas{" +
                "bolas=" + sacoBolas +
                '}';
    }
}
