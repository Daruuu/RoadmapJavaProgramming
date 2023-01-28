package topic1_structuredprogramming.H_IterativeHackerRank;

import java.util.Scanner;

public class DesnivelCiclista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturaActual = sc.nextInt();
        int alturaAnterior = alturaActual;
        int resultat = 0;
        while (alturaActual != -1) {
            if (alturaActual > alturaAnterior) {
                resultat = resultat + (alturaActual - alturaAnterior);
            }
            alturaAnterior = alturaActual;
            alturaActual = sc.nextInt();
        }
        if (resultat > 400)
            System.out.println("ETAPA MUNTANYA");
        else
            System.out.println("ETAPA PLANA");
    }
}
