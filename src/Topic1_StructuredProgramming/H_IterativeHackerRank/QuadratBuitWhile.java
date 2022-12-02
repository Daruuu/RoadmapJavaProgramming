package Topic1_StructuredProgramming.H_IterativeHackerRank;

import java.util.Scanner;

public class QuadratBuitWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("N ha de ser NO negatiu");
        } else {
            int filas = 0;
            while (filas < n) {
                int columnas = 0;
                while (columnas < n) {
                    if (filas == 0 || filas == n - 1 || columnas == 0 || columnas == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    columnas++;
                }
                System.out.println();
                filas++;
            }
        }
    }
}
