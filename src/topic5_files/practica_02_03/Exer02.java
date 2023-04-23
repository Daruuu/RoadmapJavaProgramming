package topic5_files.practica_02_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exer02 {
    public static void main(String[] args) throws IOException {

        Exer02 ex = new Exer02();
        String ruta = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_02_03/testexer02";
        ex.leerFicheroMayusculas(ruta);
    }

    public void leerFicheroMayusculas(String rutaFichero) throws IOException {
        FileReader fileReader = new FileReader(rutaFichero);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = bufferedReader.readLine();
        while (linea != null) {
            System.out.println(linea.toUpperCase());
            linea = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
