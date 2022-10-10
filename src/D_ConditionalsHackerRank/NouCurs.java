package D_ConditionalsHackerRank;

import java.util.Scanner;

public class NouCurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //alumnes
        int p = sc.nextInt();   //plantas
        int a = sc.nextInt();   //aulas
        int m = sc.nextInt();   //matriculats

        if (n <= 0 || p <= 0 || a <= 0 || m <= 0) {
            System.out.println("Error dades introduides no valides");
        } else if (n == 20) {
            System.out.println("A l\'institut hi caben tots els alumnes, encara n\'hi caben " + n);
        } else if (n >= 21) {
            //System.out.println("Calen" +  + " places per tots els alumnes que s\'han matriculat");
        }
    }
}
