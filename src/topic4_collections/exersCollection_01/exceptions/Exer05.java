package topic4_collections.exersCollection_01.exceptions;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

    }

    void formulario() {
        Scanner sc = new Scanner(System.in);
        String matricula;
        String nombre;
        int edad;
        String sexe;
        System.out.println("Introduce la matricula:");
        matricula = sc.nextLine();

        System.out.println("Introduce el nom:");
        matricula = sc.nextLine();

        System.out.println("Introduce la edad:");
        edad = sc.nextInt();

        System.out.println("Introduce el sexo:(dona, home");
        sexe = sc.nextLine();
    }
}
