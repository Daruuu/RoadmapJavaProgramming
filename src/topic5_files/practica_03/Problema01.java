package topic5_files.practica_03;

import java.io.File;
import java.io.IOException;

/*
Escriu un programa que donat un pathname realitzi les següents operacions, informant-ne per pantalla:
    • Comprovar si existeix (0,75 punt)
    • Si existeix informar del tamany si és un fitxer, i del número de fitxers que conté si és un directori (1,5 punts)
    • Si no existeix, crear un fitxer buit si el pathname conté el caràcter punt '.' i un directori en cas contrari (0,75 punt)
 */
public class Problema01 {
    public static void main(String[] args) {
        Problema01 p1 = new Problema01();

        String path = "";
        File input = new File(path);
        p1.operacionesFicheros(input, path);

    }

    public void operacionesFicheros(File inputFile, String path) {

        if (inputFile.exists()) {
            System.out.println("file exists");

            if (inputFile.isFile()) {
                System.out.println("archivo con tamanyo " + inputFile.length());
            }

            if (inputFile.isDirectory()) {

                String[] filesDir = inputFile.list();
                int numFiles = filesDir != null ? filesDir.length : 0;
                System.out.println("num ficheros en direcctory: " + numFiles);
            }

        } else {
            System.out.println("this file not exists");

            if (path.contains(".")) {
                try {
                    if (inputFile.createNewFile()) {
                        System.out.println("new file empty");
                    } else {
                        System.out.println("No se pudo crear el archivo");
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                if (inputFile.mkdir()) {
                    System.out.println("new dir created");
                } else {
                    System.out.println("cant creat the dir");
                }
            }
        }
    }
}
