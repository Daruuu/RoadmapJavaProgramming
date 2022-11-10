package J_ArraysHackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Pangrama_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        boolean pangrama = true;
        ArrayList<Character> arrayAlphabet = new ArrayList<Character>();
        Character[] arrAlp = new Character[alfabet.length()];
//        for (int i = 0; i < alfabet.length(); i++) {
//            arrAlp[i] = alfabet.charAt(i);
//        }
        for (int i = 0; i < alfabet.length(); i++) {
            arrayAlphabet.add(alfabet.charAt(i));
        }
//        System.out.println(Arrays.toString(arrayAlphabet));
        for (int i = 0; i < input.length(); i++) {
        }

        String resultado = pangrama ? "TRUE" : "FALSE";
        System.out.println(resultado);
    }
}