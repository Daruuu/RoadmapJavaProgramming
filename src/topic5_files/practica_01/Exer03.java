package topic5_files.practica_01;

import java.io.File;
import java.io.FileNotFoundException;

public class Exer03 {
    public static void main(String[] args) throws FileNotFoundException {
        Exer03 exer03 = new Exer03();
        String rutaDirectorio = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_01/testExer03";
        File file = new File(rutaDirectorio);
        String str = "exercisi";
        exer03.buscarNombreArchivo(file, str);
    }

    public void buscarNombreArchivo(File rutaDirectorio, String strABuscar) {

        boolean encontrado = false;
        try {
            if (!rutaDirectorio.isDirectory()) {
                System.out.println("la ruta es incorrecta!");
            } else {
                File[] filesLista = rutaDirectorio.listFiles();
                for (File archivo : filesLista) {
                    if (archivo.isFile() && archivo.getName().contains(strABuscar)) {
                        System.out.println("archivo con nombre -> " + archivo.getName() + " contiene el nombre buscado.");
                        encontrado = true;
                    }
                }
            }
            if (!encontrado) {
                System.out.println("ningun archivo con ese nombre!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}