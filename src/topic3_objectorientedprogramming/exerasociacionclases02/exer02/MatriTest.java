package topic3_objectorientedprogramming.exerasociacionclases02.exer02;

public class MatriTest {
    public static void main(String[] args) {
/*
        Matricula matricula1 = new Matricula("daruny", "sc", 22, "32546759D", "modulo 10", 6);
        Matricula matricula2 = new Matricula("daruny", "sc", 22, "32546759D", "modulo 10", 6);
        Matricula matricula3 = new Matricula("daruny", "sc", 22, "32546759D", "modulo 10", 6);
*/

        Alumne alumne1 = new Alumne("daruny", "sc", 24, "31214567A");
        Alumne alumne2 = new Alumne("matt", "smith", 21, "42860564A");

        Modul modul12 = new Modul("m12");
        Modul modul04 = new Modul("m04");
        Modul modul07 = new Modul("m07");
        Modul modul09 = new Modul("m09");
        Modul modul0r = new Modul("m03");

        Matricula matricula1 = new Matricula(alumne1, modul07, 6.4);
        Matricula matricula2 = new Matricula(alumne2, modul09, 8.4);


    }
}
