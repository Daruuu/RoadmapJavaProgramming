package scrum.uf2;

import java.util.Scanner;

public class WadRas {

    public static void main(String[] args) {
        menuWadRas();
    }

    public static void menuWadRas() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            int opcion = opcionesMenuWadRas(sc);
            switch (opcion) {
                case 1:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 1:\033[0m");
                    linea();
                    Reclusas.mostrarFichaTecnica();
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
                    Reclusas.reclusasGradoTresMenorCondena();
                    Reclusas.reclusasGradoTresMayorCondena();
                    linea();
                    break;
                case 4:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 4:\033[0m");
                    linea();
//                    ControlReclusas.comprobarHorarioPresaV1();
                    ControlReclusas.comprobarHorarioRecluta();
                    linea();
                    break;
                case 5:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 5:\033[0m");
                    linea();
                    ControlReclusas.visitasPresas();
                    linea();
                    break;
                case 6:
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
                "[1]- FICHAS ACTUALES DE LAS RECLUSAS\n" +
                "[2]- INTRODUCIR NUEVAS RECLUSAS\n" +
                "[3]- RECLUSAS DE 3R GRADO QUE PUEDEN SALIR\n" +
                "[4]- CONTROL ENTRADA Y SALIDA DE LAS RECLUSAS\n" +
                "[5]- CONTROL DE VISITAS FAMILIARES/AMIGOS DE LAS RECLUSAS\n" +
                "[6]- FINALIZA PROGRAMA\n" +
                "INTRODUCE UNA OPCION: ");
        return sc.nextInt();
    }

    public static void linea() {
        System.out.println("\033[36m" + "--------------------------------" + "\033[0m");
    }
}
