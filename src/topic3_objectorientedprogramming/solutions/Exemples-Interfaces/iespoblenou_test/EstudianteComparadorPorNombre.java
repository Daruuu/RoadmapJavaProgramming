package edu.iespoblenou;

import java.util.Comparator;

public class EstudianteComparadorPorNombre
        implements Comparator<Estudiante>
{
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return o1.nombre.compareToIgnoreCase(o2.nombre);
    }
}
