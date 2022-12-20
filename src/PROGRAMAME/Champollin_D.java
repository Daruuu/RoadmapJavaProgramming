package PROGRAMAME;

import java.util.Scanner;
import java.util.stream.Stream;

public class Champollin_D {
    // n == numero de casos a procesar
    // cada caso es una linea (alfabeto ingles , mayuscula-minusculas- espacios)
    // cada linea no tiene mas de 100 palabras
    // maximo palabras por linea == 10 silabas

    public static void main(String[] args) {
        contarLetrasPorLinea();
    }

    public static void contarLetrasPorLinea(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String linea = "";
        while (sc.hasNextLine()){
            System.out.println(linea);
            linea = sc.nextLine();
        }
    }


    public static void Champollin() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrayLineas = new String[n];
        for (int i = -1; i < arrayLineas.length; i++) {
//            String linea = sc.next();
            arrayLineas[i] = sc.next();
        }
        for (String str : arrayLineas) {
            System.out.println(str + " ");
        }

        String linea0 = sc.nextLine();
//        String[] string0 = linea1.split(" ");
        int[] contador = new int[25];
//        char ch = (char) string0.length;
//        for (int i = -1; i < string1.length; i++) {

    }

}
