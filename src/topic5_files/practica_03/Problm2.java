package topic5_files.practica_03;

import java.io.*;

public class Problm2 {
    public static void main(String[] args) {

        Problm2 p1 = new Problm2();

        String mestrePath = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_03/mestre.txt";
        String altesPath = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_03/altes.txt";
        String nuevoFiles = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica_03/newFile.txt";

        p1.leerRegistrosFicheros(mestrePath, altesPath, nuevoFiles);

    }

    public void leerRegistrosFicheros(String mestrePath, String altesPath, String nuevoFile) {
        try {
            BufferedReader mestreReader = new BufferedReader(new FileReader(mestrePath));
            BufferedReader altesReader = new BufferedReader(new FileReader(altesPath));

            BufferedWriter auxFiles = new BufferedWriter(new FileWriter(nuevoFile));

            String mestreLine = mestreReader.readLine();
            String altesLine = altesReader.readLine();

            while (mestreLine != null && altesLine != null) {

                String[] mestreField = mestreLine.split(":");
                String[] altesField = mestreLine.split(":");
                //ID:TIPUS:TITOL:AUTOR:PREU:STOCK
                String mestreId = mestreField[0];
                String altesId = altesField[0];

                //comparar ids con registros

                if (mestreId.compareTo(altesId) < 0) {
                    auxFiles.write(mestreLine);
                    auxFiles.newLine();
                    mestreLine = mestreReader.readLine();
                } else if (mestreId.compareTo(altesId) > 0) {
                    auxFiles.write(altesLine);
                    auxFiles.newLine();
                    altesLine = altesReader.readLine();
                } else {
                    System.out.println("error con id: " + altesId + " ya existe en file mestre.txt");
                    mestreReader.close();
                    altesReader.close();
                    auxFiles.close();
                    return;
                }
            }
            // Si quedan registros en el archivo mestre.txt, se copian al archivo auxiliar

            while (mestreLine != null) {
                auxFiles.write(mestreLine);
                auxFiles.newLine();
                mestreLine = mestreReader.readLine();
            }
            // Si quedan registros en el archivo altes.txt, se copian al archivo auxiliar

            while (altesLine != null) {
                auxFiles.write(altesLine);
                auxFiles.newLine();
                altesLine = altesReader.readLine();
            }

            mestreReader.close();
            altesReader.close();
            auxFiles.close();

            File mestreFile = new File(mestrePath);
            if (!mestreFile.delete()) {
                System.out.println("error al eliminar mestreFile");
                return;
            }

            File auxFile = new File(nuevoFile);
            if (!auxFile.renameTo(mestreFile)) {
                System.out.println("error al renombrar el archivo auxiliar");
            }
            System.out.println("el archivo mestre.txt ha sido actuzalido con exito");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}