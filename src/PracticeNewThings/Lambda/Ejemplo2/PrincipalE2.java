package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Persona;

import java.util.ArrayList;
import java.util.List;

public class PrincipalE2 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona("pedro", "gomez", 19));
        listaPersona.add(new Persona("ana", "sanchez", 39));
        listaPersona.add(new Persona("gema", "blanco", 30));

//        List<Persona> nuevaB = buscarPersonaConFiltro(new FiltroPersonaNombre("pedro"),listaPersona);
//        List<Persona> nuevoA = buscarPersonaConFiltro(new FiltroPersonaApellido("blanco"), listaPersona);

        List<Persona> nueva = buscarPersonaConFiltro((Persona p)-> p.getApellidos().equals("blanco"), listaPersona);
        for (Persona p : listaPersona) {
            System.out.printf("persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
        }
        //metodo para ordenar
//        Collections.sort(listaPersona);

    }

    public static List<Persona> buscarPersonaConFiltro(FiltroPersona filtro, List<Persona> miLista) {
        List<Persona> listaFiltro = new ArrayList<Persona>();
        for (Persona p : listaFiltro) {
            if (filtro.test(p)) {
                listaFiltro.add(p);
            }
        }
        return listaFiltro;
    }

}
