package D_ConditionalsHackerRank;

import java.util.Scanner;

public class MajorEdat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        int anyNaixament = sc.nextInt();
        int edadPersona = 2022 - anyNaixament;
        String resultado = (edadPersona > 17) ? (nombre + " te " + edadPersona + " anys i es major d'edat.") : (nombre + " te " + edadPersona + " anys i es menor d'edat.");
        System.out.println(resultado);
    }
}
