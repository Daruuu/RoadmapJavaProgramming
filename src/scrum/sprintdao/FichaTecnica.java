package scrum.sprintdao;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FichaTecnica {

    private HashMap<String, Reclusa> resultadoArchivo;

    public FichaTecnica() {
        this.resultadoArchivo = new HashMap<>();
    }

    public HashMap<String, Reclusa> getResultadoArchivo() {
        return resultadoArchivo;
    }

    public void setResultadoArchivo(HashMap<String, Reclusa> resultadoArchivo) {
        this.resultadoArchivo = resultadoArchivo;
    }

    public void importarDatosCSV() throws IOException {
        String path = "ScrumPOO/reclusas.csv";

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line;

        try {
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                if (strings.length != 6) {
                    throw new RuntimeException("formato incorrecto del archivo csv");
                }
                String dni = strings[0].replaceAll("\"", "");
                String nombre = strings[1];
                String apellido = strings[2];
                int edad = Integer.parseInt(strings[3]);
                int grado = Integer.parseInt(strings[4]);
                int diaVisita = Integer.parseInt(strings[5]);

                Reclusa reclusa = new Reclusa(nombre, apellido, edad, grado, diaVisita);
                resultadoArchivo.put(dni, reclusa);
            }
            System.out.println("Datos cargados correctamente!");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "FichaTecnica{" +
                "resultadoArchivo=" + resultadoArchivo +
                '}' + "\n";
    }

    public void agregarNuevasReclusasCSV(int cantidad, HashMap<String, Reclusa> reclusasHashMap) throws IOException {

        Scanner read = new Scanner(System.in);
        String path = "ScrumPOO/reclusas.csv";
        PrintWriter printWriter = new PrintWriter(path);

        int i = 0;
        while (i < cantidad) {
            System.out.print("Introduce el DNI: ");
            String dni = read.nextLine();
            if (dni == null) {
                dni = read.nextLine();
            }

            System.out.print("Introduce el nombre de la reclusa: ");
            String nombre = read.nextLine();
            System.out.print("Introduce el apellido de la reclusa: ");
            String apellido = read.nextLine();

            System.out.print("Introduce la edad de la reclusa: ");
            int edad = read.nextInt();
            if (edad < 0 || edad > 100) {
                throw new InputMismatchException("La edad no es valida/ fuera de rango!");
            }

            System.out.print("Introduce el grado de la reclusa: ");
            int grado = read.nextInt();
            if (grado < 1 || grado > 5) {
                throw new InputMismatchException("El grado esta fuera de rango!!");
            }
            grado = read.nextInt();

            System.out.print("Introduce el dia de visita de la reclusa: ");
            int diaVisita = read.nextInt();
            if (diaVisita < 1 || diaVisita > 5) {
                throw new InputMismatchException("Numero de dia invalido");
            }

            Reclusa nuevaReclusa = new Reclusa(nombre, apellido, edad, grado, diaVisita);

            reclusasHashMap.put(dni, nuevaReclusa);
            read.nextLine();
            printWriter.print(dni + ",");
            printWriter.print(nombre + ",");
            printWriter.print(apellido + ",");
            printWriter.print(edad + ",");
            printWriter.print(grado + ",");
            printWriter.println(diaVisita);

            i++;
        }
        printWriter.close();
    }
}
