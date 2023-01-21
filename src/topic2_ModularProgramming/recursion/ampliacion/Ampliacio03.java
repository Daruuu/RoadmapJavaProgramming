package topic2_ModularProgramming.recursion.ampliacion;

public class Ampliacio03 {

    //3. Programar un método recursivo que transforme un número entero positivo a notación binaria.
    public static void main(String[] args) {
        System.out.println(numEnteroABinario(12));
    }

    public static int numEnteroABinario( int n) {
//        int remainder = ;
        if (n == 0)
            return 0;
        else if (n == 1) {
            return 1;
        }
//        System.out.println(n/2);
        return numEnteroABinario(n/2 + (n%2));
    }
}
