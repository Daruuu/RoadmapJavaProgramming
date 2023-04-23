package topic5_files.practica_02_03;

import java.io.*;

public class Exer08 {
    public static void main(String[] args) throws IOException {
        Exer08 exer08 = new Exer08();

        String fichero = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_02_03/test07.txt";
//        File file = new File(fichero);
//        exer08.practicarBufferInputStream(fichero);
//        File file = new File(data);


        String data = "this is a tesxt practicing wit BufferOutputStream in java";
        exer08.testearBufferOutputStream(data);
    }

    public void practicarBufferInputStream(String fichero) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fichero);
//            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(fichero), 2048);
            BufferedInputStream buffer = new BufferedInputStream(fileInputStream);
            System.out.println("available bytes at the beginning: " + buffer.available());

            int i = buffer.read();

            while (i != -1) {
                System.out.print((char) i);
                i = buffer.read();
            }
            System.out.println("available bytes at the end: " + buffer.available());
            buffer.close();

        } catch (Exception e) {
            e.getStackTrace();
//            System.out.println("Error " + e.getMessage());
        }
    }

    public void testearBufferOutputStream(String ruta) throws FileNotFoundException {
        String rutaOutput = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_02_03/newOutput.txt";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream(rutaOutput);
            BufferedOutputStream output = new BufferedOutputStream(fileOutputStream);
            byte[] array = ruta.getBytes();
            // write data to the output file
            output.write(array);
            // sirve para garantizar que lo datos se escriben en el archivo de salida
            output.flush();
            output.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
