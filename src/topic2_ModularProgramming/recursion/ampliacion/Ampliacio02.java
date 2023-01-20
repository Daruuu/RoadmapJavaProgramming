package topic2_ModularProgramming.recursion.ampliacion;

public class Ampliacio02 {

    //  2. Programar un algoritmo recursivo que calcule el Máximo común divisor de dos números.
    public static void main(String[] args) {

    }

    public static int maximoComunDivisor(int a, int b, int i) {
//        if ()
            return maximoComunDivisor(a / i, b / i, i - 1);
    }
}
