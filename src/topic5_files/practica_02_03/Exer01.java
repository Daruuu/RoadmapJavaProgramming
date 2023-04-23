package topic5_files.practica_02_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exer01 {
    public static void main(String[] args) throws IOException {

        Exer01 ex = new Exer01();
        String ruta = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_02_03/test01.txt.txt";
        ex.leerFichero(ruta);
    }

    public void leerFichero(String rutaFichero) throws IOException {
        FileReader fileReader = new FileReader(rutaFichero);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = bufferedReader.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}