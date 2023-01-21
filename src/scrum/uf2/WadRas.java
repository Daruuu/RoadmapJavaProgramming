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
            int opcion = Presas.opcionesMenuWadRas(sc);
            switch (opcion) {
                case 1:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 1:\033[0m");
                    linea();
                    Presas.mostrarFichaTecnica();
                    linea();
                    break;
                case 2:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 2:\033[0m");
                    linea();
                    Presas.reclusasGradoTresMenorCondena();
                    Presas.reclusasGradoTresMayorCondena();
                    linea();
                    break;
                case 3:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 3:\033[0m");
                    linea();
//                    ControlReclusas.comprobarHorarioPresaV1();
                    ControlReclusas.comprobarHorarioRecluta();
                    linea();
                    break;
                case 4:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 4:\033[0m");
                    linea();
                    ControlReclusas.visitasPresas();
                    linea();
                    break;
                case 5:
                    System.out.println("----------FIN DEL PROGRAMA----------");
                    salir = true;
                    break;
                default:
                    System.out.println("SELECCIONA UNA OPCION CORRECTA:");
            }
        }
    }

    public static void linea() {
        System.out.println("\033[36m" + "--------------------------------" + "\033[0m");
    }
}
