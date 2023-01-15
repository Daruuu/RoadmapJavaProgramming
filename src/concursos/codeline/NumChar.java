package concursos.codeline;

import java.util.Scanner;

public class NumChar {
    public static void main(String[] args) {
        /*String string = "En una empresa de transport en han demanat";
        int result = numCharFunction(string, 'a');
        System.out.println(result);*/
        numCharACtion();
    }

    /*
     Escriu un mètode que rebi un string i un caràcter i calculi el número d'aparicions del caràcter dins de l'string.
      Implementa el mètode de dues maneres diferents:
     com una funció anomenada numCharFunction (que retorni el número d'ocurrències del caràcter)

     i com una acció anomenada numCharAction (que no retorni res i escrigui el número d'ocurrències per
     pantalla dins la funció)
     */
    public static int numCharFunction(String str, char ch) {
        str = str.toLowerCase();
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                contador++;
            }
        }
        if (contador > 0) return contador;
        else return 0;
    }

    //i com una acció anomenada numCharAction (que no retorni res i escrigui el número d'ocurrències per pantalla dins la funció)
    public static void numCharACtion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println("introduce caracter: ");
        char letra = sc.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                contador++;
            }
        }
        if (contador > 0)
            System.out.println(contador + " letras en la oracion");
        else {
            System.out.println("nunguna letra igual a " + letra);
        }
    }
}
