package topic1_structuredprogramming.N_Constest4Arrays;

import java.util.Scanner;

public class SepararParesImpares_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        //mostrar segun posicion array = 0,1,2,3,4,5
        for (int i = 0; i < array.length; i = i + 2) {    //pares
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i = i + 2) {  //impares
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        //mostrar segun el valor del array = 5 4 8 6 7
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
