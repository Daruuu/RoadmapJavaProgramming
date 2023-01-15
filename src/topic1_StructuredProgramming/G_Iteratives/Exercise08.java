package topic1_StructuredProgramming.G_Iteratives;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int resultado = 0;

        while (i < b){
            resultado += a;
            i++;
        }
        System.out.println(resultado);
    }
}
