package L_StringsHackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class VegadesSubString_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String subcadena = sc.next();
        sc.close();
        str = str.toLowerCase();
        int contador = 0;
        int indiceStr = str.indexOf(subcadena, 0);
        while (indiceStr >= 0) {
            contador++;
            indiceStr = str.indexOf(subcadena,indiceStr + subcadena.length());
        }
        System.out.println(contador);
    }
}
