package topic5_files.practica_01;

import java.io.File;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre de directorio: ");
        String nombreDirectorio = sc.nextLine();

        if (nombreDirectorio.length() == 0) {

            String directoryPath = "src/topic4_collections";
            File directory = new File(directoryPath);

            if (!directory.isDirectory()) {
                System.out.println("this path is not a valid directory!");
            } else {
                File[] filesInDirectory = directory.listFiles();

                if (filesInDirectory == null || filesInDirectory.length == 0) {
                    System.out.println("directory empty");
                } else {
                    File archivoMasGrandre = filesInDirectory[0];
                    for (File file : filesInDirectory) {
                        if (file.length() > archivoMasGrandre.length()) {
                            archivoMasGrandre = file;
                        }
                    }
                    System.out.println("archivo mas grande: " + archivoMasGrandre.getName());
                }
            }
        }else {
            System.out.println("sin argumentos introducidos");
        }
    }
}
