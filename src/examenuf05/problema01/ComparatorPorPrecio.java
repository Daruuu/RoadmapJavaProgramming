package examenuf05.problema01;

import java.util.Comparator;

public class ComparatorPorPrecio implements Comparator<Ordenador> {
    @Override
    public int compare(Ordenador o1, Ordenador o2) {
        return Integer.compare(o1.getPrecio(), o2.getPrecio());
    }
}
