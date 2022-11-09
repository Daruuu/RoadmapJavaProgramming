package J_ArraysHackerRank;

import java.util.Scanner;

public class SeleccionatsProgramame_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //tamano de alumnos y notas
        String[] nombres = new String[n];
        float[] notas = new float[n];

        for (int i = 0; i < n; i++) {
            nombres[i] = sc.next();
            notas[i] = sc.nextFloat();
        }
        double mediaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            mediaNotas += notas[i];
        }
        mediaNotas /= notas.length;
        mediaNotas = Math.round(mediaNotas * 100.0)/100.0;
//        System.out.println(mediaNotas);
        for (int i = 0; i < n; i++) {
            if (notas[i] >= mediaNotas) {
                System.out.println(nombres[i]);
            }
        }
    }
}
