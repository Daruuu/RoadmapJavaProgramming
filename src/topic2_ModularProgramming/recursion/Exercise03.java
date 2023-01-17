package topic2_ModularProgramming.recursion;

public class Exercise03 {
    /*
    3. Escribe un programa que visualice los N primeros números naturales:

      Dado un N que muestre-> 1 2 3 4 5 ... N
     */
    public static void main(String[] args) {
        numNaturales(5);
    }

    public static void numNaturales(int n) {
        if (n == 0) {
            return;
        }
        numNaturales(n - 1);
        System.out.print(n + " ");
    }

}
