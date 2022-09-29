package B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class ContarMinutsPerFinalAnyo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        int minutos = sc.nextInt();

        int horasTotales = 23;
        int minutosTotales = 60;

        int horaActual = horasTotales - horas;
        int minutoActual = minutosTotales - minutos;
        int diaTotal = horasTotales * minutosTotales + minutosTotales;
        //System.out.println(diaTotal);
        if (horaActual == 0 && minutoActual == 0) System.out.println(diaTotal);

        if (horaActual != 0) System.out.println(horaActual);
        else System.out.println(minutoActual);

    }
}
