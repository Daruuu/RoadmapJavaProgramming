package H_IterativeHackerRank;

import java.util.Scanner;

public class GraficCoronavirus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contadorMG = 0;
        int contadorGR = 0;
        int contadorNO = 0;
        int contadorLL = 0;
        int contadorML = 0;

        while (n != -1){

            if (n >= 200){
                contadorMG++;
            } else if (n >= 150 && n <= 190) {
                contadorGR++;
            } else if (n >= 100 && n <= 149) {
                contadorNO++;
            } else if (n >=50 && n <= 99) {
                contadorLL++;
            }else if (n < 50){
                contadorML++;
            }
            n = sc.nextInt();
        }
        System.out.print("MG: ");
        for (int i = 0; i < contadorMG; i++) {
            System.out.print("#");
        }
        System.out.print("\nGR: ");
        for (int i = 0; i < contadorGR; i++) {
            System.out.print("#");
        }
        System.out.print("\nNO: ");
        for (int i = 0; i < contadorNO; i++) {
            System.out.print("#");
        }
        System.out.print("\nLL: ");
        for (int i = 0; i < contadorLL; i++) {
            System.out.print("#");
        }
        System.out.print("\nML: ");
        for (int i = 0; i < contadorML; i++) {
            System.out.print("#");
        }
    }
}
