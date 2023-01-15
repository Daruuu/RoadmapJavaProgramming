package topic2_ModularProgramming.exercises_1ModularBasic;

import java.util.Scanner;

/*
2. (esPrimer) Fer una funció que rebi un nombre natural i ens retorni true si és primer i false si no ho és.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(esPrimo(n));
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
