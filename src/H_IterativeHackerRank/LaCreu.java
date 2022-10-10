package H_IterativeHackerRank;

import java.util.Scanner;

public class LaCreu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("N ha de ser imparell i positiu");
        } else {
            for (int filas = 0; filas < n; filas++) {
                for (int columnas = 0; columnas < n; columnas++) {
                    if (filas == columnas || filas + columnas == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
