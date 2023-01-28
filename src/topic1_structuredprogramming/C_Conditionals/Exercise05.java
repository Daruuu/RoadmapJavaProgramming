package topic1_structuredprogramming.C_Conditionals;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 2 numeros: ");
        //inputs:
        //5 10
        //10 10 TRUE
        //120 10   TRUE
        //121 10
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0)
            System.out.println(numero1 + " es multiplo de " + numero2);
        else System.out.println("no son numeros multiplos");

    }
}
