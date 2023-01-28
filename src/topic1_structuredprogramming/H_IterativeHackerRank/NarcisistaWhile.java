package topic1_structuredprogramming.H_IterativeHackerRank;

import java.util.Scanner;

public class NarcisistaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int suma = 0;
        int copia_numero = numero;
        while (copia_numero > 0) {
            int ultimoDigito = copia_numero % 10;
            suma += Math.pow(ultimoDigito, 3);
            copia_numero = copia_numero / 10;
        }
        boolean esNarcisista = suma == numero;
        String sol = (esNarcisista) ? "TRUE": "FALSE";
        System.out.println(sol);
    }

}
