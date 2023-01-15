package concursos.codeline;

public class Recursivitat {
    public static void main(String[] args) {
        escriuMultiplesTres(100);
    }

    public static void escriuMultiplesTres(int n) {
        if (n == 0) {
            return;
        }
        escriuMultiplesTres(n - 1);
        if (n % 3 == 0) {
            System.out.print(n + ", ");
        }
    }
}
