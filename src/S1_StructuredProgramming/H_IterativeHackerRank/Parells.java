package S1_StructuredProgramming.H_IterativeHackerRank;

import java.util.Scanner;

public class Parells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
