package topic1_structuredprogramming.N_Constest4Arrays;

import java.util.Scanner;

public class DelReves_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequencia = new int[n];
        for (int i = 0; i < n; i++) {
            sequencia[i] = sc.nextInt();
        }
        for (int i = sequencia.length - 1; i >= 0; i--) {
            System.out.print(sequencia[i] + " ");
        }
    }
}
