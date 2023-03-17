package topic4_collections.exersCollection_01.hashmap01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InventarioMoviles {
    HashMap<String, Movil> movilHashMap;

    public InventarioMoviles() {
        this.movilHashMap = new HashMap<String, Movil>();
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

    public void addMovil(String dni, Movil movil) {
        movilHashMap.put(dni, movil);
    }

    public void removeMovil(String dni) {

        Iterator<Map.Entry<String, Movil>> iterator = movilHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Movil> entry = iterator.next();
            if (entry.getKey().equals(dni)) {
                iterator.remove();
                break;
            } else {
                System.out.printf("DNI %s no encontrado!", dni);
            }
        }
        //movilHashMap.entrySet().removeIf(entry -> entry.getKey().equals(dni));
    }

    public void buscarMovil(String dni) {
        for (Map.Entry<String, Movil> entry : movilHashMap.entrySet()) {
            if (entry.getKey().equals(dni)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void buscarDni(String numero) {
        Iterator<Map.Entry<String, Movil>> iterator = movilHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Movil> entry = iterator.next();
            if (entry.getValue().getNumero().equals(numero)) {
                System.out.println(entry.getValue());
            }
        }
    }

    @Override
    public String toString() {
        return "InventarioMoviles{" +
                "movilHashMap=" + movilHashMap +
                '}';
    }
}
