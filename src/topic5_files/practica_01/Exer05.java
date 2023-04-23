package topic5_files.practica_01;

import java.io.File;

public class Exer05 {

    public static void main(String[] args) {
        Exer05 exer05 = new Exer05();
        String rootPath = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_01/testExer05";
        File finalPath = new File(rootPath);

        exer05.eliminarFicheros(finalPath);
    }

    public void eliminarFicheros(File finalPath) {
        try {
            File[] listaArchivos = finalPath.listFiles();
//            if (finalPath.isDirectory()) {

            for (File archivo : listaArchivos) {
                if (archivo.getName().matches("^[0-9][a-zA-Z]")) {
                    archivo.delete();
//                        System.out.println("el archivo " + archivo.getName() + " ha sido eliminado.");
                }
//                }
//            } else {
//                System.out.println("ruta de directorio incorrecto!");
//            }
            }
        } catch (
                Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
