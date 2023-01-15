package topic1_StructuredProgramming.B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class LibrosOperadorTernari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadEstanterias = sc.nextInt();
        int cantidadEstantes = sc.nextInt();
        int numLibrosEstanteria = sc.nextInt();
        int cantidadLibros = sc.nextInt();
        int prestamosLibros = (cantidadEstanterias * cantidadEstantes) * numLibrosEstanteria;
        if (cantidadLibros <= prestamosLibros)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
