package topic5_files.practica02_03;

import java.io.*;

public class Exer09 {

    public static void main(String[] args) throws IOException {
        Exer09 exer09 = new Exer09();
        String input = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica02_03/testExercises/exer09Input.txt";
        String output = "src/topic5_files/practica02_03/testExercises/output09Output.txt";
        exer09.crearCopiaArchivo(input, output);
    }

    public void crearCopiaArchivo(String inputFile, String outputFile) throws IOException {
//        FileInputStream inputStream = new FileInputStream(inputFile);
//        BufferedInputStream bfInput = new BufferedInputStream(inputStream);
        BufferedInputStream bfInput= new BufferedInputStream(new FileInputStream(inputFile));

        FileOutputStream outputStream = new FileOutputStream(outputFile);
        BufferedOutputStream bfOutput = new BufferedOutputStream(outputStream);

        byte[] data = inputFile.getBytes();
        int bytesLeidos;

        while ((bytesLeidos = bfInput.read(data)) != -1) {
            bfOutput.write(data, 0, bytesLeidos);
        }

        bfOutput.flush();
        bfOutput.close();
        System.out.println("file copiado correctamente");
    }
}