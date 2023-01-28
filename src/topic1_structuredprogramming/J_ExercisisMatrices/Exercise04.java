package topic1_structuredprogramming.J_ExercisisMatrices;

import java.util.Scanner;

//4. Fer un programa que llegeixi una taula numèrica real i escrigui la taula transposada.
// La taula transposada s'obté canviant les files per les columnes.
public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        int[][] traspuesta = new int[columnas][filas];
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println(" ");
        }

//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] +" ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println();
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[j][i] + " ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println("---------------------");
//        for (int[] col : traspuesta) {
//            for (int fi : col) {
//                System.out.print(fi + " ");
//            }
//            System.out.println("");
//        }
    }
}
