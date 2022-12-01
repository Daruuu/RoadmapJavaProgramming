package S1_StructuredProgramming.N_Constest4Arrays;

import java.util.Scanner;

public class OrdenaSequencia_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
//        Arrays.sort(array);
//        for (int arr: array) {
//            System.out.print(arr + " ");
//        }
        int temporal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temporal = array[i];
                    array[i] = array[j];
                    array[j] = temporal;
                }
            }
        }
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
