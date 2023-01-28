package topic1_structuredprogramming.K_ArraysHackerRank;

import java.util.Scanner;

public class RotacionVector_05 {

    public static void selectionSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int pos_min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    pos_min = j;
                }
            }
            // Aquí ya hemos encontrado la posición donde está el mínimo
            int temp = v[i];
            v[i] = v[pos_min];
            v[pos_min] = v[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();
        char direccion = sc.next().charAt(0);   //'a'
        int n = sc.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();
        }

        if (direccion == 'e') {
            for (int i = 0; i < posicion; i++) {
                // guardamos el 1er elemento
                int arrTemporal1 = vector[0];
                for (int j = 0; j < vector.length - 1; j++) {
                    //desplazamos las posiciones a la izquierda
                    vector[j] = vector[j + 1];
                }
                vector[vector.length - 1] = arrTemporal1;
            }
        } else {
            for (int i = 0; i < posicion; i++) {
                //guardamos la ultima posicion -1
                int arrTemporal2 = vector[vector.length - 1];
                for (int j = vector.length - 1; j > 0; j--) {
                    //desplazamos el array una posicion a la derecha
                    vector[j] = vector[j - 1];
                }
                vector[0] = arrTemporal2;
            }
        }
        for (int j : vector) {
            System.out.print(j + " ");
        }
    }
}
