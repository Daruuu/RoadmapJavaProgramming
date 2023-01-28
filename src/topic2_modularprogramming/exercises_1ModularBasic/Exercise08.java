package topic2_modularprogramming.exercises_1ModularBasic;

/*
8. (primersArray) Fer una funció que rebi un vector i retorni un altre vector amb tots els elements del vector original que siguin primers.
 */
public class Exercise08 {
    public static void main(String[] args) {
        int[] array = new int[]{11, 3, 55, 64, 7, 90, 34, 27, 64, 47};
        numeroPrimosArray(array);
    }

    public static void numeroPrimosArray(int[] array) {
//        int contador = 0;
        int j = 0;
        int[] arrNumerosPrimos = new int[8];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
//                contador++;
                arrNumerosPrimos[j] = array[i];
                j++;
            }
        }

        for (int a: arrNumerosPrimos) {
            System.out.println(a);
        }
    }

}
