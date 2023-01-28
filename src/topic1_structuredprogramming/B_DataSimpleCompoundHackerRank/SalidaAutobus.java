package topic1_structuredprogramming.B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class SalidaAutobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busUno = sc.nextInt();
        int busDos = sc.nextInt();
        int capacidad = sc.nextInt();
        int capacidadTotal = (busUno + busDos) * capacidad;
        System.out.println(capacidadTotal);
    }
}
