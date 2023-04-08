package topic5_files.exers_01;

import java.io.File;

public class Exer01 {
    public static void main(String[] args) {
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
    }
}
