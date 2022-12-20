package PROGRAMAME;

import java.util.Scanner;

public class DeLasPiramidesACleopatra_A {
    public static void main(String[] args) {
        piramideMatriz();
    }

    //n: numero de casos prueba
    // cada caso prueba son 3 numeros:
    // -10.000 <= A < B < C <= 10.000(cada uno representa un AÑO
    // año 0 no existe
    //por cada caso prueba escribira el año A o C que esta mas cerca de B
    // si esta a la misma distancia de ambos , sout "EMPATE"
    public static void piramideMatriz() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrizCompleta = new int[n][3];
        for (int i = 0; i < matrizCompleta.length; i++) {
            for (int j = 0; j < matrizCompleta[i].length; j++) {
                matrizCompleta[i][j] = sc.nextInt();
            }
        }

        int restaA = 0; //resta posicion [0][1] - [0][0]
        int restaB = 0; //resta posicion [0][2] - [0][1]

        for (int i = 0; i < matrizCompleta.length; i++) {

            // Miramos primer par
            if (matrizCompleta[i][0] < 0 && matrizCompleta[i][1] > 0) {
                // -30 30 = 30 - (-30) - 1 = 30 + 30 - 1 = 59
                restaA = matrizCompleta[i][1] - matrizCompleta[i][0] - 1;
            } else {
                // 30 30 = 30 - 30 = 0
                // -30 -30 = -30 - (-30) = 0
                restaA = matrizCompleta[i][1] - matrizCompleta[i][0];
            }

            // Miramos segundo par
            if (matrizCompleta[i][1] < 0 && matrizCompleta[i][2] > 0) {
                restaB = matrizCompleta[i][2] - matrizCompleta[i][1] - 1;
            } else {
                restaB = matrizCompleta[i][2] - matrizCompleta[i][1];
            }

            if (restaA == restaB) {
                System.out.println("EMPATE");
            } else if (restaA > restaB) {
                System.out.println(matrizCompleta[i][2]);
            } else {
                System.out.println(matrizCompleta[i][0]);
            }
        }
    }
}
