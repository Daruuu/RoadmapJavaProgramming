package L_StringsHackerRank;

import java.util.Scanner;

public class MissatgeReduit_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                System.out.print(str.charAt(i));
            }
            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));
            }
            if (str.charAt(i) == ' ') {
                System.out.print(str.charAt(i - 1) + " " + str.charAt(i + 1));
            }
        }
    }
}
