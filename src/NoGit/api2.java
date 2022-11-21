package NoGit;

import java.util.Scanner;

public class api2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anyo = sc.nextInt();
        if ((dia >= 0 && dia <= 31) && (mes >= 0 && mes <= 12)) {
            if (mes == 1) {
                System.out.println(dia + " de " + "Enero" + " de " + anyo);
            } else if (mes == 2 && dia <= 28) {
                System.out.println(dia + " de " + "Febrero" + " de " + anyo);
            } else if (mes == 3) {
                System.out.println(dia + " de " + "Marzo" + " de " + anyo);
            } else if (mes == 4 && dia <= 30) {
                System.out.println(dia + " de " + "Abril" + " de " + anyo);
            } else if (mes == 5) {
                System.out.println(dia + " de " + "Mayo" + " de " + anyo);
            } else if (mes == 6 && dia <= 30) {
                System.out.println(dia + " de " + "Junio" + " de " + anyo);
            } else if (mes == 7) {
                System.out.println(dia + " de " + "Julio" + " de " + anyo);
            } else if (mes == 8) {
                System.out.println(dia + " de " + "Agosto" + " de " + anyo);
            } else if (mes == 9 && dia <= 30) {
                System.out.println(dia + " de " + "Septiembre" + " de " + anyo);
            } else if (mes == 10) {
                System.out.println(dia + " de " + "Octubre" + " de " + anyo);
            } else if (mes == 11 && dia <= 30) {
                System.out.println(dia + " de " + "Noviembre" + " de " + anyo);
            } else if (mes == 12) {
                System.out.println(dia + " de " + "Diciembre" + " de " + anyo);
            }else {
                System.out.println("La data no és correcta");
            }
        } else {
            System.out.println("La data no és correcta");
        }

    }
}
