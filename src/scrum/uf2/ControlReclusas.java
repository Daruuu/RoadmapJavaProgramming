package scrum.uf2;

import java.util.Scanner;

public class ControlReclusas {
    public static final String horaRegresoPatio = "12:00";

    public static boolean[] visitas = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    public static String[][] controlReclusas = {
            //id presa, dni, hora salida a patio, hora real de llegada de presa
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
            //4,7,8,9
    };

    public static final String[][] listaVisitasReclusas = {
            //id, nombre, dia semana  boolean visita? si : no
            {"0001", "Juana Nascimento", "3"},
            {"0002", "Giovana Libert", "5"},
            {"0003", "Maria Lisa", "4"},
            {"0004", "Marta Eulalia", "2"},
            {"0005", "Carmen", "1"},
            {"0006", "Ana Beltran", "2"},
            {"0007", "Andrew Gil", "3"},
            {"0008", "Camila Jimenez", "4"},
            {"0009", "Andrea Linares", "3"},
            {"0010", "Laura Ochoa", "5"}
    };

    //crear una funcion en la cual poder comparar controlReclusas[i][3] con la variable horaRegresoPatio
    //y poder saber si una reclusa ha llegado a tiempo del patio
    public static void mirarPuntualidadReclusas() {
        for (int i = 0; i < controlReclusas.length; i++) {
            String[] horaMinuto = controlReclusas[i][3].split(":");
            int hora = Integer.parseInt(horaMinuto[0]);
            int minuto = Integer.parseInt(horaMinuto[1]);
        }
    }

    // esta funcion hay que divirla en 2 partes
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

    //funcion en proceso
    public static void visitasPresasV1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿ID DE RECLUSA QUE QUIERAS VISITAR?");
        for (int i = 0; i < Reclusas.fichasTecnicasReclusas.length; i++) {
            System.out.println(Reclusas.fichasTecnicasReclusas[i][0] + " " + Reclusas.fichasTecnicasReclusas[i][1]);
        }
        System.out.print("Escoge una reclusa:");
        int reclusaVisitada = sc.nextInt() - 1;
        while (reclusaVisitada >= 0 && reclusaVisitada < Reclusas.fichasTecnicasReclusas.length) {
            for (int i = 0; i < Reclusas.fichasTecnicasReclusas.length; i++) {

            }
            reclusaVisitada = sc.nextInt();
        }
        int posicion = reclusaVisitada - 1;
        if ((posicion > -1 && posicion < 18) && !visitas[posicion]) {
            visitas[posicion] = true;
            System.out.println("PUEDES VISITAR A LA RECLUSA");
        } else if (((posicion > -1 && posicion < 18) && visitas[posicion])) {
            System.out.println("LA RECLUSA YA TIENE VISITA");
        } else {
            System.out.println("CODIGO DE RECLUSA NO EXISTE");
        }
    }

    //FUNCION A MEJORAR

    // Control de visites amb familiars.
    // (Determinar que només tenim un familiar a cada presa disponible)
    public static void visitasReclusas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿CODIGO DE RECLUSA QUE QUIERAS VISITAR?");
        for (int i = 0; i < 10; i++) {
            System.out.println(Reclusas.fichasTecnicasReclusas[i][0] + " " + Reclusas.fichasTecnicasReclusas[i][1]);
        }
        System.out.print("Escoge una reclusa:");
        int reclusavisitada = sc.nextInt();
        int posicion = reclusavisitada - 1;

        if ((posicion > -1 && posicion < 18) && !visitas[posicion]) {
            visitas[posicion] = true;
            System.out.println("PUEDES VISITAR A LA RECLUSA");
        } else if (((posicion > -1 && posicion < 18) && visitas[posicion])) {
            System.out.println("LA RECLUSA YA TIENE VISITA");
        } else {
            System.out.println("CODIGO DE RECLUSA NO EXISTE");
        }
    }
    // implementar una funcion para que una reclusa tenga una visita
    // usar la tabla listaVisitasReclusas para saber los dias de visita de cada reclusa
}
