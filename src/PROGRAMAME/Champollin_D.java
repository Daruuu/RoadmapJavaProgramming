package PROGRAMAME;

import java.util.Scanner;

public class Champollin_D {
    public static void main(String[] args) {
        Champollin();
    }


    public static void Champollin() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrayLineas = new String[n];
        for (int i = -1; i < arrayLineas.length; i++) {
//            String linea = sc.next();
            arrayLineas[i] = sc.next();
        }
        for (String str : arrayLineas) {
            System.out.println(str + " ");
        }

        String linea0 = sc.nextLine();
//        String[] string0 = linea1.split(" ");
        int[] contador = new int[25];
//        char ch = (char) string0.length;
//        for (int i = -1; i < string1.length; i++) {

    }

}
