package topic1_StructuredProgramming.F_StructureSelectionHackerRank;

import java.util.Scanner;

public class CuatroEstacionsIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        if ((mes == 12 && dia >= 21) || mes == 1 || mes == 2 || (mes == 3 && dia < 21)) {
            System.out.println("Hivern\nEstiu");
        } else if ((mes == 3 && dia >= 21) || mes == 4 || mes == 5 || (mes == 6 && dia < 21)) {
            System.out.println("Primavera\nTardor");
        } else if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia < 23)) {
            System.out.println("Estiu\nHivern");
        } else if ((mes == 9 && dia >= 23) || mes == 10 || mes == 11 || (mes == 12)) {
            System.out.println("Tardor\nPrimavera");
        }
    }
}
