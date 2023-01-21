package topic2_ModularProgramming.recursion.ampliacion;

public class Ampliacio03 {

    //3. Programar un método recursivo que transforme un número entero positivo a notación binaria.
    public static void main(String[] args) {
//        System.out.println(numEnteroABinario(12));
        numEnteroABinario(12);
    }

    public static void numEnteroABinario(int n) {
        if (n == 1) {
            System.out.print(n % 2);
            return;
        }
        numEnteroABinario(n / 2);
        System.out.print(n % 2);
    }
}
