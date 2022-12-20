package PROGRAMAME;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlturaPiramide_B {

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
//        alturaPiramide();
    }

    public static void nivelesPiramide(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numeroNivel = 0;    //niveles de la piramide
        List<Integer> integerList = new ArrayList<>();
        while (n != 0){
            integerList.add(n);
            for (int i = 0; i < 2.000000000; i++) {
                if (i % 2 == 0){
                    numeroNivel = i*i;
                }
            }
            n = sc.nextInt();
        }
    }

    public static void alturaPiramide() {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numBloques = 1;
        boolean par = false;
        int nivel;
        int resultadoBloquePorNivel = 0;

        while (numero != 0 && !par) {
            for (nivel = 1; nivel < 2.000000000; nivel++) {
                resultadoBloquePorNivel = numBloques;
            }


            numero = sc.nextInt();
        }
    }

    public static void numeroImpares() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
