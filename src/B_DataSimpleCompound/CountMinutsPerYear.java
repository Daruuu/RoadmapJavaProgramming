package B_DataSimpleCompound;

import java.util.Scanner;

public class CountMinutsPerYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        int minutos = sc.nextInt();

        int horasTotales = 23;
        int minutosTotales = 60;

        int horaActual = horasTotales - horas;
        int minutoActual = minutosTotales - minutos;
        int diaTotal = horasTotales * minutosTotales + minutosTotales;

        if (horaActual == 0 && minutoActual == 0) System.out.println(diaTotal);
        else if (horaActual != 0) System.out.println(horaActual);
        else System.out.println(minutoActual);

    }
}
