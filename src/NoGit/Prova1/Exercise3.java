package NoGit.Prova1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int cistella1Punts = 0;
        int cistella2Punts = 0;
        int cistella3Punts = 0;
        int i = 1;
        int nCopia = numero;
        while (numero != -1) {

            if (numero % 10 ==1) {
                cistella1Punts++;
            } else if (numero % 2 == 0) {
                cistella2Punts++;
            } else if (numero % 3 == 0) {
                cistella3Punts++;
            }
            numero = sc.nextInt();
        }
        System.out.println("cistella d'1 punt -> " + cistella1Punts);
        System.out.println("cistella d'2 punt -> " + cistella2Punts);
        System.out.println("cistella d'3 punt -> " + cistella3Punts);

    }
}
