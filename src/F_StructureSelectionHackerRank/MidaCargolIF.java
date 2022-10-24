package F_StructureSelectionHackerRank;

import java.util.Scanner;

public class MidaCargolIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cargol = sc.nextInt();
        if (cargol >= 1 && cargol < 3) {
            System.out.println("petit");
        } else if (cargol >= 3 && cargol < 5) {
            System.out.println("mitja");
        } else if (cargol >= 5 && cargol < 8) {
            System.out.println("gran");
        } else if (cargol >= 8 && cargol <= 10) {
            System.out.println("molt gran");
        } else {
            System.out.println("mida incorrecta\n");
        }
    }
}
