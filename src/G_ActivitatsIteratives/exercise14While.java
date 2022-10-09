package G_ActivitatsIteratives;

import java.util.Scanner;

public class exercise14While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        int i = 0;
        while (i < n){
            int numero = sc.nextInt();
            i++;
            if (numero > maximo) maximo = numero;
            if (numero < minimo) minimo = numero;
        }
        System.out.println("maximo: " + maximo + "\nminimo: " + minimo);
    }
}
