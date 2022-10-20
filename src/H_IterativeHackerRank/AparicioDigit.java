package H_IterativeHackerRank;

import java.util.Scanner;

public class AparicioDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int x = sc.nextInt();

        int contador = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito == x) {
                contador++;
            }
            numero = numero / 10;
        }
        System.out.println(contador);
    }
}
