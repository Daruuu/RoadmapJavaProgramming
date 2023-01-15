package practiceNewThings.lambda.Ejemplo3;

import practiceNewThings.lambda.Ejemplo1.Persona;

public interface FiltroPersona3 {
    public boolean test(Persona persona);
    // pues nos anade una clausula OR sobre el filtro que tengamos activo
    default public FiltroPersona3 or (FiltroPersona3 filtro){
        return (Persona p) -> {
            return test(p) || filtro.test(p);
        };
    }
}
