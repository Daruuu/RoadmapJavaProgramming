package Topic1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class SumaMatrius_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas1 = sc.nextInt();
        int columnas1 = sc.nextInt();
        int[][] a = new int[filas1][columnas1];
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int filas2 = sc.nextInt();
        int columnas2 = sc.nextInt();
        int[][] b = new int[filas2][columnas2];
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] c = new int[filas1][columnas1];
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
