package Topic1_StructuredProgramming.J_ExercisisMatrices;

import java.util.Scanner;

//6. Donades dues taules quadrades numèriques enteres de dimensió n, calcula la seva suma. La suma de les taules s'efectua assignant a cada element de la nova taula la suma dels elements que ocupen la mateix fila i la mateixa columna.
public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matriz1 = new int[n][n];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] i : matriz1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
        int[][] matriz2 = new int[n][n];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] filas : matriz2) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        System.out.println("suma matrices");
        int[][] sumaMatrices = new int[n][n];
        for (int i = 0; i < sumaMatrices.length; i++) {
            for (int j = 0; j < sumaMatrices[i].length; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int[] x : sumaMatrices) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
