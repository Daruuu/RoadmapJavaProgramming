package practiceNewThings.lambda.Ejemplo1;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Persona> {
// es el mismo comparador pero usando COmparator
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
