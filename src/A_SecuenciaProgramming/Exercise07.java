package A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("radio: ");
        int radioCil = sc.nextInt();
        System.out.println("altura: ");
        int alturaCil = sc.nextInt();
        float volumenCil = (float) (Math.PI * radioCil * radioCil * alturaCil);
        float areaCil = (float) (2 * Math.PI * radioCil * alturaCil);
        System.out.println("volumen cilindro " + volumenCil + " area cilindro " + areaCil);
    }
}
