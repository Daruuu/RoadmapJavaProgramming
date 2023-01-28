package topic1_structuredprogramming.J_ExercisisMatrices;

import java.util.Scanner;
//9. Escriu un programa que llegeixi un nombre N i que creï una matriu quadrada d'enters aleatoris entre 0 i 9, i que imprimeixi la matriu original i tot seguit, les posicions de la matriu que formen una N (primera i última columnes i diagonal principal).
//Per exemple, donada la matriu:
//3 5 6 7
//2 4 5 7
//1 4 0 7
//2 5 6 8
//El programa escriuria per pantalla:
//
//3      7
//2 4    7
//1   0  7
//2      8
//Tingueu en compte que després de cada nombre hi ha un espai.
public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || j == matriz.length - 1 || j == i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
