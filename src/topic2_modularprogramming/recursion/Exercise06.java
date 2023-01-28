package topic2_modularprogramming.recursion;

/*
6. Calcula el número de fibonnacci a partir de un número dado. (Serie de Fibonnacci)
 */
public class Exercise06 {
    public static void main(String[] args) {

        System.out.println(fibonacci(8));
    }

    // cada numero es igual a la suma del anterior
    // 0 1
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
