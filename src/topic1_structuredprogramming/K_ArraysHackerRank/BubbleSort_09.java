package topic1_structuredprogramming.K_ArraysHackerRank;

import java.util.Scanner;

public class BubbleSort_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nomsEquips = new String[n];
        int[] puntosEquipo = new int[n];
        for (int i = 0; i < n; i++) {
            nomsEquips[i] = sc.next();
            puntosEquipo[i] = sc.nextInt();
        }
        for (int i = 0; i < nomsEquips.length - 1; i++) {
            int temporal = 0;
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (puntosEquipo[j] <= puntosEquipo[j + 1]) {
                    temporal = puntosEquipo[j];
                    puntosEquipo[j] = puntosEquipo[j + 1];
                    puntosEquipo[j + 1] = temporal;
                    String tempEquip = nomsEquips[j];
                    nomsEquips[j] = nomsEquips[j + 1];
                    nomsEquips[j + 1] = tempEquip;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nomsEquips[i] + " " + puntosEquipo[i]);
        }
    }
}
