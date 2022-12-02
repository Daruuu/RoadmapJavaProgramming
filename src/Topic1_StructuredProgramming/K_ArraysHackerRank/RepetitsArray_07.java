package Topic1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class RepetitsArray_07 {
    int numPartits = 21;

    public int partitMesVotat(int[] p, int n) {
        int[] times = new int[numPartits];
        for (int i = 0; i < n; i++) {
            ++times[p[i]];
        }
        int maxim = times[1];
        int numMaxRepetido = 1;
        for (int j = 2; j < times.length; j++) {
            if (times[j] > maxim) {
                maxim = times[j];
                numMaxRepetido = j;
            }
        }
        return numMaxRepetido;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVotantes = sc.nextInt();
        int[] partidos = new int[numVotantes];
        for (int i = 0; i < partidos.length; i++) {
            partidos[i] = sc.nextInt();
        }
        int maxim = Integer.MIN_VALUE;
        int numMasRepetido = 0;
        for (int i = 0; i < partidos.length; i++) {
            int contador = 0;
            for (int j = i + 1; j < partidos.length; j++) {
                if (partidos[i] == partidos[j]) {
                    contador++;
                }
            }
            if (contador > maxim) {
                numMasRepetido = partidos[i];
                maxim = contador;
            }
        }
        System.out.println(numMasRepetido);
        /*
        RepetitsArray_07 repetitsArray_7 = new RepetitsArray_07();
        System.out.println(repetitsArray_7.partitMesVotat(partidos, partidos.length));
         */
    }

}
