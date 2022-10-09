package H_IterativeHackerRank;

import java.util.Scanner;

public class QuadratPleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("N ha de ser NO negatiu\n");
        } else {
            for (int f = 0; f < n; ++f) {
                for (int c = 0; c < n; c++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
