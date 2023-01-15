package topic1_StructuredProgramming.C_Conditionals;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 2 numeros:\n");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int restar = numero1 - numero2;
        int multiplicar = numero1 * numero2;
        int dividir = numero1 * numero2;
        System.out.println("elige una opcion: \n 1) resta \n 2) multiplicacion \n 3) division");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("resta: " + restar);
                break;
            case 2:
                System.out.println("multiplicacion: " + multiplicar);
                break;
            case 3:
                System.out.println("dividir: " + dividir);
        }
    }
}
