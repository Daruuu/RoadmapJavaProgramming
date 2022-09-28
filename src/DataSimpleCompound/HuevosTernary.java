package DataSimpleCompound;

import java.util.Scanner;

public class HuevosTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input:    numero total de huevos
        // cantidad de hueveras que se necesita
        // cantidad huevos que hacen falta para llenar la ultima huevera
        int cantidadHuevos = sc.nextInt();
        int huevera = 24;
        int cantidadHueveras = cantidadHuevos / huevera;
        if (cantidadHuevos % huevera != 0) {
            cantidadHueveras += 1;
            int residuo = cantidadHuevos % huevera;
            int espaciosHueveras = huevera - residuo;
            System.out.println(cantidadHueveras + " " + espaciosHueveras);
        }else {
            System.out.println();
        }
    }
}
