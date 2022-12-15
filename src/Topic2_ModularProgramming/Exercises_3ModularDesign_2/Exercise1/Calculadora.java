package Topic2_ModularProgramming.Exercises_3ModularDesign_2.Exercise1;

import java.util.Scanner;
/*
1. Calculadora.
Anem a definir el problema clàssic de la calculadora en més d'una classe.

En una classe que definirem com a Calculadora, per tant el nom del fitxer s'ha de dir Calculadora.java,
hi haurà un mètode main que contindrà un menú amb diferents opcions d'operacions:
suma, resta, multiplicació, divisió i residu (mod).

Tindrem una segona classe Operacions, per tant el nom del fitxer serà Operacions.java, que no contindrà cap main, sinó que contindrà els
mètodes que necessita Calculadora per a realitzar les operacions.
 */
public class Calculadora {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        menuOpciones();
        System.out.println("introduce 2 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int opcion = sc.nextInt();
        while (opcion != -1) {
            switch (opcion) {
                case 1:
                    System.out.println(Operaciones.suma(a,b));
                    break;
                case 2:
                    System.out.println(Operaciones.resta(a,b));
                    break;
                case 3:
                    System.out.println(Operaciones.multiplicacion(a,b));
                    break;
                case 4:
                    System.out.println(Operaciones.division(a,b));
                    break;
                case 5:
                    System.out.println(Operaciones.modulo(a,b));
                    break;
                default:
                    System.out.println("introduce una opcion correcta:");
            }
            opcion = sc.nextInt();
        }
    }

    public static void menuOpciones(){
        System.out.println("1. Suma:\n" +
                "2. Resta:\n" +
                "3. Multiplicacion:\n" +
                "4. Division:\n" +
                "5. Modulo:");
    }
}
