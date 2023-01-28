package topic1_structuredprogramming.K_ArraysHackerRank;

import java.util.Scanner;

public class SumaArrays_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + array[array.length -1];
            System.out.print(array[i] + " ");
        }

    }
}
