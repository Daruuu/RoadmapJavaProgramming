package J_ArraysHackerRank;

import java.util.Scanner;

public class DistanciasMatriz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ciudad1 = sc.nextLine();
        String ciudad2 = sc.next();
        String[][] taulaDistancias = {
                {"", "Barcelona", "Girona", "Lleida", "Tarragona", "Saragossa", "Terol"},
                {"Barcelona", "", "100", "156", "98", "296", "409"},
                {"Girona", "", "", "256", "198", "396", "509"},
                {"Lleida", "", "", "", "91", "140","319"},
                {"Tarragona", "", "", "", "", "231", "311"},
                {"Saragossa", "", "", "", "", "", "181"},
                {"Terol", "", "", "", "", "", ""}
        };
    }
}
