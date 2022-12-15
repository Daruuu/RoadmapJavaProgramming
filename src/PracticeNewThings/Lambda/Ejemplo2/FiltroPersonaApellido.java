package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Ejemplo1.Persona;

import java.util.function.Predicate;

public class FiltroPersonaApellido implements Predicate<Persona> {

    String apellidos;

    public FiltroPersonaApellido(String apellido) {
        this.apellidos = apellido;
    }

    @Override
    public boolean test(Persona persona) {
        if (persona.getApellidos().equals(apellidos)) {
            return true;
        } else {
            return false;
        }
    }
}
