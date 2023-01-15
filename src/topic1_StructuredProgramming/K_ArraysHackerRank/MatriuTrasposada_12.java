package topic1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class MatriuTrasposada_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int[][] traspuesta = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(traspuesta[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
