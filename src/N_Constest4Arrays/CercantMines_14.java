package N_Constest4Arrays;

import java.util.Scanner;

public class CercantMines_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (matriz[x - 1][y - 1] != 1) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();

        /*
        for ( int[] m: matriz) {
            for (int n : m) {
                System.out.print(n +" ");
            }
            System.out.println(" ");
        }
         */

    }

}
