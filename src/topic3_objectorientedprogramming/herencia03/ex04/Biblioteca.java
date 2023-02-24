package topic3_objectorientedprogramming.herencia03.ex04;

import topic3_objectorientedprogramming.herencia03.ex04.biblioteca.Fitxa;

import java.util.HashSet;

public class Biblioteca {
    private int dimesion;
    HashSet<Fitxa> fitxaHashSet;

    public static void main(String[] args) {

        HashSet<Fitxa> newFicha = new HashSet<>();
        Biblioteca biblioteca = new Biblioteca( 20,newFicha);
    }

    public Biblioteca() {
    }

    public Biblioteca(int dimesion, HashSet<Fitxa> fitxaHashSet) {
        this.dimesion = dimesion;
        this.fitxaHashSet = fitxaHashSet;
    }

    public int getDimesion() {
        return dimesion;
    }

    public void setDimesion(int dimesion) {
        this.dimesion = dimesion;
    }

    public HashSet<Fitxa> getFitxaHashSet() {
        return fitxaHashSet;
    }

    public void setFitxaHashSet(HashSet<Fitxa> fitxaHashSet) {
        this.fitxaHashSet = fitxaHashSet;
    }

    public int capacidadBiblioteca() {
        return fitxaHashSet.size();
    }

    public void addFichaBiblioteca(Fitxa f) {
        fitxaHashSet.add(f);
        System.out.println("Ficha agregada correctamente");
    }

    public boolean getFichaHashSet(int n) {
        return fitxaHashSet.contains(n);
    }

    //method reference in ::
    public void iterateFichaHashSet() {
        fitxaHashSet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "dimesion=" + dimesion +
                ", fitxaHashSet=" + fitxaHashSet +
                '}';
    }
}
