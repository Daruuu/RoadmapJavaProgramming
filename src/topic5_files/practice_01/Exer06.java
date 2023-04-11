package topic5_files.practice_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exer06 {
    public static void main(String[] args) {

    }

    void clonarDirectorio() throws IOException {
        String path = "src/topic5_files/practice_01";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

    }

    public String leerFicheroTexto(String path){
        try{
            String str ="";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}