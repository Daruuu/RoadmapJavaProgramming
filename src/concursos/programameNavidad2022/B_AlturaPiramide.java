package concursos.programameNavidad2022;

import java.util.Scanner;

public class B_AlturaPiramide {

    // n casos prueba mientra != 0
    // numero entre 1 y 2.000.000.000
    // salida:
    // minima altura posible de la piramide contruida(num niveles)
    // en las que se haya utilizado todos los bloques de piedra
    // nivel 1: cuadrado == 1 bloque
    // nivel 2: cuadrado 3 x 3
    // nivel 3: cuadrado 5 x 5
    // nivel 4: cuadrado 7 x 7
    public static void main(String[] args) {
        nivelesPiramide();
    }

    public static void nivelesPiramide() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int sumaBloquesPorAltura = 0;
            int contadorAltura = 0;
            for (int altura = 1; altura < 2000000000; altura += 2) {
                ++contadorAltura;
                sumaBloquesPorAltura += altura * altura;
                if (n <= sumaBloquesPorAltura) {
                    System.out.println(contadorAltura);
                    break;
                }
            }
            n = sc.nextInt();
        }
    }
}
