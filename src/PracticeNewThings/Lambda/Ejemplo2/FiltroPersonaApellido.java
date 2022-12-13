package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Persona;

public class FiltroPersonaApellido implements FiltroPersona {

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
