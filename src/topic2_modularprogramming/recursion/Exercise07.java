package topic2_modularprogramming.recursion;

public class Exercise07 {

    //7. Programa un algoritmo recursivo capaz de invertir un número.
    // Ej: dado el 123 queremos conseguir el 321. (Pista, es necesario pasar dos parámetros a la función)
    public static void main(String[] args) {
//        System.out.println(numInverso(100, 123));
        numero(123);
    }

    /*
    123%10 = 3
    123/10 = 12
    12/10 = 1
     */
    public static void numero(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        numero(n / 10);
    }

    public static int numInverso(int a, int n) {
        if (n == 0) return 0;
        int numInverso = n % 10 * a;
        return numInverso + numInverso(a / 10, n / 10);
    }
}