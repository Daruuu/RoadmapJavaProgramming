package PROGRAMAME;

import java.util.Scanner;

public class DeLasPiramidesACleopatra_A {
    public static void main(String[] args) {
    }

    //n: numero de casos prueba
    // cada caso prueba son 3 numeros:
    // -10.000 <= A < B < C <= 10.000(cada uno representa un AÑO
    // año 0 no existe
    //por cada caso prueba escribira el año A o C que esta mas cerca de B
    // si esta a la misma distancia de ambos , sout "EMPATE"

    public static void piramides(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrizAnyos = new int[n][3];
        for (int i = 0; i < matrizAnyos.length; i++) {
            for (int j = 0; j < matrizAnyos[i].length; j++) {
                matrizAnyos[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrizAnyos.length; i++) {
            for (int j = 0; j < matrizAnyos[i].length; j++) {
                while ()
            }
        }

    }

}
