package topic1_StructuredProgramming.BonusTrack;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRalla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        String[] arrayStr = new String[3];
        for (int i = 0; i < 3; i++) {
            arrayStr[i] = sc.next();
        }
        char x = 'x';
        char o = 'O';
        char vacio =  '-';
        for (int i = 0; i < arrayStr.length; i++) {
            String[] linea1 = arrayStr[0].split("");
            if (arrayStr[i].charAt(0) == x){

            }
        }
        System.out.println(Arrays.toString(arrayStr));
         */
        char[][] arrayChars = new char[3][3];
        for (int i = 0; i < arrayChars.length; i++) {
            String linea = sc.next();
            for (int j = 0; j < arrayChars[i].length; j++) {
                arrayChars[i][j] = sc.next().charAt(0);
            }
        }

        char x = 'x';
        char o = 'O';
        char vacio = '-';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                if (arrayChars[j][0] == x ){
//                    System.out.println("x");
//                }if (arrayChars[])
            }
        }
        System.out.println(Arrays.deepToString(arrayChars));

    }
}
