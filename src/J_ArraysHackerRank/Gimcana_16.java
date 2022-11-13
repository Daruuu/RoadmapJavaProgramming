package J_ArraysHackerRank;

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
        int contador = 0;
        int k = 0;
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (k <= puntosGincana) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (gimcana[x][y] == numeros[k]) {
//                        gimcana[x][y] = ;
                    }
                    k++;
                }
            }
        }
    }

}
