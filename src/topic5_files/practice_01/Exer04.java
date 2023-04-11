package topic5_files.practice_01;

import java.io.*;

public class Exer04 {
    public static void main(String[] args) {
        Exer04 exer04 = new Exer04();
        exer04.informacionDirectorio();
    }

    public void informacionDirectorio() {
        try {
            System.out.print("Introduce nombre del directorio: ");
            String pathDirectory = "prueba";

            String pathRepo = "src/topic5_files/practice_01/";

            File finalPath = new File(pathRepo + pathDirectory);
            System.out.println(finalPath.getCanonicalPath());

            if (finalPath.isDirectory()) {

                File[] files = finalPath.listFiles();
                for (File f : files) {
                    System.out.println("file -> " + f.getCanonicalPath() +
                            "\n" + f.length() +
                            "\n" + f.getName());
                }
            } else {
                System.out.println("is not a direcotry");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}