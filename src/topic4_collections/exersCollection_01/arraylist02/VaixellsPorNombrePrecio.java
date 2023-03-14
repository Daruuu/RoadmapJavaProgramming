package topic4_collections.exersCollection_01.arraylist02;

import java.util.Comparator;

public class VaixellsPorNombrePrecio implements Comparator<Vaixell> {
    @Override
    public int compare(Vaixell o1, Vaixell o2) {

        int compararPorNombre = o1.getNom().compareTo(o2.getNom());

        if (compararPorNombre != 0)
            return compararPorNombre;

        if (o1.getPreu() < o2.getPreu())
            return -1;
        else if (o1.getPreu() > o2.getPreu())
            return -1;
        else
            return 0;
    }
}
