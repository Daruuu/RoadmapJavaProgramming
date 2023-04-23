package topic5_files.practica_02_03;

import java.io.*;

public class Exer04 {
    public static void main(String[] args) throws FileNotFoundException {
        Exer04 exer04 = new Exer04();

//        String archivo = "testExer04.txt";
        String archivoPath = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_02_03/testExer04.txt";
        String strABuscar = "her";

//        int strInFile = exer04.countStringInFile(archivo, strABuscar);
//        System.out.println("cantidad de palabras encontradas: " + strInFile);
        exer04.countStringInFile(archivoPath, strABuscar);
    }

    public void countStringInFile(String archivo, String strABuscar) throws FileNotFoundException {
        int count = 0;
        String[] words;

        File file = new File(archivo);
        FileReader fr = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fr);
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                words = line.split(" ");
                for (String w : words) {
                    if (w.equals(strABuscar)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (count != 0) {
            System.out.println("catidad de palabra repetida: " + count);
        } else {
            System.out.println("palabra no encontrada");
        }
    }

    public int contadorPalabras(String line, String strToSearch) {
        int counter = 0;
        int i = line.indexOf(strToSearch);
        while (i != -1) {
            i = line.indexOf(strToSearch, i + 1);
            counter++;
        }
        return counter;
    }
}
