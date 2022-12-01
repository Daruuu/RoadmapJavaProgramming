package S1_StructuredProgramming.F_StructureSelectionHackerRank;

import java.util.Scanner;

public class calculNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = sc.nextFloat();
        if (nota < 5)
            System.out.println("INSUFICIENT");
        else if (nota < 6)
            System.out.println("SUFICIENT");
        else if(nota < 7)
            System.out.println("BE");
        else if(nota < 8.5)
            System.out.println("NOTABLE");
        else if(nota < 10)
            System.out.println("EXCEL.LENT");
        else if(nota == 10)
            System.out.println("MATRICULA");
    }
}
