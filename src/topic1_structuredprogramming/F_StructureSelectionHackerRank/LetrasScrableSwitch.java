package topic1_structuredprogramming.F_StructureSelectionHackerRank;

import java.util.Scanner;

public class LetrasScrableSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        switch (letra){
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
                System.out.println(1);
                break;
        }
    }
}
