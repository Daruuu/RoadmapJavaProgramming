package F_StructureSelectionHackerRank;

import java.util.Scanner;

public class CalculadoraConMenuIfSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int op = sc.nextInt();
        System.out.println("MENU:\n 1.-SUMAR \n 2.-RESTAR\n 3.-MULTIPLICAR\n 4.- DIVIDIR\n Esculli una opcio:");

        if (op == 1)
            System.out.println(n1 + n2);
        if (op == 2)
            System.out.println(n1 - n2);
        if (op == 3)
            System.out.println(n1 * n2);
        if (op == 4)
            System.out.println(n1 / n2);

    }
}
