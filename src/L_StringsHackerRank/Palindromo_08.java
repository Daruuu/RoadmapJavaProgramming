package L_StringsHackerRank;

import java.util.Scanner;

public class Palindromo_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        str = str.replaceAll("[.?!\"'*@#$%^&]", "");
        str = str.replaceAll(" ", "");
        boolean palindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }
        String res = palindrome ? "TRUE" : "FALSE";
        System.out.println(res);
    }
}
