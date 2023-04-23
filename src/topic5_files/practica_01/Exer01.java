package topic5_files.practica_01;

import java.io.File;

public class Exer01 {
    public static void main(String[] args) {
        Exer01 exer01 = new Exer01();
        File directory = new File("src/topic4_collections");
        exer01.encontrarFicheroMasGrande(directory);
    }

    public void encontrarFicheroMasGrande(File file) {

        if (!file.isDirectory()) {
            System.out.println("este directorio no es valido!");
        } else {
            File[] filesInDirectory = file.listFiles();
            if (filesInDirectory == null || filesInDirectory.length == 0) {
                System.out.println("directorio vació");
            } else {
                File archivoMasGrande = filesInDirectory[0];
                for (File f : filesInDirectory) {
                    if (file.length() > archivoMasGrande.length()) {
                        archivoMasGrande = f;
                    }
                }
                System.out.println("archivo mas grande: " + archivoMasGrande.length());
            }
        }
    }
}