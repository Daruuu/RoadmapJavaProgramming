package J_ArraysHackerRank;

import java.util.Scanner;

public class DistanciasMatriz_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ciudad1 = sc.nextLine();
        String ciudad2 = sc.next();
        int[][] taulaDistancias = {
                {0, 100, 156, 98, 296, 409},
                {100, 0, 256, 198, 396, 509},
                {156, 256, 0, 91, 140, 319},
                {98, 198, 91, 0, 231, 311},
                {296, 396, 140, 231, 0, 181},
                {409, 509, 319, 311, 181, 0 }
        };
        int fila = 0, columna = 0;

        switch (ciudad1) {
            case "Barcelona":
                fila = 0;
                break;
            case "Girona":
                fila = 1;
                break;
            case "Lleida":
                fila = 2;
                break;
            case "Tarragona":
                fila = 3;
                break;
            case "Saragossa":
                fila = 4;
                break;
            case "Terol":
                fila = 5;
                break;
        }

        switch (ciudad2) {
            case "Barcelona":
                columna = 0;
                break;
            case "Girona":
                columna = 1;
                break;
            case "Lleida":
                columna= 2;
                break;
            case "Tarragona":
                columna = 3;
                break;
            case "Saragossa":
                columna = 4;
                break;
            case "Terol":
                columna = 5;
                break;
        }
        System.out.println(taulaDistancias[fila][columna]);
        /*
        String [] cuidades = {"Barcelona", "Girona", "Lleida", "Tarragona","Saragossa", "Terol"};

        for (int i = 0; i < cuidades.length; i++) {
            if (ciudad1.equals("Barcelona")){

            }
        }
         */
    }
}
