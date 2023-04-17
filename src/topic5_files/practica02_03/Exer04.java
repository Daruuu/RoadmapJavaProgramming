package topic5_files.practica02_03;

import java.io.*;

public class Exer04 {
    public static void main(String[] args) {
        Exer04 exer04 = new Exer04();
        String archivo = "testExer04.txt";
//        String archivo1 = "testExer04.txt";
        String ruta = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica02_03/";
//        String ruta = "";
        String strABuscar = "duis";
        int strInFile = exer04.countStringInFile(ruta, archivo, strABuscar);
        System.out.println(strInFile);
    }

    public int countStringInFile(String ruta, String archivo, String strABuscar) {
        int count = 0;
        try {
            if (!ruta.contains(".txt")) {
                System.out.println("no es fichero de texto plano");
            } else {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    count += countStringInLine(line, strABuscar);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int countStringInLine(String line, String strToSearch) {
        int counter = 0;
        int i = line.indexOf(strToSearch);
        while (i != -1) {
            counter++;
            i = line.indexOf(strToSearch, i + 1);
        }
        return counter;
    }
}
