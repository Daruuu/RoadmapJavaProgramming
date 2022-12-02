package Topic1_StructuredProgramming.H_IterativeHackerRank;

import java.util.Scanner;

public class CopiasAutomaticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println(text);
    }
}
