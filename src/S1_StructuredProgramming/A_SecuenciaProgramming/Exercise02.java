package S1_StructuredProgramming.A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce 2 numeros:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int producto = numero1 * numero2;
        int division = numero1 / numero2;
        System.out.println("suma: " + suma +
                "\nresta: " + resta +
                "\nmultiplicacion: " + producto +
                "\ndivision: " + division);
    }
}
