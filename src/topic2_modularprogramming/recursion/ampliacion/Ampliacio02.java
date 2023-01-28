package topic2_modularprogramming.recursion.ampliacion;

public class Ampliacio02 {

    //  2. Programar un algoritmo recursivo que calcule el Máximo común divisor de dos números.
    public static void main(String[] args) {
        System.out.println(maximoComunDivisor(12,18));
    }
    /*
    12/1 12/2 12/3 12/4 12/5 12/6
    12     6    4   3   NO     2
    18/1 18/2 18/3 18/4 18/5 18/6
    18     9    6   NO  NO     3
     */
    public static int maximoComunDivisor(int a, int b) {
        if (b == 0)
            return a;
        return maximoComunDivisor( b,a % b);
    }
}
