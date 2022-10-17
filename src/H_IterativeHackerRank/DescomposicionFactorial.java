package H_IterativeHackerRank;

import java.util.Scanner;

public class DescomposicionFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int variable = 2;
        while (i != num) {
            if (num % i == 0)
                System.out.println(i);
            i++;
        }
    }
}
