package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Persona;

import java.util.ArrayList;
import java.util.List;

public class PrincipalE3 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona("pedro", "gomez", 19));
        listaPersona.add(new Persona("ana", "sanchez", 39));
        listaPersona.add(new Persona("gema", "blanco", 30));
        listaPersona.add(new Persona("antonio", "perez", 70));

        //un metodo de referencia que es como una expresion lamba pero en una clase
//        List<Persona> nueva = buscarPersonaConFiltro((PersonaE2::estaJubilado), listaPersona);

//        for (Persona p : nueva) {
//            System.out.printf("persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
//        }
        //metodo para ordenar
//        Collections.sort(listaPersona);
    }

    public static List<Persona> buscarPersonaConFiltro(FiltroPersona filtro, List<Persona> miLista) {
        List<Persona> listaFiltro = new ArrayList<Persona>();
        for (Persona p : miLista) {
            if (filtro.test(p)) {
                listaFiltro.add(p);
            }
        }
        return listaFiltro;
    }


}
