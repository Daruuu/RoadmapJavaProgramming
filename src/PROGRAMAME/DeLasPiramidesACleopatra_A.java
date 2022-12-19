package PROGRAMAME;

import java.util.Scanner;

public class DeLasPiramidesACleopatra_A {
    public static void main(String[] args) {
//        piramideUnaLinea();
        piramideMatriz();
    }

    //n: numero de casos prueba
    // cada caso prueba son 3 numeros:
    // -10.000 <= A < B < C <= 10.000(cada uno representa un AÑO
    // año 0 no existe
    //por cada caso prueba escribira el año A o C que esta mas cerca de B
    // si esta a la misma distancia de ambos , sout "EMPATE"

    public static void piramideUnaLinea() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrizAnyos = new int[n][3];
        for (int i = 0; i < matrizAnyos.length; i++) {
            for (int j = 0; j < matrizAnyos[i].length; j++) {
                matrizAnyos[i][j] = sc.nextInt();
            }
        }

        int restaA = 0;
        int restaB = 0;
        restaA = matrizAnyos[0][1] - matrizAnyos[0][0];
        restaB = matrizAnyos[0][1] - matrizAnyos[0][2];
//        System.out.println(restaA);
//        System.out.println(restaB);
        if (restaA > restaB) {
            System.out.println(matrizAnyos[0][2]);
        } else {
            System.out.println(matrizAnyos[0][0]);
        }

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
        //falta eliminar el anyo zero al momento de restar

        for (int i = 0; i < matrizCompleta.length; i++) {
            if ((matrizCompleta[i][0] < 0 && matrizCompleta[i][1] > 0) || (matrizCompleta[i][0] > 0 && matrizCompleta[i][1] < 0)) {
                // si negativo-positivo-? o si positivo-negativo-?
            }



            if (matrizCompleta[i][1] < 0 && matrizCompleta[i][0] > 0) { // negativo postivo
                restaA = matrizCompleta[i][1] - matrizCompleta[i][0] - 1;
            } else if (matrizCompleta[i][2] > 0 && matrizCompleta[i][1] < 0) {
                restaB = matrizCompleta[i][2] - matrizCompleta[i][1] - 1;
            }else {
                restaA = matrizCompleta[i][1] - matrizCompleta[i][0];
                restaB = matrizCompleta[i][2] - matrizCompleta[i][1];
            }

            if (restaA == restaB) {
                System.out.println("EMPATE");
            } else if (restaA < restaB) {
                System.out.println(matrizCompleta[i][2]);
            } else {
                System.out.println(matrizCompleta[i][0]);
            }
        }
    }
}
