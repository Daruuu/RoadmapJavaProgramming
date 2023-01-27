package scrum.uf2Final;

import java.util.Scanner;

public class Reclusas {
    public static final String TIPO_GRADO_CONDENA = "3";
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
            {"0011", "Juan Peres", "22", "6", "3", "2", ""},
            {"0012", "Pedro Linares", "20", "11", "5", "4", ""},
            {"0013", "Carla Sespedes", "35", "10", "8", "4", ""},
            {"0014", "Karol Escovar", "60", "19", "10", "3", ""},
            {"0015", "Daru Garviria", "25", "14", "9", "3", ""},
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
            if (fichasTecnicasReclusas[i][5].equals(TIPO_GRADO_CONDENA) && Integer.parseInt(fichasTecnicasReclusas[i][4]) < 9) {
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

    public static void agregarReclusasNuevas(int numero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id, nombre, edad, sentencia, condena restante, tipo grado");
        nuevasReclusas = new String[numero][fichasTecnicasReclusas[0].length];
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < nuevasReclusas[0].length; j++) {
                if (j == 0) {
                    System.out.print("Identificador de reclusa " + i + " : ");
                    String id = sc.nextLine();
                    while (!(id.length() == 4)) {
                        System.err.println("El id ha de tener 4 digitos por ejemplo 0001");
                        System.out.print("Identificador de reclusa " + i + " : ");
                        System.out.print("\nIntroduce de nuevo: ");
                        id = sc.nextLine();
                    }
                    nuevasReclusas[i][j] = id;
                } else if (j == 1) {
                    System.out.print("Nombre de reclusa " + i + " : ");
                    String nombre = sc.nextLine();
                    while (!nombre.matches("[a-zA-Z]+")) {
                        System.err.println("Introduce solo letras");
                        System.out.print("Nombre de reclusa " + i + " : ");
                        System.out.print("\nIntroduce de nuevo: ");
                        nombre = sc.nextLine();
                    }
                    nuevasReclusas[i][j] = nombre;
                } else if (j == 2) {
                    System.out.print("Edad de reclusa " + i + " : ");
                    String edad = sc.nextLine();
                    while (!edad.matches("[0-9]+")) {
                        System.err.println("Introduce un rango correcto de edad");
                        System.out.print("Edad de reclusa " + i + " : ");
                        System.out.print("\nIntroduce de nuevo: ");
                        edad = sc.nextLine();
                    }
                    nuevasReclusas[i][j] = edad;
                } else if (j == 3) {
                    System.out.print("Sentencia de reclusa " + i + " : ");
                    String sentencia = sc.nextLine();
                    while (!sentencia.matches("[0-9]+")) {
                        System.err.println("Introduce un rango correcto");
                        System.out.print("Sentencia de reclusa " + i + " : ");
                        System.out.print("\nIntroduce de nuevo: ");
                        sentencia = sc.nextLine();
                    }
                    nuevasReclusas[i][j] = sentencia;
                } else if (j == 4) {
                    System.out.print("Condena restante de reclusa " + i + " : ");
                    String condenaRestante = sc.nextLine();
                    while (!condenaRestante.matches("[0-9]+")) {
                        System.err.println("Introduce un rango correcto");
                        System.out.print("Sentencia restante de reclusa " + i + " : ");
                        System.out.print("\nIntroduce de nuevo: ");
                        condenaRestante = sc.nextLine();
                    }
                    nuevasReclusas[i][j] = condenaRestante;
                } else if (j == 5) {
                    System.out.print("Nivel grado de reclusa " + i + " : ");
                    String grado = sc.nextLine();
                    while (!grado.matches("[0-4]")) {
                        System.err.println("Introduce un rango correcto");
                        System.out.print("Nivel grado de reclusa " + i + " : ");
                        System.out.print("\nIntroduce de nuevo: ");
                        grado = sc.nextLine();
                    }
                    nuevasReclusas[i][j] = grado;
                }
            }
            WadRas.linea();
        }
    }

    public static void listarReclusasNuevas() {
        System.out.println("Nuevas Reclusas:");
        for (int i = 0; i < nuevasReclusas.length; i++) {
            System.out.println("RECLUSA NUMERO " + i);
            for (int j = 0; j < nuevasReclusas[i].length; j++) {
                System.out.print(nuevasReclusas[i][j] + " ");
            }
            System.out.println();
        }
    }
}