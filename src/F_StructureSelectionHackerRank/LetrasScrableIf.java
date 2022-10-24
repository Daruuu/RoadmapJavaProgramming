package F_StructureSelectionHackerRank;

import java.util.Scanner;

public class LetrasScrableIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);

        if (letra == 'A' ||
                letra == 'E' ||
                letra == 'I' ||
                letra == 'O' ||
                letra == 'U' ||
                letra == 'L' ||
                letra == 'N' ||
                letra == 'R' ||
                letra == 'S' ||
                letra == 'T') {
            System.out.println(1);
        } else if (letra == 'D' || letra == 'G') {
            System.out.println(2);
        } else if (letra == 'B' || letra == 'C' || letra == 'M' || letra == 'P') {
            System.out.println(3);
        } else if (letra == 'F' || letra == 'H' || letra == 'V' || letra == 'W' || letra == 'Y') {
            System.out.println(4);
        } else if (letra == 'K') {
            System.out.println(5);
        } else if (letra == 'J' || letra == 'X') {
            System.out.println(8);
        } else if (letra == 'Q' || letra == 'Z') {
            System.out.println(10);
        }
    }
}
