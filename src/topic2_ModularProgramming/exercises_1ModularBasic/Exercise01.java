package topic2_ModularProgramming.exercises_1ModularBasic;

import java.util.Scanner;

/*
1. (signe) Fer una funció que rebi un enter i retorni la cadena "negatiu”, "zero” o "positiu” segons si l'enter és negatiu, zero o positiu.
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        int n = sc.nextInt();
        System.out.println(signe(n));
    }

    public static String signe(int num) {
        if (num > 0) return "positivo";
        else if (num < 0) return "negativo";
        else return "zero";
    }
}
