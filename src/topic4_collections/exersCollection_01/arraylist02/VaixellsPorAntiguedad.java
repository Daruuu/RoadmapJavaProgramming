package topic4_collections.exersCollection_01.arraylist02;

import java.util.Comparator;

public class VaixellsPorAntiguedad implements Comparator<Vaixell> {
    @Override
    public int compare(Vaixell o1, Vaixell o2) {
        return o1.compareTo(o2);
    }
}
