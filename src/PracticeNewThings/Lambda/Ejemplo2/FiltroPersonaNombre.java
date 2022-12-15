package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Ejemplo1.Persona;

import java.util.function.Predicate;

public class FiltroPersonaNombre implements Predicate<Persona> {

    private String nombre;

    public FiltroPersonaNombre(String nombre) {
        super();
        this.nombre = nombre;
    }

    //funcuion de test que recibe una persona y retorna verdadero o falso
    @Override
    public boolean test(Persona persona) {
        if (persona.getNombre().equals(nombre)){
            return true;
        }else {
            return false;
        }
    }
}
