package topic3_objectorientedprogramming.asociationoop02.exer03;

import java.util.List;
import java.util.Scanner;

public class GestionFerryCamion {
    private List<Peaje> listaPeaje;
    private List<Ferry> ferries;

    public GestionFerryCamion(GestionFerryCamion gestionFerryCamion, List<Peaje> listaPeaje, List<Ferry> ferries) {
        this.listaPeaje = listaPeaje;
        this.ferries = ferries;
    }

    public List<Peaje> getListaPeaje() {
        return listaPeaje;
    }

    public void setListaPeaje(List<Peaje> listaPeaje) {
        this.listaPeaje = listaPeaje;
    }

    public List<Ferry> getFerries() {
        return ferries;
    }

    public void setFerries(List<Ferry> ferries) {
        this.ferries = ferries;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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


    // 3. Determinar si un camión puede embarcarse. Calcular si es posible embarcar un camión

    // 5. Determinar el camión que ha embarcado en n-ésima posición.
    // Dado un número entero, determinar qué matrícula y peso tiene ese camión.
    void getCamionEmbarcado(int numero) {

    }

    // 6. Determinar el importe del peaje de un camión.

    // 7. Determinar el peaje total recaudado.
}
