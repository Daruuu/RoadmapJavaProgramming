package S1_StructuredProgramming.H_IterativeHackerRank;

import java.util.Scanner;

public class LaLinea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        if (n < 0) {
            System.out.println("N ha de ser NO negatiu\n");
        } else {
            while (i < n) {
                System.out.print("*");
                i++;
            }
        }
    }
}
