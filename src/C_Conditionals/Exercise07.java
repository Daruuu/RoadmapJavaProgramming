package C_Conditionals;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 2 numeros:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println("elige una opcion: \n 1) dividir \n 2) resta \n 3) potencia");

        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println(numero1 / numero2);
                break;
            case 2:
                int resta = numero1 + 10 - numero2;
                if (resta > 0)
                    System.out.println(resta);
                else System.out.println("la resta es menor que 0");
                break;
            case 3:
                System.out.println(Math.pow(numero1, numero2));
                break;
            default:
        }
    }
}
