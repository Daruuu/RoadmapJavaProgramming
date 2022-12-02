package SCRUM;

import java.util.Scanner;

public class WadRas {
    public static void main(String[] args) {
        // MENU PROGRAMA
        Scanner sc = new Scanner(System.in);
        boolean sortir = false;

        System.out.println("Escull una opcio:\n1.FITXES PRESES\n2.PRESES de 3R GRAU QUE PODEN SORTIR\n3.TEMPS ENTRADA I SORTIDA PRESES\n4.SORTIR");

        while (!sortir) {
            System.out.print("SELECCIONA UNA OPCIÓ: ");
            int opcio = sc.nextInt();
            //identificador, nombre, edad, sentencia, condena restante, tipo grado
            //filas = 4 columnas = 5
            String[][] fichasTecnicas = {
                    {"0001", "Juana Nascimento", "29", "20", "11", "3"},
                    {"0002", "Giovana Libert", "42", "10", "5", "1"},
                    {"0003", "Maria Lisa", "33", "8", "5", "3"},
                    {"0004", "Marta Eulalia", "39", "4", "2", "2"},
                    {"0005", "Carmen ", "65", "5", "1", "3"}
            };

            switch (opcio) {
                case 1:
                    System.out.println("HAS SEL·LECCIONAT L'OPCIÓ 1\n--------------------------------");
                    for (String[] filas : fichasTecnicas) {
                        for (String columnas : filas) {
                            System.out.print(columnas + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("HAS SEL·LECCIONAT L'OPCIÓ 2\n-------------------------------\nPresas con tipo grado 3 que pueden salir:");
                    String grado = "3";

//        sc.close();
                    for (int i = 0; i < fichasTecnicas.length; i++) {
                        boolean encontrado = false;
                        boolean salir = false;
                        for (int j = 0; j < fichasTecnicas[i].length && !encontrado && !salir; j++) {
                            if (fichasTecnicas[i][5].equals(grado) && Integer.parseInt(fichasTecnicas[i][4]) < 9) {
                                System.out.println(fichasTecnicas[i][0] + " " + fichasTecnicas[i][1] + " ");
                                salir = true;
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("HAS SEL·LECCIONAT L'OPCIÓ 3\n");
                    String[][] control = {
                            {"Presa 1", "23890755X", "900", "1900", "1200"},
                            {"Presa 2", "54229087S", "900", "1300", "1500"},
                            {"Presa 3", "54229789D", "900", "1200", "1000"},
                            {"Presa 4", "54229789D", "900", "1200", "1600"}
                    };
                    System.out.println("-------------------------------\nControl de entrada y salida:");
                    for (int i = 0; i < control.length; i++) {
                        boolean entradaMenorSalida = false;
                        for (int j = 0; j < control[i].length && !entradaMenorSalida; j++) {
                            if (Integer.parseInt(control[i][3]) <= Integer.parseInt(control[i][4])) {
                                System.out.println(control[i][0] + " con DNI " + control[i][1]);
                                entradaMenorSalida = true;
                                break;
                            }
                        }
                    }
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    System.out.println("FIN PROGRAMA");
                    sortir = true;
                    break;
                default:
                    System.out.println("HAS DE SEL·LECCIONAR UNA DE LES 4 OPCIONS");
            }
        }
    }
}
