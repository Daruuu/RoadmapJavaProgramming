package edu.iespoblenou;

public class Estudiante implements Comparable<Estudiante> {

    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override public String toString() {
        return nombre + " - " + edad;
    }

    @Override
    public int compareTo(Estudiante o) {

        /*
        * Hay que devolver...
        *    un valor positivo si this.edad > o.edad
        *    0 si this.edad == o.edad
        *    un valor negativo si this.edad < o.edad
        * */

        return this.edad - o.edad;
    }
}
