package H_IterativeHackerRank;

import java.util.Scanner;

public class SumaNNumsDiv11While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int suma = 0;
        while (i < n) {
            int numsN = sc.nextInt();
            if (numsN % 11 == 0) {
                suma = suma + numsN;
            }
            i++;
        }
        System.out.println(suma);
    }
}
