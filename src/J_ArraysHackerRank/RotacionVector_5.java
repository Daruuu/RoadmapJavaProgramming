package J_ArraysHackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class RotacionVector_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();
        char direccion = sc.next().charAt(0);
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();
        }
//        for (int array : vector) {
//            System.out.print(array + " ");
//        }

        int[] arrayCopia = new int[vector.length];


        if (direccion == 'e') {
            for (int i = 0; i < arrayCopia.length; i++) {
                int temp = vector[0];
                for (int j = 0; j < vector.length - posicion; j++) {
                    arrayCopia[j] = arrayCopia[j + posicion];
                }
                arrayCopia[arrayCopia.length - posicion] = temp;
            }
            System.out.println(Arrays.toString(arrayCopia));
        } else {

        }


    }
}
