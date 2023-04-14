package topic5_files.practica_01;

import java.io.File;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {
        Exer05 exer05 = new Exer05();
        exer05.eliminarFicheros();
    }

    public void eliminarFicheros() {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        String rootPath = "src/topic5_files/practica01/";

        try {
            File finalPath = new File(rootPath + "/" + path);
            if (finalPath.isDirectory()) {
                if (finalPath.delete()) {
                    System.out.println("el archivo " + finalPath.getName() + " ha sido eliminado.");
                }
            } else {
                System.out.println("ruta de directorio incorrecto!");
            }
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
/*
                File[] lista = finalPath.listFiles();
                for (File f : lista) {
                    if (f.exists()) {
                        f.delete();
                    }
                }
*/
