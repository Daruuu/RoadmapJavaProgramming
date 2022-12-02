package Topic1_StructuredProgramming.M_StringsHackerRank;

import java.util.Scanner;

public class EsborraSubstring_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String subcadena = sc.nextLine();
        String result = str;
        if (str.contains(subcadena)) {
            result = result.replaceFirst(subcadena, "");
        }
        System.out.println(result);
    }
}
