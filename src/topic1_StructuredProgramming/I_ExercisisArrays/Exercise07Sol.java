package topic1_StructuredProgramming.I_ExercisisArrays;

import java.util.Scanner;

public class Exercise07Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int long1 = 5, long2 = 7;
        int array1[] = new int[long1];
        int array2[] = new int[long2];
        int fusion[] = new int[long1 + long2];

        //Pedimos datos
        System.out.println("Introduce " + long1 + " números enteros ordenados para el primer vector");
        for (int i = 0; i < long1; i++) {
            System.out.print("#" + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
        System.out.println("\nIntroduce " + long2 + " números enteros ordenados para el segundo vector");
        for (int i = 0; i < long2; i++) {
            System.out.print("#" + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }
        sc.close();

        //Fusionamos vectores

        /*Estos indices son para los arrays 1 y 2.
         *Incrementaremos uno u otro según el elemento que escojamos para
         *rellenar ordenadamente el array "fusion"
         */
        int i = 0, j = 0;

        for (int c = 0; c < fusion.length; c++) {
            if (i == array1.length)//Si array1 se ha terminado, directamente cogemos elemento de array2
            {
                fusion[c] = array2[j];
                j++;
            } else if (j == array2.length)//Si array2 se ha terminado, directamente cogemos elemento de array1
            {
                fusion[c] = array1[i];
                i++;
            } else//Ni array1 ni array2 se han termiando, entonces comparo y busco el elemento menor
            {
                if (array1[i] <= array2[j]) {
                    fusion[c] = array1[i];
                    i++;
                } else {
                    fusion[c] = array2[j];
                    j++;
                }
            }
        }

        System.out.println("\nVectores fusionados. Estos son los elementos ordenados:");
        for (int c = 0; c < fusion.length; c++) System.out.println("#" + (c + 1) + ": " + fusion[c]);

    }
}
