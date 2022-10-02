package StructureSelectionHackerRank;

import java.util.Scanner;

public class PreuFerrocarril {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distanciaViaje = sc.nextFloat();
        int cantidadDias = sc.nextInt();

        float distanciaKm= 1000 * 80;   //800km
        System.out.println(distanciaKm);
        float precioKm = (float) 0.35;  //0.35 euros

        float kmPrecioTotal = distanciaViaje * precioKm;

        if (cantidadDias < 7 && distanciaViaje < distanciaKm)
            System.out.println(kmPrecioTotal);
        else
            System.out.println(kmPrecioTotal % 30);

    }
}
