package Conditionals;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma = num2 + num1;
        if (suma <= 15) System.out.println(suma);
        else System.out.println(" la suma es inferior a 15");
    }
}