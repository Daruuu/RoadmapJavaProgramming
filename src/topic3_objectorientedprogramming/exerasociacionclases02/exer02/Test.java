package topic3_objectorientedprogramming.exerasociacionclases02.exer02;

public class Test {
    private Test test;

    public Test() {
    }

    public static void main(String[] args) {

        Alumne alumne1 = new Alumne("daruny", "sc", 24, "31214567A");
        Alumne alumne2 = new Alumne("matt", "smith", 21, "42860564A");

        Modul modul12 = new Modul("m12");
        Modul modul04 = new Modul("m04");
        Modul modul07 = new Modul("m07");
        Modul modul09 = new Modul("m09");
        Modul modul0r = new Modul("m03");

        Matricula matricula1 = new Matricula(alumne1, modul07, 6.4);
        Matricula matricula2 = new Matricula(alumne2, modul09, 8.4);
        Matricula matricula3 = new Matricula(alumne2, modul09, 8.4);

        Test test1 = new Test();



    }

    // Dado un dni de entrada,
    // extrae la media de las notas de este alumno.
    public Matricula extraerNotaMedia(String dni) {
        getClass().getName();

    }

    public static void menuPrograma() {
        System.out.print("[1]- extreureNotesMitjana: Donat un dni d'entrada, n'extreu la mitjana de les notes d'aquest alumne.\n" +
                "[2]- extreuModulsSuspesos: Donat el Dni d'un alumne, n'extreu els mòduls que ha suspès.\n" +
                "Elige una opcion:");
    }
}
