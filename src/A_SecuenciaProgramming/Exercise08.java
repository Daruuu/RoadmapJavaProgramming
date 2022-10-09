package A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("horas: ");
        int hora = sc.nextInt();    //1hora = 3600 segundos
        System.out.println("minutos: ");
        int minutos = sc.nextInt(); //1 minutos = 60 segundos
        System.out.println("segundos: ");
        int segundos = sc.nextInt();
        int segundosTotal = hora * 3600 + minutos * 60 + segundos;
        System.out.println("hora en segundos: " + segundosTotal);
    }
}
