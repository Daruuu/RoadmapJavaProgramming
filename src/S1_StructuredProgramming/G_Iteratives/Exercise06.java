package S1_StructuredProgramming.G_Iteratives;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponente = sc.nextInt();
        int i = 1;
        int resultado = 1;

        while (i <= exponente){
            resultado = resultado * base;
            i++;
        }
        System.out.println(resultado);
        //System.out.println(Math.floor(Math.pow(base,exponente)));
    }
}
