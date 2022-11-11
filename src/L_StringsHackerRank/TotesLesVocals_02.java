package L_StringsHackerRank;

import java.util.Scanner;

public class TotesLesVocals_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int a = str.indexOf("a");
        int e = str.indexOf("e");
        int i = str.indexOf("i");
        int o = str.indexOf("o");
        int u = str.indexOf("u");
        if ((a >= 0) && (e >= 0) && (i >= 0) && (o >= 0) && (u >= 0)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
