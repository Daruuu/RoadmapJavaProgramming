package topic3_objectorientedprogramming.exerasociacionclases02.exer03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFerryCamion {
    GestionFerryCamion gestionFerryCamion;
    List<Peaje> listaPeaje;
    List<Camion> listaCamiones;
    static List<Ferry> ferries;


    public GestionFerryCamion(GestionFerryCamion gestionFerryCamion) {
        this.gestionFerryCamion = gestionFerryCamion;
    }

    public GestionFerryCamion() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionFerryCamion gestionFerryCamion1 = new GestionFerryCamion();
        listaPeaje = new ArrayList<>();
        listaPeaje.add(0,);
        listaCamiones = new ArrayList<>();
        Ferry ferry1 = new Ferry("abcde", "numero 22", "Puerto Barcelona", 100, 5, listaCamiones, listaPeaje);
        gestionFerryCamion1.programa();
        ferries.add(ferry1);
    }

    int menuFuncionalidades(Scanner sc) {
        System.out.print("Gestion Ferry-Camiones\n" +
                "[1]- Peso total de CAMIONES embarcados\n" +
                "[2]- Determinar SI un CAMION esta embarcado\n" +
                "[3]- Determinar SI un CAMION puede embarcarse\n" +
                "[4]- Embarcar un CAMION\n" +
                "[5]- Buscar un CAMION por numero\n" +
                "[6]- Determinar el importe del PEAJE de un CAMION\n" +
                "[7]- Determinar el total del PEAJE\n" +
                "[8]- Terminar Programa\n" +
                "Elige una opcion: ");
        return sc.nextInt();
    }

    void programa() {
        Scanner sc = new Scanner(System.in);
        int opcion = menuFuncionalidades(sc);
        while (opcion != 9) {
            switch (opcion) {
                case 1:

                    System.out.println(pesoTotalCamionesEnFerry());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.print("introduce opcion correcta: ");
            }
            opcion = menuFuncionalidades(sc);
        }

    }

    // 1. Determinar el peso total de los camiones embarcados.
    //Debe devolver la suma de los pesos de camiones que tiene el ferry embarcado.
    public double pesoTotalCamionesEnFerry() {
        double sumaPesoCamiones = 0;
        for (int i = 0; i < listaCamiones.size(); i++) {
            if (listaCamiones.get(i).getPesoTonelada() > 0) {
                sumaPesoCamiones += listaCamiones.get(i).getPesoTonelada();
            }
        }
        return sumaPesoCamiones;
    }

    // 2. Determinar si un camión está embarcado.A partir de la matrícula del camión debe descubrirse si el camión está embarcado.
    public boolean camionEnFerry() {
        return false;
    }

    // 3. Determinar si un camión puede embarcarse. Calcular si es posible embarcar un camión


    // 4. Embarcar un camión.

    // 5. Determinar el camión que ha embarcado en n-ésima posición.
    // Dado un número entero, determinar qué matrícula y peso tiene ese camión.

    // 6. Determinar el importe del peaje de un camión.

    // 7. Determinar el peaje total recaudado.
}
