package examenFicheros.problema01;

import java.io.File;
import java.io.IOException;

public class ProblemaUno {
    public static void main(String[] args) throws IOException {
        ProblemaUno p1 = new ProblemaUno();
        String path = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/examenFicheros";
        File input = new File(path);
        p1.operacionesFichero(input);
    }

    public void operacionesFichero(File fileInput) throws IOException {
        File[] listFiles = fileInput.listFiles();
        int contador = 0;
        if (fileInput.exists() && fileInput.length() > 1) {
            if (fileInput.isFile()) {
                System.out.println("archivo con tamanyo :" + fileInput.length());
            }
            if (fileInput.isDirectory()) {
                assert listFiles != null;
                for (File f : listFiles) {
                    contador++;
                }
            }
            if (contador > 0) {
                System.out.println("cantidad ficheros: " + contador);
            }
        } else {
            File newFile = new File(fileInput.getName());
            if (fileInput.getName().contains(".")) {
                if (newFile.createNewFile()) {
                    System.out.println("fichero nuevo creado " + newFile.getName());
                } else if (newFile.mkdir()) {
                    System.out.println("directorio nuevo creado " + newFile.getName());
                }
            }
        }
    }
}