package B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class ProvaMecanografica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        precision: mide en %
        numCaracters % numErrores
        velocitat: palabras por minuto
        1 palabra: 5 caracters
         */
        float numeroCaracters = sc.nextFloat();
        float numeroErrores = sc.nextFloat();
        float tiempoSegundos = sc.nextFloat();

        float paraula = 5;
        float precision = ((numeroCaracters - numeroErrores) / numeroCaracters) * 100;
        float palabrasTotales = numeroCaracters / paraula;    //palabras escritas
        float palabrasPorSegundo = palabrasTotales /tiempoSegundos;   //pps
        float ppm = palabrasPorSegundo * 60;

        System.out.println((int)precision);
        System.out.println((int)ppm);
    }
}
