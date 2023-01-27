package examenuf2;

import java.util.Scanner;

public class Problema3 {
    public static int[][] matrizVacunas;
    public static int numVacunas;
    public static int numContenedor;

    public static void main(String[] args) {
        matrizVacunas = new int[17][100000];
        menuPrograma(matrizVacunas);
    }
    public static void menuPrograma(int[][] kmsCamioDia) {
        Scanner sc = new Scanner(System.in);
        int opcion = menuOpciones(sc);
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("Introducir datos:");
                    System.out.print("numero del contenedor:");
                    numContenedor = sc.nextInt();
                    System.out.print("numero de vacunas:");
                    numVacunas = sc.nextInt();
                    introducirVacunas(matrizVacunas, numContenedor, numVacunas);
                    break;
                case 2:
                    System.out.print("numero del contenedor:");
                    numContenedor = sc.nextInt();
                    System.out.print("numero de vacunas:");
                    numVacunas = sc.nextInt();
                    treureVacunesContainer(matrizVacunas, numContenedor, numVacunas);
                    break;
                case 3:

                    break;
                case 4:
                    System.out.print("introduce el numero del contenedor a mostrar: ");
                    numContenedor = sc.nextInt();
                    estadoContainer(matrizVacunas, numContenedor);
                    break;
                case 5:
                    break;
                default:
                    System.out.print("introduce una opcion correcta:");
                    opcion = sc.nextInt();
            }
            opcion = menuOpciones(sc);
        }
    }

    public static int menuOpciones(Scanner sc) {
        System.out.println("[1]- introducir vacunas" +
                "[2]- treure vacunes de un container" +
                "[3]- moure vacunes entre containers" +
                "[4]- mostrar estado de container");
        return sc.nextInt();
    }

    public static void introducirVacunas(int[][] matrizVacunas, int numContainer, int numVacunas) {
        int vacuna = 1;
        for (int j = 0; j < matrizVacunas[numVacunas].length; j++) {
            matrizVacunas[numContainer][j] = vacuna;
        }
    }

    public static void treureVacunesContainer(int[][] matrizVacunas, int numContainer, int numVacunas) {
        int treureVacuna = 0;
        for (int j = 0; j < matrizVacunas[numVacunas].length; j++) {
            matrizVacunas[numContainer][j] = treureVacuna;
        }
    }

    public static void imprimirMatriz(int[][] matrizVacunas, int numContainer) {
        for (int j = 0; j < matrizVacunas[0].length; j++) {
            System.out.print(matrizVacunas[numContainer][j] + " ");
        }
    }

    public static void estadoContainer(int[][] matrizVacunas, int numContainer) {
        int contenedoresLleno = 0;
        for (int j = 0; j < matrizVacunas[0].length; j++) {
            contenedoresLleno += matrizVacunas[numContainer][j];
        }
        if (contenedoresLleno > 0) {
            System.out.print("estado del container " + contenedoresLleno + " vacunas.");
        } else {
            System.out.println("contenedor vacio");
        }
    }


}
