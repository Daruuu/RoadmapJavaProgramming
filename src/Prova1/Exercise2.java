package Prova1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precio = sc.nextInt();
        int edad = sc.nextInt();
        int diaSemana = sc.nextInt();
        boolean cupoDescompte = sc.hasNext();
        int precioTicket = 0;

        if (edad < 6) {
            System.out.println("entrada gratuita");
        }
        if (edad < 18) {
            precioTicket = precio - ((precio * 10) / 100);
        }
        if (edad >= 65) {
            precioTicket = precio - ((precio * 15) / 100);
        }

        if (diaSemana == 3) {
            // precioTicket = precioTicket * 0.25;
            precioTicket = (precioTicket * 25) / 100;
        } else if (diaSemana == 6 || diaSemana == 7) {
            precioTicket = precioTicket + ((precio * 5) / 100);
        }
        if (cupoDescompte) {
            precioTicket = precio - ((precio * 30) / 100);
        }
        System.out.println(precioTicket);


    }
}
