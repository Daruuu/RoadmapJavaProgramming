package examenuf2;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un string:");
        String cadena = sc.nextLine();
        System.out.println("Introduce el caracter: ");

        char caracterABuscar = sc.next().charAt(0);
        System.out.println(numCharFunction(cadena, caracterABuscar));
        numCharAction(cadena, caracterABuscar);
    }

    public static int numCharFunction(String str, Character ch) {
        int contadorCaracter = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                contadorCaracter++;
            }
        }
        return contadorCaracter;
    }

    public static void numCharAction(String str, Character ch) {
        str = str.toLowerCase();
        int contadorCaracter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                contadorCaracter++;
            }
        }
        if (contadorCaracter > 0) {
            System.out.println("el caracter " + ch + " se repite " + contadorCaracter);
        } else {
            System.out.println("el caracter " + ch + " no se repite");
        }
    }
}
