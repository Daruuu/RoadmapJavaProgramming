package Prova1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            for (int filas = 0; filas < n; filas++) {
                for (int columnas = 0; columnas < n; columnas++) {
                    if (filas < n / 2) {
                        System.out.print("D ");
                    } else if (filas / 2 == columnas / 2 ) {
                        System.out.print("A ");
                    }
                }
                System.out.println();
            }
        }

    }
}
