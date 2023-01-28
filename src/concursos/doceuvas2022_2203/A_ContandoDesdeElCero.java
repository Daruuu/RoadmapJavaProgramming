package concursos.doceuvas2022_2203;

import java.util.Scanner;

public class A_ContandoDesdeElCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //casos pruebas
        int i = 0;
        while (i < n) {
            int numero = sc.nextInt();
            if (numero < 0) {
                System.out.println(numero);
            }
            if (numero > 0) {
                System.out.println(numero - 1);
            }
            i++;
        }
    }
}
