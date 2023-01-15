package topic1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class Histograma_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] pesoPersonas = new int[20];
        for (int i = 0; i < pesoPersonas.length; i++) {
            pesoPersonas[i] = sc.nextInt();
        }
        int[] times = new int[101];
        for (int i = 0; i < pesoPersonas.length; i++)
            ++times[pesoPersonas[i]];

        for (int j = 1; j < times.length; j++) {
            if (times[j] > 0){
                System.out.print(j + " ");
                for (int k = 0; k < times[j]; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}
