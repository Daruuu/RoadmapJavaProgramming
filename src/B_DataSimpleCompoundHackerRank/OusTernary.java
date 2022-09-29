package B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class OusTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input:    numero total de huevos
        // cantidad de hueveras que se necesita
        // cantidad huevos que hacen falta para llenar la ultima huevera
        int cantidadOus = sc.nextInt();
        int ouera = 24;
        int cantidadOueras = cantidadOus / ouera;

        if(cantidadOus == 0){
            System.out.println("0 " + "0");
        }

        if (cantidadOus % ouera != 0) {
            cantidadOueras += 1;
            System.out.println(cantidadOueras + "cantidadoueras");
            int residuo = cantidadOus % ouera;
            int espaciosHueveras = ouera - residuo;
            System.out.println("espacioHuevera" + espaciosHueveras);
            System.out.println(cantidadOueras + " " + espaciosHueveras);
        }

    }
}
