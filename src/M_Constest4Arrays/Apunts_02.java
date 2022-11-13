package M_Constest4Arrays;

import java.util.Scanner;

public class Apunts_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] numero = new int[n];
        String[] paginas = new String[n];
        for (int i = 0; i < n; i++) {
            numero[i] = sc.nextInt();
            paginas[i] = sc.nextLine();
        }
        int valorTemporal = 0;
        for (int i = 0; i < numero.length; i++) {
            for (int j = i + 1; j < numero.length; j++) {
                if (numero[i] > numero[j]) {
                    valorTemporal = numero[i];
                    numero[i] = numero[j];
                    numero[j] = valorTemporal;
                    String valorTemporalPagina = paginas[i];
                    paginas[i] = paginas[j];
                    paginas[j] = valorTemporalPagina;
                }
            }
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " " + paginas[i]);
            System.out.println();
        }
    }
}
