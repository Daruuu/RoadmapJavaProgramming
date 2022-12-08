package Topic2_ModularProgramming.Exercises_2ModularDesign_1;


import java.util.Arrays;

/*
1) Feu un programa anomenat OrdenarPerZeros que, donat un array de números enters inicialitzat amb valors concrets,
primer el mostri per pantalla i després el mostri ordenat de manera ascendent d'acord al nombre de 0 de cada valor.
Declareu array com a variable dins el mètode principal.

A mode d'exemple, el comportament del programa podria ser el següent:

[ 100 2014 12 30 302 40020 7009 500000 ]
[ 500000 40020 7009 100 2014 30 302 12 ]
 */
public class Exercise01 {

    private static int[] array1 = new int[]{100, 2014, 12, 30, 302, 40020, 7009, 500000};

    public static void main(String[] args) {
        for (int a : array1) {
            System.out.print(a + " ");
        }
        System.out.println();
        ordenarPorZeros();
        for (int a : array1) {
            System.out.print(a + " ");
        }
    }

    public static void ordenarPorZeros() {
        // insertion sort: insertar en la parte izquierda.
        int n = array1.length;
        for (int j = 1; j < n; j++) {
            int key = array1[j];
            int i = j-1;
            while ( (i > -1) && ( ceros(array1[i]) < ceros(key) ) ) {
                array1[i+1] = array1[i];
                i--;
            }
            array1[i+1] = key;
        }
    }
    // 123 mod 10 = 3
    // 123 / 10 = 12
    // 12 mod 10 = 2
    // 12 / 10 = 1
    // 1 mod 10 = 1
    // 1 / 10 = 0
    public static int ceros(int num) {
        int cp = num;
        int contadorCeros = 0;
        while (cp > 0) {
            int ultimoDigito = cp % 10;
            if (ultimoDigito == 0) ++contadorCeros;
            cp = cp / 10;
        }
        return contadorCeros;
    }
}