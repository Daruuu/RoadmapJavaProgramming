package topic5_files.practica02_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exer03 {
    public static void main(String[] args) {
        Exer03 exer03 = new Exer03();
        String ruta = "src/topic5_files/practica02_03/";
        String fichero = "test-exer03.txt";
        String stringABuscar = "was";
        exer03.buscarFichero(ruta, fichero, stringABuscar);
    }

    public void buscarFichero(String ruta, String nombreFichero, String strABuscar) {

        File directorio = new File(ruta);
        File[] listaDir = directorio.listFiles();
        boolean encontrado = false;

        try {
            if (!directorio.isDirectory()) {
                System.out.println("ruta invalida");
            } else {
                for (File f : listaDir) {
                    if (f.getName().equals(nombreFichero)) {
                        buscarString(f.getAbsolutePath(), strABuscar);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado)
                    System.out.println("palabra no encontrada!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarString(String nombreArchivo, String strABuscar) throws IOException {
        FileReader fileReader = new FileReader(nombreArchivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";

        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains(strABuscar)) {
                System.out.println(" palabra encontrado " + strABuscar);
            } else {
                System.out.println(" palabra NO encontrado " + strABuscar);
            }
        }
        fileReader.close();
        bufferedReader.close();
    }
}