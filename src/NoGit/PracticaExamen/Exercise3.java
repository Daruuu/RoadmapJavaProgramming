package NoGit.PracticaExamen;

import java.util.Scanner;

public class Exercise3 {
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
        int[] sumaArrays = new int[n+m];
        int i = 0;
        int j = 0;
        for (int k = 0; k < sumaArrays.length; k++) {
            if (i == array1.length) {
                sumaArrays[k] = array2[j];
                j++;
            } else if (j == array2.length) {
                sumaArrays[k] = array1[i];
                i++;
            } else {
                if (array1[i] <= array2[j]) {
                    sumaArrays[k] = array1[i];
                    i++;
                } else {
                    sumaArrays[k] = array2[j];
                    j++;
                }
            }
        }
        for (int suma : sumaArrays) {
            System.out.print(suma + " ");
        }
    }
}
