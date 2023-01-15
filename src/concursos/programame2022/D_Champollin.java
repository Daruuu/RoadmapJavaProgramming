package concursos.programame2022;

import java.util.Scanner;

public class D_Champollin {
    // n == numero de casos a procesar
    // cada caso es una linea (alfabeto ingles , mayuscula-minusculas- espacios)
    // cada linea no tiene mas de 100 palabras
    // maximo palabras por linea == 10 silabas
    // contar las silabas que hay en la frase.

    public static void main(String[] args) {
        contarLetrasPorLinea();
    }
    //IMPUT
    /*
    3
    Mi mama me mima
    Ramses amaba a Nefertari
    Egipto depende del Nilo para beber
     */
    public static void contarLetrasPorLinea() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputLineas = new String[n];
        sc.nextLine();
        for (int i = 0; i < inputLineas.length; i++) {
            inputLineas[i] = sc.nextLine();
        }
        String[] linea;
        for (int i = 0; i < inputLineas.length; i++) {
            linea = inputLineas[i].split("");
        }

        System.out.println("input:");
        for (String s: inputLineas){
            System.out.println(s);
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
