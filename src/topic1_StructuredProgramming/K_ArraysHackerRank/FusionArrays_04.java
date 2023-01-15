package topic1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class FusionArrays_04 {
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
        int[] fusionArr = new int[n + m];
        int i = 0;
        int j = 0;
        int k;

        for (k = 0; k < fusionArr.length; k++) {
            if (i == array1.length) {
                fusionArr[k] = array2[j];
                j++;
            } else if (j == array2.length) {
                fusionArr[k] = array1[i];
                i++;
            } else {
                if (array1[i] <= array2[j]) {
                    fusionArr[k] = array1[i];
                    i++;
                } else {
                    fusionArr[k] = array2[j];
                    j++;
                }
            }
        }
        for (int newArray: fusionArr) {
            System.out.print(newArray + " ");
        }
    }
}
