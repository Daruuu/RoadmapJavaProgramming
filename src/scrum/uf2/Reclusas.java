package scrum.uf2;

public class Reclusas {
    public static final String tipoGradoCondena = "3";
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
        System.out.println("id, nombre, dni, edad, sentencia, condena restante, tipo grado, salida patio");
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
        String[][] nuevasReclusas = new String[numero][5];
    }

}