package H_IterativeHackerRank;

import java.util.Scanner;

public class Primers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("FALSE");
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {

                }
            }
            System.out.println("TRUE");
        }
    }
}
