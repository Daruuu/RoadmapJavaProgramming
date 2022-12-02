package Topic1_StructuredProgramming.J_ExercisisMatrices;
//5. Donat un nombre enter major que zero, crea la matriu identitat de dimensió el nombre enter donat. (http://ca.wikipedia.org/wiki/Matriu_identitat)

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        for ( int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println(" ");
        }

    }
}
