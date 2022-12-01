package S1_StructuredProgramming.I_ExercisisArrays;

//2. Genera 10 nombres positius aleatoris i guarda'ls a un array. Després busca el màxim i el mínim dels valors continguts dins aquest Array.
public class Exercise02 {
    public static void main(String[] args) {
        int maxValor = Integer.MIN_VALUE;
        int minValor = Integer.MAX_VALUE;
        int[] array = {1, 14, 54, 77, 45, 75, 8, 9, 3, 10};
        for (int i = 0; i < array.length; i++) {
            if (maxValor < array[i])
                maxValor = array[i];
            if (minValor > array[i])
                minValor = array[i];
        }
        System.out.println("maximo:" + maxValor + " min:" + minValor);
    }
}
