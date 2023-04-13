package topic5_files.practice_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exer03 {
    public static void main(String[] args) throws FileNotFoundException {
        Exer03 exer03 = new Exer03();
        String rutaDirectorio = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practice_01/test3/";
//        exer03.buscadorArchivos(rutaDirectorio);
        exer03.buscar(rutaDirectorio);
    }

    public void buscadorArchivos(String rutaDirectorio) {
        try {
            FileReader fr = new FileReader(rutaDirectorio);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {
                if (linea.contains("exercisi")) {
                    System.out.println("un fichero coincide con el nombre");
                    break;
                }
                linea = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscar(String ruta) {

        try {
            File file = new File(ruta);
            File[] filesLista = file.listFiles();

            for (File f : filesLista) {
                if (f.getName().contains("exercisi")) {
                    System.out.println("archivo con nombre -> " + f.getName());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}