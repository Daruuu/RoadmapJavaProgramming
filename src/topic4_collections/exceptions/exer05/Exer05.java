package topic4_collections.exceptions.exer05;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Exer05 ex = new Exer05();
        Scanner sc = new Scanner(System.in);

        try {
            ex.formularioMatricula(sc);

        } catch (EdadException e) {
            throw new RuntimeException(e);
        } catch (DniException d) {
            throw new RuntimeException("error al introducir el dni " + d.getMessage());
        } catch (SexoException s) {
            throw new RuntimeException("error al introducir el sexo " + s.getMessage());
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void formularioMatricula(Scanner sc) throws EdadException, DniException, SexoException {
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

        if (!validarDni(dni)) {
            throw new DniException("DNI invalido");
        }

        System.out.print("Introduce el sexo (dona, home): ");
        String sexe = sc.nextLine();
        if ((!sexe.equals("home")) && (!sexe.equals("dona"))) {
            throw new SexoException("valores posibles son :(home/dona)");
        }
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