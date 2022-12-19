package PROGRAMAME;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int piedra = sc.nextInt();
        while (piedra != 0){
            System.out.print("");
            System.out.println(contador++);
            piedra = sc.nextInt();
        }
//        System.out.println();
    }
}
