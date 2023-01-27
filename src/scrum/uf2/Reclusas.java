package scrum.uf2;

import java.util.Scanner;

public class Reclusas {
    public static final String tipoGradoCondena = "3";
    public static String[][] nuevasReclusas;
    public static String[][] fichasTecnicasReclusas = {
            {"0001", "Juana Nascimento", "29", "20", "11", "3", ""},
            {"0002", "Giovana Libert", "42", "10", "5", "1", ""},
            {"0003", "Maria Lisa", "33", "8", "5", "3", ""},
            {"0004", "Marta Eulalia", "39", "4", "2", "2", ""},
            {"0005", "Carmen ", "65", "5", "1", "2", ""},
            {"0006", "Ana Beltran", "32", "10", "7", "3", ""},
            {"0007", "Andrew Gil", "40", "10", "10", "2", ""},
            {"0008", "Camila Jimenez", "37", "20", "17", "2", ""},
            {"0009", "Andrea Linares", "42", "5", "9", "3", ""},
            {"0010", "Laura Ochoa", "25", "15", "7", "3", ""},
    };

    public static void mostrarFichaTecnica() {
        System.out.println("id, nombre, edad, sentencia, condena restante, tipo grado, salida patio");
        for (String[] filas : fichasTecnicasReclusas) {
            for (String colum : filas) {
                System.out.print(colum + " ");
            }
            System.out.println();
        }
    }

    public static void establecerEstadoSalidaPatioReclusas() {
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][5].equals(tipoGradoCondena) && Integer.parseInt(fichasTecnicasReclusas[i][4]) < 9) {
                fichasTecnicasReclusas[i][6] = "1";
            } else {
                fichasTecnicasReclusas[i][6] = "0";
            }
        }
    }

    public static void mostrarReclusasPatioDisponible() {
        System.out.println("\033[34mRECLUSAS DE TERCER GRADO QUE PUEDEN SALIR AL PATIO:\033[0m");
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][6].equals("1")) {
                System.out.println(fichasTecnicasReclusas[i][0] + " " + fichasTecnicasReclusas[i][1]);
            }
        }
    }

    public static void mostrarReclusasPatioProhibido() {
        System.out.println("\033[31mRECLUSAS DE TERCER GRADO QUE NO PUEDEN SALIR AL PATIO:\033[0m");
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][6].equals("0")) {
                System.out.println(fichasTecnicasReclusas[i][0] + " " + fichasTecnicasReclusas[i][1]);
            }
        }
    }

    public static void agregarReclusas(int numero) {
        Scanner sc = new Scanner(System.in);

        //{"0001", "Juana Nascimento", "29", "20", "11", "3", ""},
        System.out.println("id, nombre, edad, sentencia, condena restante, tipo grado, salida patio");
        String[][] nuevasReclusas = new String[numero][fichasTecnicasReclusas[0].length];

        System.out.println(nuevasReclusas.length);
        System.out.println(nuevasReclusas[0].length);
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < nuevasReclusas[i].length - 1; j++) {
                sc.next();
                System.out.print("Identificador de reclusa " + i + " " + j + " : ");
                nuevasReclusas[i][j] = sc.nextLine();

                System.out.print("Nombre de reclusa " + i + " " + j + " : ");
                nuevasReclusas[i][j] = sc.nextLine();

                System.out.print("Edad de reclusa " + i + " " + j + " : ");
                nuevasReclusas[i][j] = sc.nextLine();

                System.out.print("Sentencia de reclusa " + i + " " + j + " : ");
                nuevasReclusas[i][j] = sc.nextLine();

                System.out.print("Condena restante de reclusa " + i + " " + j + " : ");
                nuevasReclusas[i][j] = sc.nextLine();

                System.out.print("Tipo grado de reclusa " + i + " " + j + " : ");
                nuevasReclusas[i][j] = sc.nextLine();
            }
        }
/*        for (int i = 0; i < nuevasReclusas.length; i++) {
            for (int j = 1; j < nuevasReclusas[i].length - 2; j++) {
                System.out.print("Nombre: ");
                nuevasReclusas[i][j] = sc.next();
                System.out.print("Dni: ");
                nuevasReclusas[i][j] = sc.next();
                System.out.print("Edad: ");
                nuevasReclusas[i][j] = sc.next();
                System.out.print("Sentencia: ");
                nuevasReclusas[i][j] = sc.next();
                System.out.print("Condena restante: ");
                nuevasReclusas[i][j] = sc.next();
                System.out.print("Tipo grado: ");
                nuevasReclusas[i][j] = sc.next();
            }
        }*/
    }

    public static void mostrarNuevasReclusas() {
        for (String[] filas : nuevasReclusas) {
            for (String colum : filas) {
                System.out.print(colum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce numero de reclusas nuevas: ");
        int n = sc.nextInt();
        agregarReclusas(n);
        mostrarNuevasReclusas();
    }
}