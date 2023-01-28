package topic1_structuredprogramming.C_Conditionals;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int valorMaximoResta = sc.nextInt();
        int resta = num1 - num2;
        if (resta > valorMaximoResta) System.out.println(resta);
        else System.out.println("la resta es menor que " + valorMaximoResta);
    }
}
