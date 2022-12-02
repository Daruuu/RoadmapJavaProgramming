package Topic1_StructuredProgramming.C_Conditionals;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        if (numero1 % 2 == 0 && numero1 % 3 == 0 && numero1 % 5 == 0) {
            System.out.println(numero1 + " es divisible de 2, 3, 5 y 10");
        }else System.out.println(numero1 + " no es divible de 2, 3, 5 y 10");

        if (numero2 % 2 == 0 && numero2 % 3 == 0 && numero2 % 5 == 0) {
            System.out.println(numero2 + " es divisible de 2, 3, 5 y 10");
        }else System.out.println(numero1 + " no es divible de 2, 3, 5 y 10");

        if (numero3 % 2 == 0 && numero3 % 3 == 0 && numero3 % 5 == 0){
            System.out.println(numero3 + " es divisible de 2, 3, 5 y 10");
        }else System.out.println(numero1 + " no es divible de 2, 3, 5 y 10");
    }
}
