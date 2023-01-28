package topic2_modularprogramming.exercises_1ModularBasic;

import java.util.Scanner;

/*
11. El nom del dia de la setmana.
L'objectiu d'aquesta activitat és saber codificar un mètode amb paràmetres d'entrada i sortida perquè realitzi una tasca concreta.
Has de crear una funció que si li entrem un enter sigui capaç de traure un String indicant quin dia de la setmana és (del 1 al 7),
si no està en aquest rang també ho ha de dir.
Fes l'exercici de dues maneres.
Fent que diaDeLaSetmana és una funció i fent que diaDeLaSetmana sigui una acció.
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero del 1 al 7");
        int dia = sc.nextInt();
        diaSemanaAccion(dia);
        System.out.println("dia semana funcion:");
        int dia1 = sc.nextInt();
        String diaFuncion = diaSemanaFuncion(dia1);
        System.out.println(diaFuncion);
    }

    public static void diaSemanaAccion(int n) {

        if (n == 1) System.out.println("Lunes");
        else if (n == 2) {
            System.out.println("martes");
        } else if (n == 3) {
            System.out.println("miercoles");
        } else if (n == 4) {
            System.out.println("jueves");
        } else if (n == 5) {
            System.out.println("viernes");
        } else if (n == 6) {
            System.out.println("sabado");
        } else if (n == 7) {
            System.out.println("domingo");
        } else {
            System.out.println("n es incorrecto");
        }
    }

    public static String diaSemanaFuncion(int n) {
        String respuesta;
        if (n == 1) {
            respuesta = "lunes";
            return respuesta;
        } else if (n == 2) {
            respuesta = "martes";
            return respuesta;
        } else if (n == 3) {
            respuesta = "dimecres";
            return respuesta;
        } else if (n == 4) {
            respuesta = "dijous";
            return respuesta;
        } else if (n == 5) {
            respuesta = "divendres";
            return respuesta;
        } else if (n == 6) {
            respuesta = "disabte";
            return respuesta;
        } else if (n == 7) {
            respuesta = "diumenge";
            return respuesta;
        } else {
            respuesta = "n es incorrecto";
            return respuesta;
        }
    }
}
