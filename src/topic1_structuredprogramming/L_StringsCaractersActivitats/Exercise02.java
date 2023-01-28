package topic1_structuredprogramming.L_StringsCaractersActivitats;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean encontrado = false;
        char chVocal = ' ';
        for (int i = 0; i < str.length() && !encontrado; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                encontrado = true;
                chVocal = str.charAt(i);
            }else {
                System.out.println(chVocal);
            }
        }
    }

}
