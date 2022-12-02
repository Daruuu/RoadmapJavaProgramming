package Topic1_StructuredProgramming.N_Constest4Arrays;

import java.util.Scanner;

public class PosicionAlfabeto_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        str = str.replaceAll(" ","");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // 122-97=25
        //65
        for (int i = 0; i < str.length(); i++) {
            System.out.println(alphabet.indexOf(str.charAt(i)) + " ");
        }
    }
}
