package Topic1_StructuredProgramming.I_ExercisisArrays;

import java.util.Arrays;

//7. Escriu un programa anomenat Fusio que, donats dos vectors de nombres enters ordenats, en crei un de nou amb el contingut dels dos originals també ordenat.
// Defineix la longitud dels dos vectors originals amb dos constants definides a l'inici del codi, de manera que canviant només els valors de les constants el programa ha de seguir funcionant bé.
public class Exercise07 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 6};
        int[] array2 = {5, 6, 12, 22, 9};
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] sumaArrays = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                sumaArrays[k] = array1[i];
                i++;
            } else if (array2[j] < array1[i]) {
                sumaArrays[k] = array2[j];
                j++;
            } else {
                sumaArrays[k] = array1[i];
                k++;
                sumaArrays[k] = array2[j];
                i++;
                j++;
            }
            k++;
        }

        if (i == array1.length) {
            while (j < array2.length) {
                sumaArrays[k] = array2[j];
                j++;
                k++;
            }
        } else {
            while (i < array1.length) {
                sumaArrays[k] = array1[i];
                i++;
                ++k;
            }
        }
        for (int array : sumaArrays) {
            System.out.print(array + " ");
        }
    }
}
