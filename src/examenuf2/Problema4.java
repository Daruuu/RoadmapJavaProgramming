package examenuf2;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        escriuMultiplesTres(numero);
    }

    public static void escriuMultiplesTres(int n) {
        if (n < 3)
            return;
        escriuMultiplesTres(n - 1);
        if (n % 3 == 0) {
            System.out.print(n + " ");
        }
    }


}
