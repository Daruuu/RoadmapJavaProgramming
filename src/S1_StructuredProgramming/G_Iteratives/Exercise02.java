package S1_StructuredProgramming.G_Iteratives;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while (n1 < n2){
            if (n1 % 2 == 0){
                System.out.println(n1);
            }
            n1--;
        }
    }
}
