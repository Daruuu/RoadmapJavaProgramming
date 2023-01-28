package topic2_modularprogramming.recursion;

public class Exercise05 {

    //  5. Programa un algoritmo recursivo capaz de sumar las cifras de un número.
    public static void main(String[] args) {
        System.out.println(sumarCifrasNumero(123));
    }

    public static int sumarCifrasNumero(int n) {
        if (n == 0)
            return 0;
        return n%10 + sumarCifrasNumero(n / 10);

    }
}
