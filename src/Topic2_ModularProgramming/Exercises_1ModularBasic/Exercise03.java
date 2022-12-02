package Topic2_ModularProgramming.Exercises_1ModularBasic;

import java.util.Scanner;

/*
3. (max) Fer una funció que donats dos nombres ens retorni el màxim.
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        numeroMaximo(a,b);
    }

    public static void numeroMaximo(int num1, int num2){
        System.out.println(Math.max(num1, num2));
    }
}
