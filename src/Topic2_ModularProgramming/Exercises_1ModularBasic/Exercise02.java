package Topic2_ModularProgramming.Exercises_1ModularBasic;

import java.util.Scanner;

/*
2. (esPrimer) Fer una funció que rebi un nombre natural i ens retorni true si és primer i false si no ho és.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        esPrimo(n);
    }

    public static void esPrimo(int numero){
        if (numero % 3 == 0) System.out.println("true");
        else System.out.println("false");
    }
}
