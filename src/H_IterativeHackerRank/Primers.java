package H_IterativeHackerRank;

import java.util.Scanner;

public class Primers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int contador = 0;   //contar valores
        if (n <= 1) {
            System.out.println("FALSE");
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                contador++;
        }
        if (contador >= 1)
            System.out.println("FALSE");
        else
            System.out.println("TRUE");
    }
}
