package topic4_collections.exersCollection_01.arraylist01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CalcularNotas {
    private List<Double> listaNotasDam;

    public CalcularNotas() {
        this.listaNotasDam = new ArrayList<>();
    }

    public CalcularNotas(List<Double> listaNotasDam) {
        this.listaNotasDam = listaNotasDam;
    }

    public static void main(String[] args) {
        CalcularNotas cn = new CalcularNotas();
        cn.listaNotasDam = new ArrayList<>();

        cn.introducirValors();
        int sumaValsForEach = (int) cn.sumaValorsForEach();
        int sumaValsIterator = (int) cn.sumaValorsIterator();
        System.out.printf("suma de los valores mediante forEach es: %d\nsuma de los valores mediante Iterator es: %d\n", sumaValsForEach, sumaValsIterator);

        int sizeArraylist = cn.listaNotasDam.size();

        int calcularMedia = (int) cn.calcularMedia(sumaValsForEach, sizeArraylist);
        System.out.printf("la media de notas en clase es: %d\n", calcularMedia);
    }

    public List<Double> getListaNotasDam() {
        return listaNotasDam;
    }

    public void setListaNotasDam(List<Double> listaNotasDam) {
        this.listaNotasDam = listaNotasDam;
    }

    public void introducirValors() {
        Scanner sc = new Scanner(System.in);
        double nota = 0.0;
        System.out.printf("%s \n", "introduce una nota (-1 para temrinar: ");
        while (nota != -1) {
            nota = sc.nextDouble();

            if (nota != -1)
                listaNotasDam.add(nota);
        }
    }

    public double sumaValorsForEach() {
        double sumaNotasForEach = 0.0;
        for (Double nota : listaNotasDam) {
            sumaNotasForEach += nota;
        }
        return sumaNotasForEach;
    }

    public double sumaValorsIterator() {
        double sumaNotasIterator = 0.0;
        Iterator<Double> it = listaNotasDam.iterator();
        while (it.hasNext()) {
            sumaNotasIterator += it.next();
        }
        return (int) sumaNotasIterator;
    }

    public double calcularMedia(double sumaValors, double cantidadNotas) {
        return (int) (sumaValors / cantidadNotas);
    }
}
