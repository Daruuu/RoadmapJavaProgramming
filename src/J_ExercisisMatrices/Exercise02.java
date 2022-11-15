package J_ExercisisMatrices;

import java.util.Arrays;
import java.util.Scanner;

//2. Fer un programa que llegeixi dos números n i m per teclat, crei una matriu d'enters de tamany n files i m columnes, la ompli de números aleatoris i l'escrigui per pantalla.
public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
        System.out.print(Arrays.deepToString(matriz));
    }
}
