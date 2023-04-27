package topic5_files.practica_02_03;

import java.io.*;

public class Exer10Analitzador {
    public static void main(String[] args) throws IOException {
        Exer10Analitzador exer10 = new Exer10Analitzador();

        String inputTexto = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_02_03/testInputs/";

        String outputFile = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_02_03/testOutputs/paraules.txt";

        File directory = new File(inputTexto);
        if (!directory.isDirectory()) {
            System.out.println("no es un directorio!");
        } else {
            File[] listaFiles = directory.listFiles();
            for (File f : listaFiles) {
                exer10.enviarDatosANuevoFichero(new File(f.getPath()), outputFile);
            }
        }
    }

    // calcular el numero de palabras que hay en el texto
    // enviarlo a un nuevo file "paraules.txt"
    // en cada ejecucion del programa agregar en la ultima linea el num palabras
    public int calcularNumeroPalabrasFichero(File inputFile) throws IOException {
        String line;
        int count = 0;

        FileReader fileReader = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fileReader);


        while ((line = br.readLine()) != null) {
            String[] words = line.split("");
            count += words.length;
        }
        return count;
    }

    public void enviarDatosANuevoFichero(File inputFile, String outputFile) {
        try {
            FileWriter fw = new FileWriter(outputFile, true);
            BufferedWriter bw = new BufferedWriter(fw);

            int numPalabrasFichero = calcularNumeroPalabrasFichero(inputFile);
            if (numPalabrasFichero > 0) {
                bw.write(inputFile.getAbsolutePath() + " " + numPalabrasFichero);
                System.out.println(inputFile.getCanonicalPath() + " " + numPalabrasFichero);
                bw.append("\n");
            } else {
                System.out.println("fichero con 0 palabras!");
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
