package topic1_structuredprogramming.I_ExercisisArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce cantidad array:");
        int n = sc.nextInt();
        int[] pesosPersonas = new int[n];
        for (int i = 0; i < pesosPersonas.length; i++) {    //66 54 89 67 70
            if (pesosPersonas[i] >= 50 || pesosPersonas[i] <= 100) {
                pesosPersonas[i] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(pesosPersonas));
        Arrays.sort(pesosPersonas);
        int[] cantidadPesos = new int[100];
        for (int i = 0; i < pesosPersonas.length; i++) {
            cantidadPesos[pesosPersonas[i]] = cantidadPesos[pesosPersonas[i] + 1];
        }
        System.out.println();
        for (int i = 0; i < cantidadPesos.length; i++) {
            if (cantidadPesos[i] > 0) {
                System.out.print(i + " ");
                for (int j = 0; j < cantidadPesos[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
