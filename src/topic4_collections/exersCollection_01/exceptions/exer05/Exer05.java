package topic4_collections.exersCollection_01.exceptions.exer05;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Exer05 ex = new Exer05();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el nom: ");
            String nombre = sc.nextLine();

            System.out.print("Introduce los apellidos: ");
            String apellidos = sc.nextLine();

            System.out.print("Introduce la edad: ");
            int edad = sc.nextInt();
            if (edad < 0) {
                throw new EdadException("la edad debe ser mayor a 0");
            }
            sc.nextLine();

            System.out.print("Introduce el dni: ");
            String dni = sc.nextLine();

            if (!ex.validarDni(dni)) {
                throw new DniException("DNI invalido");
            }

            System.out.print("Introduce el sexo (dona, home): ");
            String sexe = sc.nextLine();

        } catch (EdadException e) {
            throw new RuntimeException(e);
        } catch (DniException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void formularioMatricula() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellidos;
        int edad;
        String sexe;

        System.out.print("Introduce el nom: ");
        nombre = sc.nextLine();

        System.out.print("Introduce los apellidos: ");
        apellidos = sc.nextLine();

        System.out.print("Introduce la edad: ");
        edad = sc.nextInt();

        System.out.print("Introduce el sexo (dona, home): ");
        sexe = sc.nextLine();
    }

    public boolean validarDni(String dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        boolean dniValido = false;
        if (dni.length() == 9) {
            char letraDni = dni.charAt(8);
            int numero = Integer.parseInt(dni.substring(0, 8));
            int resto = numero % 23;
            if (letraDni == letras.charAt(resto)) {
                dniValido = true;
            }
        }
        return dniValido;
    }
}