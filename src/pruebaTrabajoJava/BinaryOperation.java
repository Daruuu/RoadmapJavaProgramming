package pruebaTrabajoJava;

import java.util.Scanner;

public class BinaryOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        

        // 1 2 4 8 16 32 64 128 256 528 1024
        // 0 1 2 3 4  5  6
        // n = 36
        // si n=32, n = n - 2^5 = 0
        // n - 2^x = 0 => n = 2^x => log(n) = x
        while(n > 0) {
            n = (int) (n - Math.pow(2, i));
            ++i;
        }
    }

}
