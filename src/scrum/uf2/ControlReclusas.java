package scrum.uf2;

import java.util.Scanner;

public class ControlReclusas {
    public static final String horaRegresoPatio = "12:00";

    public static boolean[] visitas = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    public static String[][] controlReclusas = {
            {"0001", "23890755X", "09:00", "12:00", "12:15"},
            {"0002", "65229087S", "09:00", "12:00", "13:00"},
            {"0003", "24234789D", "09:00", "12:00", "13:20"},
            {"0004", "41229789A", "09:00", "12:00", "12:00"},   //si
            {"0005", "41516889F", "09:00", "12:00", "14:40"},
            {"0006", "41516889A", "09:00", "12:00", "13:18"},
            {"0007", "31726979G", "09:00", "12:00", "12:00"},   //si
            {"0008", "34031429B", "09:00", "12:00", "12:00"},   //si
            {"0009", "54436451A", "09:00", "12:00", "12:00"},   //si
            {"0010", "94136911E", "09:00", "12:00", "16:05"},

    };
    //id presa, dni, hora salida a patio, hora llegada a celda, hora real de llegada de presa
    private static final String[][] fichasTecnicasPresas = {
            {"0001", "Juana Nascimento", "29", "20", "11", "3"},    //no pueden
            {"0002", "Giovana Libert", "42", "10", "5", "1"},
            {"0003", "Maria Lisa", "33", "8", "5", "3"},    // si pueden
            {"0004", "Marta Eulalia", "39", "4", "2", "2"},
            {"0005", "Carmen ", "65", "5", "1", "2"},
            {"0006", "Ana Beltran", "32", "10", "7", "3"},  // si pueden
            {"0007", "Andrew Gil", "40", "10", "10", "2"},
            {"0008", "Camila Jimenez", "37", "20", "17", "2"},
            {"0009", "Andrea Linares", "42", "5", "9", "3"},    //no pueden
            {"0010", "Laura Ochoa", "25", "15", "7", "3"}   // si pueden
    };

    public static void comprobarHorarioRecluta() {
        for (int i = 0; i < controlReclusas.length; i++) {
            System.out.println("RECLUSA CON ID " + controlReclusas[i][0] + "\nCON DNI " + controlReclusas[i][1]);
            if (horaRegresoPatio.equals(controlReclusas[i][3])) {
                System.out.println("REGRESO DE RECLUSA CORRECTO");
                System.out.println();
            } else {
                System.out.println("RECLUSA FUERA DE HORARIO");
                System.out.println();
            }
        }
    }
/*
    public static void comprobarHorarioPresaV1() {
        for (int i = 0; i < controlReclusas.length; i++) {

            System.out.println("RECLUSA ID: " + controlReclusas[i][0] + "\ncon DNI " + controlReclusas[i][1]);
            if (fecha1.compareTo(fecha2) < 0) {
                System.out.println(controlReclusas[i][2] + " es anterior a " + controlReclusas[i][4]);
            } else if (fecha1.compareTo(fecha2) > 0) {
                System.out.println(controlReclusas[i][2] + " es posterior a " + controlReclusas[i][4]);
            } else {
                System.out.println(controlReclusas[i][2] + " es igual a " + controlReclusas[i][4]);
            }

//            System.out.println("REGRESO DE RECLUSA CORRECTO");
//            System.out.println("RECLUSA FUERA DE HORARIO");
        }
    }
 */

    public static void visitasPresas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿ID DE RECLUSA QUE QUIERAS VISITAR?");
        for (int i = 0; i < fichasTecnicasPresas.length; i++) {
            System.out.println(fichasTecnicasPresas[i][0] + " " + fichasTecnicasPresas[i][1]);
        }
        System.out.print("Escoge una reclusa:");
        int reclusaVisitada = sc.nextInt() - 1;
        while (reclusaVisitada >= 0 && reclusaVisitada < fichasTecnicasPresas.length) {
            for (int i = 0; i < fichasTecnicasPresas.length; i++) {

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
}
