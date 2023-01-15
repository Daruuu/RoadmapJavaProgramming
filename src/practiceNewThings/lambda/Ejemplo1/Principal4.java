package practiceNewThings.lambda.Ejemplo1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal4 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona("pedro", "gomez", 19));
        listaPersona.add(new Persona("ana", "sanchez", 39));
        listaPersona.add(new Persona("gema", "blanco", 30));

//        listaPersona.sort(new ComparadorNombre());
        listaPersona.sort((Persona p1, Persona p2) -> {
            if (p1.getEdad() == p2.getEdad()) {
                return 0;
            } else if (p1.getEdad() > p2.getEdad()) {
                return 1;
            } else {
                return -1;
            }
        });
        for (Persona p : listaPersona) {
            System.out.printf("persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
        }
        Collections.sort(listaPersona);

    }
}
