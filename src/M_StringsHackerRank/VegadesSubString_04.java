package M_StringsHackerRank;

import java.util.Scanner;

public class VegadesSubString_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String subcadena = sc.next();
        sc.close();
        str = str.toLowerCase();
        int contador = 0;
        int palabraBusqueda = str.indexOf(subcadena, 0);
        while (palabraBusqueda >= 0) {
            contador++;
            palabraBusqueda = str.indexOf(subcadena,palabraBusqueda + subcadena.length());
        }
        System.out.println(contador);
    }
}
