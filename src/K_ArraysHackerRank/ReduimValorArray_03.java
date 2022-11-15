package K_ArraysHackerRank;

import java.util.Scanner;

public class ReduimValorArray_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int valorMinimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < valorMinimo)
                valorMinimo = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] - valorMinimo + " ");
        }


    }
}
