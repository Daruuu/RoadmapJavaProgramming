package Topic2_ModularProgramming.Exercises_1ModularBasic;

/*
9. (maximMatriu) Fer una funció que retorni el valor màxim d'una matriu.
 */
public class Exercise09 {
    public static void main(String[] args) {
        int[][] array2D = {
                {2, 5, 1, 7},
                {4, 9, 14, 17},
                {90, 54, 353, 101}
        };
        maximoMatriz(array2D);
    }

    public static void maximoMatriz(int[][] matriz) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxValue)
                    maxValue = matriz[i][j];
            }
        }
        System.out.println(maxValue);
    }
}
