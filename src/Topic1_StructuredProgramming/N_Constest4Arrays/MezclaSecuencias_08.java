package Topic1_StructuredProgramming.N_Constest4Arrays;

import java.util.Scanner;

public class MezclaSecuencias_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        int[] sumaArrays = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            sumaArrays[k] = array1[i];
            k++;
            sumaArrays[k] = array2[j];
            k++;
            i++;
            ++j;
        }
        while(i < array1.length) {
            sumaArrays[k] = array1[i];
            i++;
            k++;
        }

        while(j < array2.length) {
            sumaArrays[k] = array2[j];
            j++;
            k++;
        }
        for (int num: sumaArrays) {
            System.out.print(num + " ");
        }
    }
}
