package H_IterativeHackerRank;

import java.util.Scanner;

public class NumerosAmicsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sumaNum1 = 0;
        int sumaNum2 = 0;
        int i = 1;
        int j = 1;
        while (i <= num1) {
            if (num1 % i == 0) {
                sumaNum1 += i;
            }
            i++;
        }
        //System.out.println(sumaNum1);
        while (j <= num2) {
            if (num2 % j == 0) {
                sumaNum2 += j;
            }
            j++;
        }
        //System.out.println(sumaNum2);
        System.out.println((sumaNum1 == sumaNum2) ? "TRUE" : "FALSE");
    }

}
