package topic1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class Gimcana_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int puntosGincana = sc.nextInt();
        int[][] gimcana = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                gimcana[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int posicionComenzar = gimcana[x][y];
        int contador = 0;
        int k = 0;
        while (k < puntosGincana) {

            k++;
        }
    }

}
