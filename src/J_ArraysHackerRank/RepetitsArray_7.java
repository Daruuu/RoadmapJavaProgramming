package J_ArraysHackerRank;

import java.util.Scanner;

public class RepetitsArray_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVotantes = sc.nextInt();
        int[] partidos = new int[numVotantes];
        for (int i = 0; i < partidos.length; i++) {
            partidos[i] = sc.nextInt();
        }
        int maxim = 0;
        int contador = 0;
        for (int i = 0; i < partidos.length; i++) {
            for (int j = 0; j < partidos.length; j++) {
                if (partidos[i] == partidos[j]) {
                    contador++;
                }
            }
            if (contador > maxim){
                maxim = contador;
            }
        }
        System.out.println(maxim);

    }
}
