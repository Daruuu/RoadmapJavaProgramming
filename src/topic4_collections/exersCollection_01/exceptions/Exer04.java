package topic4_collections.exersCollection_01.exceptions;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        Exer04 e4 = new Exer04();

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce numero: ");
            int number = sc.nextInt();

            if (number >= 0) {
                e4.imprimirNegatiu(number);
            } else {
                e4.imprimirPositiu(number);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void imprimirPositiu(int p) throws Exception {
        if (p < 0)
            throw new Exception("el numero es negativo");
        System.out.println(p);
    }

    void imprimirNegatiu(int n) throws Exception {
        if (n >= 0)
            throw new Exception("el numero es positivo o cero");
        System.out.println(n);
    }
}
