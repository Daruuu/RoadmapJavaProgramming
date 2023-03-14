package topic4_collections.exersCollection_01.arraylist02;

import java.util.Comparator;

public class VaixellsPorAntiguedad implements Comparator<Vaixell> {
    @Override
    public int compare(Vaixell o1, Vaixell o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());
    }
/*
        if (o1.getEdad() > o2.getEdad())
            return 1;
        else if (o1.getEdad()< o2.getEdad())
            return -1;
        else
            return 0;
*/
}