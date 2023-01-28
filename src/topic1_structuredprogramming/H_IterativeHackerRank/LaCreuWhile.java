package topic1_structuredprogramming.H_IterativeHackerRank;

import java.util.Scanner;

public class LaCreuWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("N ha de ser imparell i positiu\n");
        } else {
            int filas = 0;
            while (filas < n) {
                int columnas = 0;
                while (columnas < n) {
                    if (filas == columnas || filas + columnas == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    columnas++;
                }
                System.out.println("");
                filas++;
            }
        }
    }
}
