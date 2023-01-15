package topic1_StructuredProgramming.B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class SobrenOus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input:número total de huevos
        // cantidad de hueveras que se necesita
        // cantidad huevos que hacen falta para llenar la ultima huevera
        int cantidadOus = sc.nextInt();
        int ouera = 24;
        int cantidadOueras = cantidadOus / ouera;
        int residuo;
        int cantidadOusQueFaltan;

        if (cantidadOus % ouera != 0) {
            cantidadOueras += 1;
            residuo = cantidadOus % ouera;
            cantidadOusQueFaltan = ouera - residuo;
        }else {
            cantidadOusQueFaltan = 0;
        }
        System.out.println(cantidadOueras + " " + cantidadOusQueFaltan);

    }

}
