package topic1_structuredprogramming.N_Constest4Arrays;

import java.util.Scanner;

public class PosicionLetraEnTexto_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char letra = sc.next().charAt(0);
        boolean encontrado = false;
        int i = 0;
        while (i < str.length() && !encontrado) {
            if (letra == str.charAt(i)) {
                encontrado = true;
                break;
            }
            i++;
        }
        if (encontrado) {
            System.out.println(i);
        } else {
            System.out.println(-1);
        }
    }
}
