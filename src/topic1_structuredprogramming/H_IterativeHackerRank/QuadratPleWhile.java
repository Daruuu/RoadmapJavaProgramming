package topic1_structuredprogramming.H_IterativeHackerRank;

import java.util.Scanner;

public class QuadratPleWhile {
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
                    System.out.print("*");
                    columnas++;
                }
                System.out.println();
                filas++;
            }
        }
    }
}
