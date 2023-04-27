package examenFicheros.problema02;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class ProblemaDos {
    public static void main(String[] args) throws IOException {
        ProblemaDos p2 = new ProblemaDos();

        String altes = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/examenFicheros/altes.txt";
        String mestre = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/examenFicheros/mestre.txt";
        File altesTxt = new File(altes);
        File mestreTxt = new File(mestre);

        p2.nuevoFicheroMestre(altesTxt, mestreTxt);

    }

    void updateFileMestre(File ficheroAltes) {
    }

    //recorrer mestre y altes a la vez
    // insertar los registros ordenadamente por ID
    // leer registro cada fichero
    // comparar ids
    // ids de menor a mayor

    public void nuevoFicheroMestre(File altes, File mestre) throws IOException {
        File ficheroAuxiliar = new File("ficheroAux.txt");

        BufferedReader brAltes = new BufferedReader(new FileReader(altes));
        BufferedReader brMestre = new BufferedReader(new FileReader(mestre));

        String lineaAltes = brAltes.readLine();
        String lineaMestre = brAltes.readLine();
        int i = 0;
        String[] wordsInLineAltes;
        String[] wordsInLineMestre;

        while (lineaAltes != null && lineaMestre != null) {
            if (i % 2 == 0) {
                wordsInLineAltes = lineaAltes.split(":");
                System.out.println(Arrays.asList(wordsInLineAltes));
                lineaAltes = brAltes.readLine();
                i++;
            } else {
                wordsInLineMestre = lineaMestre.split(":");
                System.out.println(Arrays.asList(wordsInLineMestre));
                lineaMestre = brMestre.readLine();
                i++;
            }
//            Collections.sort(wordsInLineAltes,);
//            if (wordsInLineAltes[0].s)

        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroAuxiliar, true));

    }

    public static Comparator<String> stringComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    };
}
