package topic2_ModularProgramming.recursion;

public class Exercise07 {

    //7. Programa un algoritmo recursivo capaz de invertir un número.
    // Ej: dado el 123 queremos conseguir el 321. (Pista, es necesario pasar dos parámetros a la función)
    public static void main(String[] args) {

        // numInverso(123);
        System.out.println();
//        numInverso(1,123);
        System.out.println(numInverso(100, 123));
    }

    /*
    123%10 = 3
    123/10 = 12
    12/10 = 1
     */
    public static void numInverso(int n) {
        if (n == 0) return;
        System.out.print(n%10);
        numInverso(n/10);
    }

    public static int numInverso(int a, int n) {
        if (n == 0) return 0;
        int numInverso = n%10 * a;
        return numInverso + numInverso(a/10, n/10);
    }


}
