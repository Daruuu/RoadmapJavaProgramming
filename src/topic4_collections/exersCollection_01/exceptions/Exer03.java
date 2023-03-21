package topic4_collections.exersCollection_01.exceptions;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        int j = 0;
        while (j < array.length) {
            System.out.print(array[j] + " ");
            j++;
        }
        try {
            int i = 0;
            int position;
            while (i < array.length) {
                array[i] = i;
                i++;
            }
            System.out.println("buscar una posicion dle array: ");
            position = sc.nextInt();

/*
            while (){

            }
*/
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}
