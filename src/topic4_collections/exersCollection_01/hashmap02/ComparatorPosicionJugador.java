package topic4_collections.exersCollection_01.hashmap02;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPosicionJugador implements Comparator<Map.Entry<Dorsal, Jugador>> {
    @Override
    public int compare(Map.Entry<Dorsal, Jugador> o1, Map.Entry<Dorsal, Jugador> o2) {
        return o1.getValue().getPosicion().compareTo(o2.getValue().getPosicion());
    }
}
