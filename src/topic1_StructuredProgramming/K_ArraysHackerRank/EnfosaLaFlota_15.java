package topic1_StructuredProgramming.K_ArraysHackerRank;

import java.util.Scanner;

public class EnfosaLaFlota_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Character[][] tabla = new Character[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tabla[i][j] = sc.next().charAt(0);
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        //V = vaixells  A = aigua
        char agua = 'A';
        char vaixell = 'V';
        boolean aigua = false;
        while (x != -1 && y != -1) {
            if (tabla[x][y] == vaixell) {
                tabla[x][y] = agua;
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        boolean hundido = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tabla[i][j] == vaixell) {
                    hundido = true;
                    break;
                }
            }
        }
        String resultado = !hundido ? "GUANYA" : "NO GUANYA";
        System.out.println(resultado);
    }
}
