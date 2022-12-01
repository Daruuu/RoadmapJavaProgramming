package S1_StructuredProgramming.J_ExercisisMatrices;

import java.util.Scanner;

//3. Fer un programa que llegeixi una taula bidimensional quadrada numèrica real i escrigui la seva traça. La traça és la suma dels elements de la diagonal principal.
public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
        for (int[] n : matriz) {
            for (int x : n) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("diagonal de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]);
            System.out.print(" ");
        }
    }
}
