package topic5_files.practica_01;

import java.io.*;

public class Exer06 {
    public static void main(String[] args) throws IOException {
        Exer06 exer06 = new Exer06();
        String path = "";
        exer06.clonarDirectorio(path);
    }

    void clonarDirectorio(String path) throws IOException {
        File directorio = new File(path);

        if (!directorio.exists()) {
            System.out.println("el directorio no existe!");
        }

        File[] listaFiles = directorio.listFiles();
        if (listaFiles == null) {
            System.out.println("directorio vacio!");
            return;
        }

        for (File archivos : listaFiles) {
            if (directorio.isDirectory()) {
                File nuevoArchivo = new File(archivos.getPath() + ".txt");
                try {
                    nuevoArchivo.createNewFile();
                } catch (IOException e) {
                    System.out.println(nuevoArchivo.getName());
                }
            }
            if (archivos.isFile()) {
                File nuevoArchivo = new File(directorio.getPath() + "/" + archivos.getName().replace(".txt", ""));
                nuevoArchivo.mkdir();
            }
        }
    }
}