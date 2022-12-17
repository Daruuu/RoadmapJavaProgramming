package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Ejemplo1.Persona;

import java.util.function.Predicate;

public interface FiltroPersona extends Predicate<Persona> {

    // es la posibilidad de psar multiples parametros del mismo tipo
    public static Predicate<Persona> orMultiple(Predicate<Persona>... predicates) {
        Predicate<Persona> combinarPredicador = predicates[0];
        for (Predicate<Persona> predicado : predicates) {
            combinarPredicador = combinarPredicador.or(predicado);
        }
        return combinarPredicador;

    }
}
