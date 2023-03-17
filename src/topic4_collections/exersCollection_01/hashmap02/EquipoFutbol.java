package topic4_collections.exersCollection_01.hashmap02;

import java.util.*;

public class EquipoFutbol {

    private HashMap<Dorsal, Jugador> hashMapJugadores;

    public EquipoFutbol() {
        this.hashMapJugadores = new HashMap<>();
    }

    public EquipoFutbol(HashMap<Dorsal, Jugador> hashMapJugadores) {
        this.hashMapJugadores = hashMapJugadores;
    }

    public HashMap<Dorsal, Jugador> getHashMapJugadores() {
        return hashMapJugadores;
    }

    public void setHashMapJugadores(HashMap<Dorsal, Jugador> hashMapJugadores) {
        this.hashMapJugadores = hashMapJugadores;
    }

    public void addJugadorHashMap(Dorsal dorsal, Jugador jugador) {
        hashMapJugadores.put(dorsal, jugador);
    }

    public void searchJugadorPorDorsal(Dorsal dorsal) {
        Jugador jugador = hashMapJugadores.get(dorsal);
        if (jugador == null) {
            System.out.printf("Dorsal %s no encontrado\n", dorsal);
        } else {
            System.out.printf("Dorsal encontrado %s\n", jugador.getNombre());
        }
    }

    public void searchJugadorPorNombre(String nombre) {
        boolean encontrado = false;
        for (Map.Entry<Dorsal, Jugador> entry : hashMapJugadores.entrySet()) {
            if (entry.getValue().getNombre().equals(nombre)) {
                encontrado = true;
                System.out.printf("Jugador encontrado: %s\n", entry.getValue().getNombre());
            }
        }
        if (!encontrado)
            System.out.printf("Jugador %s no encontrado!\n", nombre);
    }

    public void listarOrdenat() {
        TreeMap<Dorsal, Jugador> treeMapOrdenat = new TreeMap<>(hashMapJugadores);
        treeMapOrdenat.putAll(hashMapJugadores);
        for (Dorsal dKey : treeMapOrdenat.keySet()) {
            System.out.printf("key: %s. value: %s\n", dKey, treeMapOrdenat.get(dKey).getNombre());
        }
    }

    public void listarPorEdad() {
        Comparator<Map.Entry<Dorsal, Jugador>> comparatorEdad = new ComparatorEdadJugador();
        List<Map.Entry<Dorsal, Jugador>> listajugadores = new ArrayList<>(hashMapJugadores.entrySet());
        listajugadores.sort(comparatorEdad);
//        listajugadores.sort(Map.Entry.comparingByValue(Comparator.comparing(Jugador::getEdad)));
        for (Map.Entry<Dorsal, Jugador> j : listajugadores) {
            System.out.printf("Jugador: %s Edad: %d\n", j.getValue().getNombre(), j.getValue().getEdad());
        }
    }

    public void listarPorPosicionStream() {
        hashMapJugadores.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Jugador::getPosicion)))
                .forEach(jugador -> System.out.println(jugador.getValue().getNombre() + " - " + jugador.getValue().getPosicion()));
    }

    public void listarPorPosicionComparator() {
        Comparator<Map.Entry<Dorsal, Jugador>> comparatorPosicion = new ComparatorPosicionJugador();
        List<Map.Entry<Dorsal, Jugador>> listaJugadores = new ArrayList<>(hashMapJugadores.entrySet());
        Collections.sort(listaJugadores, comparatorPosicion);
        for (Map.Entry<Dorsal, Jugador> jugadorEntry : listaJugadores) {
            System.out.println(jugadorEntry.getValue().getNombre() + " -> " + jugadorEntry.getValue().getPosicion());
        }
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" +
                "jugadorHashMap=" + hashMapJugadores +
                '}';
    }
}
