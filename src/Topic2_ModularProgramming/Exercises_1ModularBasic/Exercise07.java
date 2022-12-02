package Topic2_ModularProgramming.Exercises_1ModularBasic;

/*
7. (parellsArray) Fer una funció que rebi un vector i retorni quants elements són parells.
 */
public class Exercise07 {
    public static void main(String[] args) {
        int[] array = {5, 23, 11, 6, 70, 2};
        paresArray(array);
    }

    public static void paresArray(int[] arr) {
        int contador = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                contador++;
                System.out.println(i);
            }
        }
        System.out.println("cantidad de numero pares " + contador);
    }
}
