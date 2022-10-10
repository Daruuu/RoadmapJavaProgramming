package E_StructuresRepeticioHackerRank;

import java.util.Scanner;

public class FiltrarVocalsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadLetras = sc.nextInt();

        for (int i = 0; i < cantidadLetras; i++) {
            //letra.toLowerCase();
            char caracter = sc.next().charAt(i);
            if (caracter == 'a'
                    || caracter == 'e'
                    || caracter == 'i'
                    || caracter == 'o'
                    || caracter == 'u') {
                System.out.println(caracter);
            }
        }
    }
}
