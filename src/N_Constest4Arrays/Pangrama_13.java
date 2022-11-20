package N_Constest4Arrays;

import java.util.Scanner;

public class Pangrama_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        str = str.replaceAll(" ", "");
        int[] lengthAlfabet = new int[26];
        int i = 0;
        while (i < str.length()) {
            int posicion = str.charAt(i) - 'a';
            lengthAlfabet[posicion]++;
            i++;
        }
        int color = 0;
        boolean pangrama = true;
        for (int length : lengthAlfabet) {
            if (length == 0){
                System.out.print("false");
                pangrama = false;
                break;
            }
        }
        if (pangrama) System.out.println("true");

//        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
//        System.out.println(str);
//        Character[] alfabethChar = new Character[alfabeto.length()];
//        char[] ch = alfabeto.toCharArray();
//        int j = 0;
//        for (int i = 0; i < ch.length; i++) {
//            alfabethChar[j] = ch[i];
//            j++;
//        }
//        int[] contador = new int[alfabethChar.length];
//
//
//
//        System.out.println(Arrays.toString(alfabethChar));

    }
}