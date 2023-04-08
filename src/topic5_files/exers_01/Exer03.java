package topic5_files.exers_01;

import java.io.File;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

    }

    public void buscadorArchivos(Scanner sc){
        String rutaDirectorio = "";
        File directorio = new File(rutaDirectorio);

        if (directorio.isDirectory()){
            File[] listaArchivos = directorio.listFiles();

        }
    }
}