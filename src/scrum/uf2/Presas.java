package scrum.uf2;

import java.util.Scanner;

public class Presas {

    public static final String tipoGradoCondena = "3";
    public static int reclusasSalidaPatio;
    public static String[][] reclusasMenorNueveAnyos;
    private static final String[][] fichasTecnicasReclusas = {
            {"0001", "Juana Nascimento", "29", "20", "11", "3"},    //no pueden
            {"0002", "Giovana Libert", "42", "10", "5", "1"},
            {"0003", "Maria Lisa", "33", "8", "5", "3"},    // si pueden
            {"0004", "Marta Eulalia", "39", "4", "2", "2"},
            {"0005", "Carmen ", "65", "5", "1", "2"},
            {"0006", "Ana Beltran", "32", "10", "7", "3"},  // si pueden
            {"0007", "Andrew Gil", "40", "10", "10", "2"},
            {"0008", "Camila Jimenez", "37", "20", "17", "2"},
            {"0009", "Andrea Linares", "42", "5", "9", "3"},    //no pueden
            {"0010", "Laura Ochoa", "25", "15", "7", "3"}   // si pueden
    };

    public static int opcionesMenuWadRas(Scanner sc) {
        System.out.print("\033[35m" + "GESTION DE LA PRISION WADRAS" + "\033[0m\n" +
                "[1]- FICHA DE LAS RECLUSAS\n" +
                "[2]- RECLUSAS DE 3R GRADO QUE PUEDEN SALIR\n" +
                "[3]- CONTROL ENTRADA Y SALIDA DE LAS RECLUSAS\n" +
                "[4]- CONTROL DE VISITAS FAMILIARES/AMIGOS DE LAS RECLUSAS\n" +
                "[5]- FINALIZA PROGRAMA\n" +
                "INTRODUCE UNA OPCION: ");
        return sc.nextInt();
    }

    public static void mostrarFichaTecnica() {
        System.out.println("id, nombre, dni, edad, sentencia, condena restante, tipo grado");
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            for (int j = 0; j < fichasTecnicasReclusas[0].length; j++) {
                System.out.print(fichasTecnicasReclusas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarReclusasGradoTresMenosCondena() {
        System.out.println("\033[34m" + "RECLUSAS QUE SI PUEDEN SALIR AL PATIO:" + "\033[0m");

        //{"0001", "Juana Nascimento", "29", "20", "11", "3"},

        int contadorReclusas = 0;
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            for (int j = 0; j < fichasTecnicasReclusas[i].length; j++) {
                if (fichasTecnicasReclusas[j][5].equals(tipoGradoCondena) && Integer.parseInt(fichasTecnicasReclusas[j][4]) < 9) {
                    System.out.println("Id " + fichasTecnicasReclusas[j][0] + " con nombre " + fichasTecnicasReclusas[j][1]);
                    contadorReclusas++;
                    reclusasMenorNueveAnyos = new String[contadorReclusas][2];
                }
                reclusasMenorNueveAnyos[i][j] = fichasTecnicasReclusas[i][0];
            }
        }
        System.out.println("reclusas array");
        for (String[] reclusas : reclusasMenorNueveAnyos) {
            for (String col : reclusas) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        reclusasGradoTresMenorCondena1();
//        mostrarReclusasGradoTresMayorCondena();
//    }

    public static void reclusasGradoTresMenorCondena() {
        System.out.println("\033[34m" + "RECLUSAS DE TERCER GRADO QUE PUEDEN SALIR AL PATIO:" + "\033[0m");
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][5].equals(tipoGradoCondena) && Integer.parseInt(fichasTecnicasReclusas[i][4]) < 9) {
                System.out.println(fichasTecnicasReclusas[i][0] + " " + fichasTecnicasReclusas[i][1]);
            }
        }
    }
    public static void reclusasGradoTresMayorCondena() {
        System.out.println("\033[31m" + "RECLUSAS DE TERCER GRADO QUE NO PUEDEN SALIR AL PATIO:" + "\033[0m");
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][5].equals(tipoGradoCondena) && Integer.parseInt(fichasTecnicasReclusas[i][4]) >= 9) {
                System.out.println(fichasTecnicasReclusas[i][0] + " " + fichasTecnicasReclusas[i][1]);
            }
        }
    }
}