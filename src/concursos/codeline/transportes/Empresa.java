package concursos.codeline.transportes;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int numCamions = sc.nextInt();
//        int [][] kmsCamionsDia = new int[numCamions][];
        int[][] values = {
                {100, 30, 40},
                {400, 50, 60},
                {70, 80, 20},
                {40, 60, 15}
        };
        int kmsTotal = kmsTotals(values);
        System.out.println(kmsTotal);
    }

    public static void programa(int[][] matriz, int numCamio) {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        menuOpciones(opcion);
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    introduirDadesDia(matriz);
                    break;
                case 2:
                    int kmsCamionTotal = kmsCamio(matriz, numCamio);
                    System.out.println(kmsCamionTotal);
                    break;
                case 3:
                    llistaKmCamioMes(matriz, numCamio);
                    break;
                case 4:
                    int kmsTotal = kmsTotals(matriz);
                    System.out.println(kmsTotal);
                default:
                    System.out.println("introduce opcion correcta.");
            }
            opcion = sc.nextInt();
        }
    }

    public static int menuOpciones(int opcion) {

        System.out.println("[1]. introduir dades\n" +
                "[2]. kmsCamio\n" +
                "[3]. listaKmCamioMes\n" +
                "[4]. kmsTotals");
        return opcion;
    }

    /*Aquesta acció ha d’introduir per cada dia els kms que fa cada camió durant un mes. (Aquesta informació es guardarà en una matriu de dades kmsCamionsDia
     on les files seran els camions i les columnes els dies d’un mes
     */
    // filas = camions
    // columnas = dias de mes
    public static void introduirDadesDia(int[][] kmsCamioDia) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < kmsCamioDia.length; i++) {
            for (int j = 1; j < kmsCamioDia[i].length; j++) {
                kmsCamioDia[i][j] = sc.nextInt();
            }
        }
    }

    // Aquesta funció retorna tots els kms que fa un camió durant un mes
    public static int kmsCamio(int[][] kmsCamioDia, int camio) {

        for (int i = 0; i < kmsCamioDia.length; i++) {
            int sumaCamio = 0;
            for (int j = 0; j < kmsCamioDia[i].length; j++) {
                sumaCamio += kmsCamioDia[camio][j];
            }
            return sumaCamio;
        }
        return 0;
    }


    // Aquesta funció retorna tots els kms que fa un camió durant un mes
    public static int[] llistaKmCamioMes(int[][] kmsCamioDia, int camio) {
        int[] listaKmCamio = new int[kmsCamioDia[0].length];

        for (int i = 0; i < kmsCamioDia.length; i++) {
            for (int j = 0; j < kmsCamioDia[i].length; j++) {

                if (kmsCamioDia[i][j] == kmsCamioDia[camio][j]) {
                    listaKmCamio[j] = kmsCamioDia[camio][j]++;
                }
            }
        }
        return listaKmCamio;
    }

    public static int kmsTotals(int[][] kmsCamioDia) {
        int sumaKmsTotal = 0;
        for (int i = 0; i < kmsCamioDia.length; i++) {
            for (int j = 0; j < kmsCamioDia[i].length; j++) {
                sumaKmsTotal += kmsCamioDia[i][j];
            }
        }
        return sumaKmsTotal;
    }

}
