package edu.iespoblenou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	static final EstudianteComparadorPorNombre COMPARADOR_POR_NOMBRE =
			new EstudianteComparadorPorNombre();

    public static void main(String[] args) {

	    Estudiante[] estudiantes = {
	    	    new Estudiante("Kevin", 20),
				new Estudiante("Mary",23),
				new Estudiante("Andrew",25)
	    };

	    Arrays.sort(estudiantes);

		System.out.println(Arrays.toString(estudiantes));

		ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(new Estudiante("Kevin", 20));
		listaEstudiantes.add(new Estudiante("Mary",23));
		listaEstudiantes.add(new Estudiante("Andrew",25));

		Collections.sort(listaEstudiantes, COMPARADOR_POR_NOMBRE);
		listaEstudiantes.forEach(e -> System.out.println(e));
    }
}
