package Topic1_StructuredProgramming.H_IterativeHackerRank;

import java.util.Scanner;

public class Primers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        boolean esPrimo = true;
        while (i < num / 2 && esPrimo) {
            if (num % i == 0) esPrimo = false;
            i++;
        }
        if (!esPrimo)
            System.out.println("FALSE");
        else {
            System.out.println("TRUE");
        }
    }
}
