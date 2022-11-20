package K_ArraysHackerRank;

import java.util.Scanner;

public class PangramaSol2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        input = input.replaceAll(" ", "");
        int[] lengthAlfabeto = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int pos = input.charAt(i) - 'a';    //a=97    z=122
            ++lengthAlfabeto[pos];
        }
        boolean pangrama = true;
        for (int lenAlf : lengthAlfabeto) {
            if (lenAlf == 0) {
                System.out.println("FALSE");
                pangrama = false;
                break;
            }
        }
        if (pangrama)System.out.println("TRUE");
    }
}
