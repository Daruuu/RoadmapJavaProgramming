package topic5_files.practica_02_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exer06 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("exer06");
        Exer06 exer06 = new Exer06();
        exer06.leerFichero(fichero.getCanonicalPath());

    }

    public void leerFichero(String ruta) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String line = br.readLine();

        while (line != null) {
            line = br.readLine();
        }
        br.close();
    }

    public void escribirEnNuevoFichero(){

    }
}
