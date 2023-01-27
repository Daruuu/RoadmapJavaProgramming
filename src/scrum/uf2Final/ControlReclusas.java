package scrum.uf2Final;

import java.util.Scanner;

public class ControlReclusas {
    public static final String HORA_REGRESO_PATIO = "12:00";
    public static String[][] listaVisitasReclusas = {
            //id, nombre, dia semana  boolean visita? si : no
            {"0001", "Juana Nascimento", "3", "0"},
            {"0002", "Giovana Libert", "5", "0"},
            {"0003", "Maria Lisa", "4", "0"},
            {"0004", "Marta Eulalia", "2", "0"},
            {"0005", "Carmen", "1", "0"},
            {"0006", "Ana Beltran", "2", "0"},
            {"0007", "Andrew Gil", "3", "0"},
            {"0008", "Camila Jimenez", "4", "0"},
            {"0009", "Andrea Linares", "3", "0"},
            {"0010", "Laura Ochoa", "5", "0"},
            {"0011", "Ana Beltran", "2", "0"},
            {"0012", "Andrew Gil", "3", "0"},
            {"0013", "Camila Jimenez", "4", "0"},
            {"0014", "Andrea Linares", "3", "0"},
            {"0015", "Laura Ochoa", "5", "0"}
    };
    public static final String[][] matrizVisitasReclusas = {
            //id, nombre, dia semana  boolean visita? si : no
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""}
    };
    public static String[][] controlReclusas = {
            {"0001", "23890755X", "09:00", "12:15"},
            {"0002", "65229087S", "09:00", "13:00"},
            {"0003", "24234789D", "09:00", "13:20"},
            {"0004", "41229789A", "09:00", "12:00"},
            {"0005", "41516889F", "09:00", "14:40"},
            {"0006", "41516889A", "09:00", "13:18"},
            {"0007", "31726979G", "09:00", "12:00"},
            {"0008", "34031429B", "09:00", "12:00"},
            {"0009", "54436451A", "09:00", "12:00"},
            {"0010", "94136911E", "09:00", "16:05"},
    };

    public static void listarReclusasHorarioCorrecto() {
        for (int i = 0; i < controlReclusas.length; i++) {
            if (HORA_REGRESO_PATIO.equals(controlReclusas[i][3])) {
                System.out.println("RECLUSA CON ID: " + controlReclusas[i][0] + " Y DNI " + controlReclusas[i][1]);
                System.out.println("\033[34mREGRESO HORA CORRECTA\033[0m");
            }
        }
    }

    public static void listarReclusasHorarioIncorrecto() {
        for (int i = 0; i < controlReclusas.length; i++) {
            if (!HORA_REGRESO_PATIO.equals(controlReclusas[i][3])) {
                System.out.println("RECLUSA CON ID: " + controlReclusas[i][0] + " Y DNI " + controlReclusas[i][1]);
                System.out.println("\033[31mREGRESO FUERA DE HORARIO\033[0m");
            }
        }
    }

    public static int controlEntrada() {
        boolean entradaMenorSalida = false;
        for (int i = 0; i < controlReclusas.length; i++) {
            for (int j = 0; j < controlReclusas[i].length && !entradaMenorSalida; j++) {
                if (Integer.parseInt(controlReclusas[i][3]) <= Integer.parseInt(HORA_REGRESO_PATIO)) {
                    System.out.println(controlReclusas[i][0] + " con DNI " + controlReclusas[i][1]);
                    entradaMenorSalida = true;
                    break;
                }
            }
        }
        return 0;
    }

    public static void crearVisitasReclusas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Codigo de reclusa que quieras visitar?");
        listarReclusas();
        System.out.print("Elige una reclusa: ");
        int reclusaVisitada = sc.nextInt();
        int posicion = reclusaVisitada - 1;
        if (listaVisitasReclusas[posicion][3].equals("0")) {
            listaVisitasReclusas[posicion][3] = "1";
            System.out.println("puedes visitar a la reclusa");
            registroVisitasFamiliar(reclusaVisitada);
        } else if (listaVisitasReclusas[posicion][3].equals("1")) {
            System.out.println("La reclusa ya tiene visita");
        } else {
            System.out.println("Codigo reclusa no existe");
        }
    }

    public static void registroVisitasFamiliar(int numeroReclusaVisitada) {
        int numerodevisitas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar Nombre :");
        String nombreFamiliar = sc.nextLine();
        matrizVisitasReclusas[numerodevisitas][0] = nombreFamiliar;
        System.out.print("Introduce Dni: ");
        String dnivisita = sc.nextLine();
        matrizVisitasReclusas[numerodevisitas][1] = dnivisita;
        System.out.println("Ingresar Hora ");
        String horavisita = sc.nextLine();
        matrizVisitasReclusas[numerodevisitas][2] = horavisita;
        matrizVisitasReclusas[numerodevisitas][3] = String.valueOf(numeroReclusaVisitada);

        for (int i = 0; i < matrizVisitasReclusas.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizVisitasReclusas[i][j] + " ");
            }
            System.out.println();
        }
        crearVisitasReclusas();
    }

    public static void listarReclusas() {
        for (int i = 0; i < listaVisitasReclusas.length; i++) {
            System.out.println(listaVisitasReclusas[i][0] + " " + listaVisitasReclusas[i][1]);
        }
    }
}
