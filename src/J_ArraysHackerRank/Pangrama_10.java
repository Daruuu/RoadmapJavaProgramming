package J_ArraysHackerRank;

import java.util.Scanner;

public class Pangrama_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        boolean pangrama = false;
        for (int i = 0; i < input.length(); i++) {
            if (!input.contains(Character.toString(alfabet.charAt(i)))) {
                pangrama = true;
                break;
            }
        }
        if (pangrama) System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}
