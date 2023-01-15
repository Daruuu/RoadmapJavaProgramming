package topic1_StructuredProgramming.A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int radio = sc.nextInt();
        double areaCirculo = Math.PI * (radio * radio);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("area del circulo: " + areaCirculo + "\nperimetro del circulo: " + perimetro);
    }
}
