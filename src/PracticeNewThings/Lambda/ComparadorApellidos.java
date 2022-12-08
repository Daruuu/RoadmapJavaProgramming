package PracticeNewThings.Lambda;

import java.util.Comparator;

public class ComparadorApellidos implements Comparator<Persona> {
// es el mismo comparador pero usando COmparator
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getApellidos().compareTo(p2.getApellidos());
    }
}
