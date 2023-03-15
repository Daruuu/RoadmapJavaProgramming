package topic4_collections.exersCollection_01.hashmap01;

import java.util.HashMap;

public class InventarioMoviles {
    HashMap<String,Movil> movilHashMap;

    public InventarioMoviles() {
    }

    public InventarioMoviles(HashMap<String, Movil> movilHashMap) {
        this.movilHashMap = movilHashMap;
    }

    public HashMap<String, Movil> getMovilHashMap() {
        return movilHashMap;
    }

    public void setMovilHashMap(HashMap<String, Movil> movilHashMap) {
        this.movilHashMap = movilHashMap;
    }

    public void addMovil(String dni, Movil movil){
        movilHashMap.put(dni, movil);
    }
    public void removeMovil(String dni){
        for(movilHashMap.keySet().){

        }
    }

    @Override
    public String toString() {
        return "InventarioMoviles{" +
                "movilHashMap=" + movilHashMap +
                '}';
    }
}
