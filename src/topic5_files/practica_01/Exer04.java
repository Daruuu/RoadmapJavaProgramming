package topic5_files.practica_01;

import java.io.*;

public class Exer04 {
    public static void main(String[] args) {
        Exer04 exer04 = new Exer04();

        String pathRepo = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_01/testExer03";
        File finalPath = new File(pathRepo);

        exer04.datosArchivos(finalPath);
    }

    public void datosArchivos(File rutaDir) {
        try {
            if (rutaDir.isDirectory()) {

                File[] files = rutaDir.listFiles();
                for (File f : files) {
                    System.out.print("archivo con nombre: " + f.getName() +
                            "\n" + "ruta : " + f.getPath() +
                            "\n" + "y numero de bytes de " + f.length() + "\n");
                }
            } else {
                System.out.println("is not a directory");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}