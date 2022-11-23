package SCRUM;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class WadRas {
    public static void main(String[] args) {
/*
        // MENU PROGRAMA
        Scanner sc = new Scanner(System.in);
        boolean sortir = false;
        int opcio = 0; //opcions

        System.out.println("1. FITXES PRESES");
        System.out.println("2. PRESES 3R GRAU -9 ANYS");
        System.out.println("3. TEMPS ENTRADA I SORTIDA PRESES PUNT 2");
        System.out.println("4. SORTIR");

        while (!sortir) {
            System.out.println("SELECCIONA UNA OPCIÓ");
            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    System.out.println("HAS SEL·LECCIONAT L'OPCIÓ 1");
                    break;
                case 2:
                    System.out.println("HAS SEL·LECCIONAT L'OPCIÓ 2");
                    break;
                case 3:
                    System.out.println("HAS SEL·LECCIONAT L'OPCIÓ 3");
                    break;
                case 4:
                    sortir = true;
                    break;
                default:
                    System.out.println("HAS DE SEL·LECCIONAR UNA DE LES 4 OPCIONS");
            }
        }
 */

        //FICHA TECNICA PRESAS

        //                            nombre,             edad, sentencia, condena restante, tipo grado
        /*
        String[] fichaTecnicaPresa1 = {"Juana Nascimento", "29", "20", "11", "2"};
        String[] fichaTecnicaPresa2 = {"Giovana Libert", "42", "10", "5", "1"};
        String[] fichaTecnicaPresa3 = {"Maria Lisa", "33", "14", "5", "3"};
        String[] fichaTecnicaPresa4 = {"Marta", "39", "4", "7", "2"};
         */


        //filas = 4
        //columnas = 5
        String[][] fichasTecnicas = {
                {"Juana Nascimento", "29", "20", "11", "2"},
                {"Giovana Libert", "42", "10", "5", "1"},
                {"Maria Lisa", "33", "14", "6", "3"},
                {"Marta", "39", "4", "7", "3"}
        };
        boolean encontrado = false;
        String grado = "3";
        for (int i = 0; i < fichasTecnicas.length && !encontrado; i++) {
            for (int j = 0; j < fichasTecnicas[i].length && !encontrado; j++) {
                if (fichasTecnicas[i][j].equals(grado)){
                    System.out.println(fichasTecnicas[i][j]);
                    encontrado = true;

                }
            }
        }

        System.out.println("************");
        for (String[] filas : fichasTecnicas) {
            for (String columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }


        // GRADOS DE CADA PRESA
        //presas que tienen 3er GRADO y que tienen menos de 9 ANYOS de prision o no
        /*
        String grade = "3";
        boolean found = false;
        for (int i = 0; i < fichaTecnicaPresa1.length && !found; i++) {
            if (grade.equals(fichaTecnicaPresa1[i])) {
                found = true;
                System.out.println("tipo de grado: " + fichaTecnicaPresa1[i]);
            }
        }
         */


        /*
        ArrayList<String> infoPresaName = new ArrayList<>();

        infoPresaName.add("Juana Nascimento");
        infoPresaName.add("Giovana Libert");
        infoPresaName.add("Maria Lisa");


        ArrayList<Integer> infoPresaAge = new ArrayList<>();

        infoPresaAge.add(29);
        infoPresaAge.add(42);
        infoPresaAge.add(33);

        ArrayList<Integer> infoPresaSentence = new ArrayList<>();

        infoPresaSentence.add(20);
        infoPresaSentence.add(10);
        infoPresaSentence.add(18);


        ArrayList<Integer> infoPresaCondenaRestante = new ArrayList<>();

        infoPresaCondenaRestante.add(15);
        infoPresaCondenaRestante.add(5);
        infoPresaCondenaRestante.add(4);
        ArrayList<Integer> infoPresaGrade = new ArrayList<>();

        infoPresaGrade.add(2);
        infoPresaGrade.add(1);
        infoPresaGrade.add(3);
         */

    }
}
