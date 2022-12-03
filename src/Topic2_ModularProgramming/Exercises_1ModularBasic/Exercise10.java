package Topic2_ModularProgramming.Exercises_1ModularBasic;

import java.util.Scanner;

/*
10. Fer un programa que reculli des de teclat dos nombres i presenti una sèrie d'opcions corresponents a operacions aritmètiques (suma, resta, multiplicació, divisió).
Segons l'opció escollida es crida una funció que retorni el valor del resultat de l'operació. Si es vol seguir operant s'ha de contestar 'S' a un missatge que digui "Vols continuar?”. Per acabar el programa s'ha de contestar 'N'.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Elige una opcion:\n1. suma\n2. resta\n3.multiplicacion\n4.division");
        boolean salir = false;
        while (!salir) {
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    suma(num1, num2);
                    break;
                case 2:
                    resta(num1, num2);
                    break;
                case 3:
                    multiplicacion(num1, num2);
                    break;
                case 4:
                    division(num1, num2);
                    break;
                default:
                    System.out.println("Has de seleccionar una de las 4 opciones:");
                    salir = true;
                    break;
            }
        }

    }

    public static void suma(int a, int b) {
        System.out.println(a+b);
    }

    public static void resta(int a, int b) {
        System.out.println(a-b);
    }

    public static void multiplicacion(int a, int b) {
        System.out.println(a*b);
    }

    public static void division(int a, int b) {
        System.out.println(a/b);
    }

}
