package topic3_objectorientedprogramming.exerasociacionclases02.exer02;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static List<Matricula> matriculas = new ArrayList<>();

    public Test() {
    }

    public static void main(String[] args) {

        Test test1 = new Test();
        Alumne alumne1 = new Alumne("daruny", "sc", 24, "31214567A");
        Alumne alumne2 = new Alumne("matt", "smith", 21, "42860564A");

        Modul modul12 = new Modul("m12");
        Modul modul04 = new Modul("m04");
        Modul modul07 = new Modul("m07");
        Modul modul09 = new Modul("m09");
        Modul modul03 = new Modul("m03");

//        List<Matricula> matriculas = new ArrayList<>();
        matriculas.add(new Matricula(alumne1, modul07, 6.4));
        matriculas.add(new Matricula(alumne1, modul12, 9));
        matriculas.add(new Matricula(alumne1, modul04, 5));

        matriculas.add(new Matricula(alumne2, modul04, 7.5));
        matriculas.add(new Matricula(alumne2, modul03, 4.7));
        matriculas.add(new Matricula(alumne2, modul09, 8.4));

        System.out.print("Media de notas para el alumno 1 es:\n");
        System.out.println(test1.extraerNotaMedia("31214567A"));
        System.out.println(test1.extraerNotaMedia("312145dfA"));
        test1.extraerModuloSuspenso("31214567A");
        test1.extraerModuloSuspenso("42860564A");

    }

    // Dado un dni de entrada,
    // extrae la media de las notas de este alumno.
    public double extraerNotaMedia(String dni) {
        int contadorNotas = 0;
        double sumaNotas = 0;
        for (Matricula listaMatriculas : matriculas) {
            if (listaMatriculas.getAlumne().getDni().equals(dni)) {
                sumaNotas += listaMatriculas.getNota();
                contadorNotas++;
            }
        }
        if (contadorNotas == 0) {
            System.out.println("Alumno con DNI " + dni + " no encontrado");
            return 0;
        }
        return sumaNotas / contadorNotas;
    }

    //- extraeModulsSuspesos: Dado el Dni de un alumno,
    //extrae los módulos que ha suspendido.
    public void extraerModuloSuspenso(String dni) {
        double minimaNota = 5.0;
        boolean dniCorrecto = false;
        List<Modul> modulosSuspendidos = new ArrayList<>();
        for (Matricula matricula : matriculas) {
            if (matricula.getAlumne().getDni().equals(dni)) {
                dniCorrecto = true;
                if (matricula.getNota() < minimaNota) {
                    modulosSuspendidos.add(matricula.getModul());
//                    System.out.println(matricula + " " + matricula.getNota());
                }
            }
        }
        if (!dniCorrecto) {
            System.out.println("dni incorrecto");
        } else if (modulosSuspendidos.isEmpty()) {
            System.out.println("no haymodulos suspendidos");
        } else {
            System.out.println("modulos suspendidos:");
            for (Modul modulos : modulosSuspendidos) {
                System.out.println(modulos.getNomModul() + " ");
            }
        }
    }

    public static void menuPrograma() {
        System.out.print("[1]- extreureNotesMitjana: Donat un dni d'entrada, n'extreu la mitjana de les notes d'aquest alumne.\n" +
                "[2]- extreuModulsSuspesos: Donat el Dni d'un alumne, n'extreu els mòduls que ha suspès.\n" +
                "Elige una opcion:");
    }
}
