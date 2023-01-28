package topic1_structuredprogramming.N_Constest4Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DosSecuenciasIgual_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
        if (Arrays.equals(array1, array2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
