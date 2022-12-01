package S1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class MatruiSimetrica_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        boolean simetrico = true;
        int[][] arrTranspuesto = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrTranspuesto[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] != arrTranspuesto[i][j]) {
                    simetrico = false;
                    break;
                }
            }
        }
        String res = simetrico ? "TRUE" : "FALSE";
        System.out.println(res);
/*
        for (int[] filas : array) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
 */
    }
}
