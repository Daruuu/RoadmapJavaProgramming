package topic2_modularprogramming.recursion;

public class Exercise04 {
    /*
    4. Escribe un programa que visualice los N primeros números naturales en sentido inverso:

      Dado un N que muestre-> N N-1 ... 3 2 1
     */
    public static void main(String[] args) {
        numNaturalesInverso(10);
    }

    public static void numNaturalesInverso(int n) {
        System.out.print(n + " ");
        if (n == 0) return;
        numNaturalesInverso(n - 1);
    }
}
