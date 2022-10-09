package H_IterativeHackerRank;

import java.util.Scanner;

public class SumaNNumsDiv11For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i++) {
            int numeros = sc.nextInt();
            if (numeros % 11 == 0){
                suma = suma + numeros;
            }
        }
        System.out.println(suma);
    }
}
