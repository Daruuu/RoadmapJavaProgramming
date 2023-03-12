package topic4_collections.exersCollection_01.hashmap01;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;

public class ClaseGenerica<T> implements Iterable<T> {

    private HashMap<String, T> mapa;

    public ClaseGenerica(HashMap<String, T> mapa) {
        this.mapa = mapa;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
