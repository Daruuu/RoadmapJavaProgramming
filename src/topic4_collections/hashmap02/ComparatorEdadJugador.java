package topic4_collections.hashmap02;

import java.util.Comparator;
import java.util.Map;

public class ComparatorEdadJugador implements Comparator<Map.Entry<Dorsal, Jugador>> {

    @Override
    public int compare(Map.Entry<Dorsal, Jugador> j1, Map.Entry<Dorsal, Jugador> j2) {
        return Integer.compare(j1.getValue().getEdad(), j2.getValue().getEdad());
    }
}
