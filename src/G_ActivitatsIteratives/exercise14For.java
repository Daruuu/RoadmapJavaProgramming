package G_ActivitatsIteratives;

import java.util.Scanner;

public class exercise14For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();
            if (numero > maximo)
                maximo = numero;
            if (numero < minimo)
                minimo = numero;
        }
        System.out.println("maximo: " + maximo + "\nminimo: " + minimo);
    }
}
