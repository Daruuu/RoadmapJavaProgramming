package topic4_collections.exersCollection_01.arraylist01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CalcularNotas {
    private List<Double> listaNotasDam;


    public static void main(String[] args) {
        CalcularNotas cn = new CalcularNotas();

        List<Double> notas = new ArrayList<>();

        cn.introducirValors(notas);

        int sumaValsForEach = (int) cn.sumaValorsForEach(notas);
        int sumaValsIterator = (int) cn.sumaValorsIterator(notas);
        System.out.printf("suma de los valores mediante forEach es: %d\nsuma de los valores mediante Iterator es: %d\n", sumaValsForEach, sumaValsIterator);

        int calcularMedia = (int) cn.calcularMedia(sumaValsForEach, notas.size());
        System.out.printf("la media de notas en clase es: %d\n", calcularMedia);
    }

    public void introducirValors(List<Double> notasDam) {
        Scanner sc = new Scanner(System.in);
        double nota = 0.0;
        System.out.printf("%s \n", "introduce una nota (-1 para temrinar: ");
        while (nota != -1) {
            nota = sc.nextDouble();

            if (nota != -1)
                notasDam.add(nota);
        }
    }

    public double sumaValorsForEach(List<Double> notasDam) {
        double sumaNotasForEach = 0.0;
        for (Double nota : notasDam) {
            sumaNotasForEach += nota;
        }
        return sumaNotasForEach;
    }

    public double sumaValorsIterator(List<Double> notasDam) {
        double sumaNotasIterator = 0.0;
        Iterator<Double> it = notasDam.iterator();
        while (it.hasNext()) {
            sumaNotasIterator += it.next();
        }
        return (int) sumaNotasIterator;
    }

    public double calcularMedia(double sumaValors, double cantidadNotas) {
        return (int) (sumaValors / cantidadNotas);
    }
}
