package examenuf05.problema02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EquipoProyecto {
    //key : DNI string
    //value :nombre-proyecto string
    private HashMap<String, String> equipoHashMap;

    public EquipoProyecto() {
        this.equipoHashMap = new HashMap<String, String>();
    }

    public EquipoProyecto(HashMap<String, String> equipoHashMap) {
        this.equipoHashMap = equipoHashMap;
    }

    public HashMap<String, String> getEquipoHashMap() {
        return equipoHashMap;
    }

    public void setEquipoHashMap(HashMap<String, String> equipoHashMap) {
        this.equipoHashMap = equipoHashMap;
    }

    public void agregarRegistro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nuevo registro");
        System.out.println("dni: ");
        sc.nextLine();
        String dni = sc.nextLine();
        System.out.println("proyecto: ");
        String nombreProyecto = sc.nextLine();
        if (equipoHashMap.containsKey(dni)) {
            System.out.println("el dni s'ha canviat de projecte");
        } else {
            equipoHashMap.put(dni, nombreProyecto);
            System.out.println("s'ha afegit correctament el dni al projecte");
        }
    }

    public void buscarPorDni(String dni) {
        boolean asignado = false;
        for (Map.Entry<String, String> entry : equipoHashMap.entrySet()) {
            if (entry.getKey().equals(dni)) {
                System.out.println(entry.getValue());
                asignado = true;
            }
        }
        if (!asignado) {
            System.out.println("el proyecto esta asignado!");
        } else {
            System.out.println("no està assignat a cap projecte");
        }
    }

    public void listarDniPorProyecto(String nomProyecto) {
        for (Map.Entry<String, String> entry : equipoHashMap.entrySet()) {
            String key = entry.getKey();
            String values = entry.getValue();
            if (values.contains(nomProyecto)) {
                System.out.println(key);
            }
        }
    }

    public void menuOpciones() {
        System.out.print("[1]- agrega registro nuevo\n" +
                "[2]- busca por DNI \n" +
                "[3]- listar miembros por nombre de proyecto" +
                "elige una opcion: ");
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        menuOpciones();
        int opcion = sc.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.println("Agregar un registro");
                    agregarRegistro();
                    break;
                case 2:
                    System.out.print("Introduce DNI: ");
                    sc.nextLine();
                    String dniABuscar = sc.nextLine();
                    buscarPorDni(dniABuscar);
                    break;
                case 3:
                    System.out.println("introduce nombre del proyecto:");
                    sc.nextLine();
                    String nombreProyecto = sc.nextLine();
                    listarDniPorProyecto(nombreProyecto);
                    break;
                default:
                    System.out.println("introduce opcion correcta!");
            }
            menuOpciones();
            opcion = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        EquipoProyecto ep = new EquipoProyecto();
        ep.equipoHashMap.put("123485D", "equipo 1");
        ep.equipoHashMap.put("623445T", "equipo 2");
        ep.equipoHashMap.put("987485U", "equipo 3");
        ep.equipoHashMap.put("123485G", "equipo 4");
        ep.equipoHashMap.put("674485F", "equipo 5");
        ep.equipoHashMap.put("674485F", "equipo 7");
        ep.programa();
    }

    @Override
    public String toString() {
        return "EquipoProyecto{" +
                "equipoHashMap=" + equipoHashMap +
                '}';
    }
}
