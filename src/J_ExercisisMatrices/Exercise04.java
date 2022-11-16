package J_ExercisisMatrices;

import java.util.Scanner;

//4. Fer un programa que llegeixi una taula numèrica real i escrigui la taula transposada.
// La taula transposada s'obté canviant les files per les columnes.
public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println(" ");
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] +" ");
            }
            System.out.println(" ");
        }
    }
}
