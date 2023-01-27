package examenuf2;

import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {
    public static int[][] kmsCamioDia;
    public static int[] listaKmsCamioMes;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce numero de camions: ");
        int numCamions = sc.nextInt();

        kmsCamioDia = new int[numCamions][30];
        menuPrograma(kmsCamioDia);
    }

    public static void menuPrograma(int[][] kmsCamioDia) {
        Scanner sc = new Scanner(System.in);
        int opcion = menuOpciones(sc);
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("Introducir datos:");
                    introduirDadesDia(kmsCamioDia);
                    break;
                case 2:
                    System.out.print("introduce el numero de camio:");
                    int camio2 = sc.nextInt();
                    System.out.println(kmsCamio(kmsCamioDia, camio2));
                    break;
                case 3:
                    System.out.print("introduce el numero de camio:");
                    int camio3 = sc.nextInt();
                    int[] listaKmsCamioMes = llistatKmCamioMes(kmsCamioDia, camio3);
                    System.out.println(Arrays.toString(listaKmsCamioMes));
                    break;
                case 4:
                    System.out.print("kms total de camions en un mes: ");
                    int kmsTotals = kmsTotals(kmsCamioDia);
                    System.out.println(kmsTotals);
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

    public static void introduirDadesDia(int[][] kmsCamioDia) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < kmsCamioDia.length; i++) {
            for (int j = 0; j < kmsCamioDia[i].length; j++) {
                kmsCamioDia[i][j] = sc.nextInt();
            }
        }
    }

    public static int kmsCamio(int[][] kmsCamioDia, int camio) {
        int sumaKmsCamio = 0;
        for (int j = 0; j < kmsCamioDia[camio].length; j++) {
            sumaKmsCamio += kmsCamioDia[camio][j];
        }
        return sumaKmsCamio;
    }

    public static int[] llistatKmCamioMes(int[][] kmsCamioDia, int camio) {
        listaKmsCamioMes = new int[kmsCamioDia[camio].length];
        for (int j = 0; j < kmsCamioDia[camio].length; j++) {
            listaKmsCamioMes[j] = kmsCamioDia[camio][j];
        }
        return listaKmsCamioMes;
    }

    public static int kmsTotals(int[][] kmsCamioDia) {
        int kmsTotalCamions = 0;
        for (int i = 0; i < kmsCamioDia.length; i++) {
            for (int j = 0; j < kmsCamioDia[i].length; j++) {
                kmsTotalCamions += kmsCamioDia[i][j];
            }
        }
        return kmsTotalCamions;
    }

    public static int menuOpciones(Scanner sc) {
        System.out.print("[1]. Introduir dades:\n" +
                "[2]. kmsCamio\n" +
                "[3]. listaKmCamioMes\n" +
                "[4]. kmsTotals\n" +
                "elige una opcion: ");
        return sc.nextInt();
    }
}