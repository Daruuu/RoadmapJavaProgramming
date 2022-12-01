package S1_StructuredProgramming.A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base del triangulo: ");
        int baseTriangulo = sc.nextInt();
        System.out.println("introduce la altura del triangulo: ");
        int alturaTriangulo = sc.nextInt();
        System.out.println("area del triangulo es " + (baseTriangulo * alturaTriangulo) /2);
    }
}
