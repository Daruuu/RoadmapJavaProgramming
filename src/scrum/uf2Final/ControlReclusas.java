package scrum.uf2Final;

import java.util.Scanner;

public class ControlReclusas {
    public static final String horaRegresoPatio = "12:00";
    public static final String[][] listaVisitasReclusas = {
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
            {"0001", "23890755X", "900", "12:00"},
            {"0002", "65229087S", "900", "15:00"},
            {"0003", "24234789D", "900", "10:00"},
            {"0004", "41229789A", "900", "16:00"},

            {"0007", "41516889F", "900", "16:00"},
            {"0009", "41516889A", "900", "16:00"},
            {"0011", "31726979G", "900", "16:00"},
            {"0013", "34031429B", "900", "16:00"},

            {"0015", "54436451A", "900", "16:00"},
            {"0018", "94136911E", "900", "16:00"},
    };

    public static void main(String[] args) {
        listarReclusas();
    }

    public static void comprobarHorarioRecluta() {
        for (int i = 0; i < controlReclusas.length; i++) {
            System.out.println("RECLUSA CON ID: " + controlReclusas[i][0] + " Y DNI " + controlReclusas[i][1]);
            if (horaRegresoPatio.equals(controlReclusas[i][3])) {
                System.out.println("\033[34mREGRESO HORA CORRECTA\033[0m");
                System.out.println();
            } else {
                System.out.println("\033[31mREGRESO FUERA DE HORARIO\033[0m");
                System.out.println();
            }
        }
    }

    public static int controlEntrada() {
        boolean entradaMenorSalida = false;
        for (int i = 0; i < controlReclusas.length; i++) {
            for (int j = 0; j < controlReclusas[i].length && !entradaMenorSalida; j++) {
                if (Integer.parseInt(controlReclusas[i][3]) <= Integer.parseInt(horaRegresoPatio)) {
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
        int reclusavisitada = sc.nextInt();
        int posicion = reclusavisitada - 1;
        if (listaVisitasReclusas[posicion][3].equals("0")) {
            listaVisitasReclusas[posicion][3] = "1";
            System.out.println("puedes visitar a la reclusa");
            registroVisitasFamiliar(reclusavisitada);
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
