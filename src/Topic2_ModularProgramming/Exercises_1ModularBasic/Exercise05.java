package Topic2_ModularProgramming.Exercises_1ModularBasic;

import java.util.Arrays;

/*
5. (ordena) Fer una funció que donats tres nombres ens els ordeni de manera creixent.
 */
public class Exercise05 {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 54;
        int n3 = 11;
        ordenarNumeros(n1, n2, n3);
    }

    public static void ordenarNumeros(int num1, int num2, int num3) {
        int[] array = new int[3];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;
        Arrays.sort(array);
        for (int arr : array) {
            System.out.println(arr);
        }

    }
}
