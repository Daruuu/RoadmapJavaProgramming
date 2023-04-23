package topic5_files.practica_02_03;

import java.io.*;

public class Exer05 {
    public static void main(String[] args) {

    }

    public void contarPalabrasEnFile(String ruta, String strABuscar) throws IOException {
        File comprobarFichero = new File(ruta);
        if (comprobarFichero.isFile()){
            BufferedReader br = new BufferedReader(new FileReader(comprobarFichero));
            String line = br.readLine();
            int contadoe = 0;

            while (line != null){
//                contadoe += line "";
            }
        }
    }

}
