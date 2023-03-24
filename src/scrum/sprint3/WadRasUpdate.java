package scrum.sprint3;

import java.util.Scanner;

public class WadRasUpdate {
    public static void main(String[] args) {
        WadRasUpdate wadRasUpdate = new WadRasUpdate();
        wadRasUpdate.menuWadRas();
    }

    public void menuWadRas() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            int opcion = opcionesMenuWadRas(sc);
            switch (opcion) {
                case 1:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 1:\033[0m");
                    linea();

                    linea();
                    break;
                case 2:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 2:\033[0m");
                    linea();

                    linea();
                    break;
                case 3:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 3:\033[0m");
                    linea();

                    linea();
                    break;
                case 4:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 4:\033[0m");
                    linea();
                    System.out.println("Listado de las Reclusas");

                    linea();
                    break;
                case 5:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 5:\033[0m");
                    linea();
                    System.out.println("RECLUSAS QUE TIENEN VISITA:");

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("----------FIN DEL PROGRAMA----------");
                    salir = true;
                    break;
                default:
                    System.out.println("SELECCIONA UNA OPCION CORRECTA:");
            }
        }
    }

    public static int opcionesMenuWadRas(Scanner sc) {
        System.out.print("\033[35mGESTION DE LA PRISION WADRAS\033[0m\n" +
                "[1]- LISTAR FICHAS RECLUSAS\n" +
                "[2]- INTRODUCIR NUEVAS RECLUSAS\n" +
                "[3]- LISTAR RECLUSAS DE 3R GRADO QUE PUEDEN SALIR\n" +
                "[4]- CONTROL ENTRADA Y SALIDA DE LAS RECLUSAS\n" +
                "[5]- CONTROL DE VISITAS FAMILIARES/AMIGOS DE LAS RECLUSAS\n" +
                "[6]- FINALIZA PROGRAMA\n" +
                "INTRODUCE UNA OPCION: ");
        return sc.nextInt();
    }

    public static void linea() {
        System.out.println("\033[36m--------------------------------\033[0m");
    }
}