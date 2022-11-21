package NoGit.PracticaExamen;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine().toLowerCase();
        String dni = sc.nextLine();
        String ciudad = sc.nextLine().toLowerCase();
        String telefono = sc.nextLine();

        String[] palabras = nombre.split(" ");
        String nuevoNombre = "";
        for (int i = 0; i < palabras.length; i++) {
            nuevoNombre += palabras[i].replaceFirst(palabras[i].charAt(0) + "", Character.toUpperCase(palabras[i].charAt(0)) + "") + " ";
        }
        System.out.println(nuevoNombre);

        if (dni.length() > 9) {
            System.out.println("dni incorrecte");
        } else System.out.println(dni);

        String firstLetterCiudad = ciudad.substring(0, 1);
//        System.out.println(firstLetterCiudad);
        String letraSobrante = ciudad.substring(1);
        firstLetterCiudad = firstLetterCiudad.toUpperCase();
        String nuevaCiudad = firstLetterCiudad + letraSobrante;
        System.out.println(nuevaCiudad);


        if (telefono.length() > 9) {
            System.out.println("telefon incorrecte");
        } else {
            for (int i = 0; i < telefono.length(); i++) {
//                telefono.charAt(i);
                if (i == 3 || i == 6) {
                    System.out.print(" ");
                }
                System.out.print(telefono.charAt(i));
            }
        }
    }
}