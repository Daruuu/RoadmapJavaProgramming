package topic1_structuredprogramming.H_IterativeHackerRank;

import java.util.Scanner;

public class NumerosAmicsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sumaNum1 = 0;
        int sumaNum2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                sumaNum1 += i;
            System.out.println(i);
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0)
                sumaNum2 += i;
        }
        String solucion = (sumaNum1 == sumaNum2) ? "TRUE" : "FALSE";
        System.out.println(solucion);
    }
}