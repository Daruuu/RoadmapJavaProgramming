package topic2_ModularProgramming.exercises_1ModularBasic;

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
        System.out.println(maximo(a,b));
    }

    public static void numeroMaximo(int num1, int num2){
        System.out.println(Math.max(num1, num2));
    }
    public static String maximo(int n1, int n2){
        return n1 > n2 ? "maximo primero" : "maximo segundo";
    }
}
