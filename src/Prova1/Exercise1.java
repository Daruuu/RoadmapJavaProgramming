package Prova1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInput = sc.nextInt();
        int minutoInput = sc.nextInt();
        int segundoInput = sc.nextInt();

        int horaActual = horaInput * 3600;
        int minutoActual = minutoInput * 60;
        int segundoActual = segundoInput % 60;

        int sumaSegundos = horaActual + minutoActual + segundoActual + 1;
        int horaOutput = sumaSegundos / 3600;
        int segundoRestante = sumaSegundos % 3600;
        int minutoOutput = segundoRestante / 60;
        int segundoOutput = segundoRestante % 60;

        System.out.println(horaOutput+":" + minutoOutput + ":" +segundoOutput);
    }
}
