package Topic1_StructuredProgramming.H_IterativeHackerRank;

import java.util.Scanner;

public class RecorregutDecreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while (n1 >= n2){
            System.out.println(n1);
            n1-=1;
        }
    }
}
