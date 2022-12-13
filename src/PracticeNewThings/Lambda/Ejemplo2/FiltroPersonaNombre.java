package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Persona;

public class FiltroPersonaNombre implements FiltroPersona{

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
