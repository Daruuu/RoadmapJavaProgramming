package topic1_StructuredProgramming.M_StringsHackerRank;

import java.util.Scanner;

public class Dni_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String[] letrasArr = new String[letras.length()];
        for (int i = 0; i < letras.length(); i++) {
            letrasArr[i] = String.valueOf(letras.charAt(i));
        }
        int residuo = dni % 23;
        String letraDni =  letrasArr[residuo];
        System.out.println(dni+letraDni);
    }
}
