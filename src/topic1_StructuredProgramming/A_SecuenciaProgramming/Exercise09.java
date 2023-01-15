package topic1_StructuredProgramming.A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce segundos totales: ");
        int segundosTotales = sc.nextInt();
        int horaTotal = segundosTotales / 3600;
        int segundoRestante = segundosTotales % 3600;
        int minutosTotal = segundoRestante / 60;
        int segundosFinal = segundoRestante % 60;
        System.out.println(horaTotal + ":" + minutosTotal + ":" + segundosFinal);
    }
}
