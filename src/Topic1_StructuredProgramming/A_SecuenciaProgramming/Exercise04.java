package Topic1_StructuredProgramming.A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 3 numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sumaNumeros = num1 + num2 + num3;
        int mediaAritmetica = sumaNumeros/3;
        System.out.println("media aritmetica: " + mediaAritmetica);
    }
}
