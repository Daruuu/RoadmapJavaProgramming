package practiceNewThings.lambda.Ejemplo3;

import practiceNewThings.lambda.Ejemplo1.Persona;
import practiceNewThings.lambda.Ejemplo2.FiltroPersonaNombre;

import java.util.ArrayList;
import java.util.Collections;

public class Principal3Nuevo {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona("pedro", "gomez", 19));
        listaPersona.add(new Persona("ana", "sanchez", 39));
        listaPersona.add(new Persona("gema", "blanco", 30));

        //un method de referencia que es como una expresion lambda pero en una clase
        FiltroPersona3 filtroP3 = (FiltroPersona3) new FiltroPersonaNombre("pedro");
        FiltroPersona3 filtroPerezORPedro = filtroP3.or(Persona::estaJubilado);
        for (Persona p : listaPersona) {
            System.out.printf("persona: %s %s %s %n",p.getNombre(), p.getApellidos(),p.getEdad());
        }
        Collections.sort(listaPersona);

    }
}
