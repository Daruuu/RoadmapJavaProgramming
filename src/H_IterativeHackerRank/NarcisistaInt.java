package H_IterativeHackerRank;

import java.util.Scanner;

public class NarcisistaInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numCifras = 0;
        boolean numNarcisista = false;

        while (numero > 0) {
            numCifras = numero % 10;
            numero = numero / 10;
        }
        if (numNarcisista == true)
            System.out.println("TRUE");
        else System.out.println("FALSE");

    }

}
