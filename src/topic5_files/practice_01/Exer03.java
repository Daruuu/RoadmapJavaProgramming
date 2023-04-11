package topic5_files.practice_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) throws FileNotFoundException {
        Exer03 exer03 = new Exer03();
        Scanner sc = new Scanner(System.in);
        exer03.buscadorArchivos(sc);
    }

    public void buscadorArchivos(Scanner sc) {

        try {
            String rutaDirectorio = sc.nextLine();
            FileReader fr = new FileReader(rutaDirectorio);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {
                if (linea.contains("exercici")) {
                    break;
                }
                linea = sc.nextLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}