package PracticeNewThings.Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Principal5 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona("pedro", "gomez", 19));
        listaPersona.add(new Persona("ana", "sanchez", 39));
        listaPersona.add(new Persona("gema", "blanco", 30));

//        listaPersona.sort(new ComparadorNombre());
        listaPersona.sort((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
        for (Persona p : listaPersona) {
            System.out.printf("persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
        }
//        Collections.sort(listaPersona);

    }
}
