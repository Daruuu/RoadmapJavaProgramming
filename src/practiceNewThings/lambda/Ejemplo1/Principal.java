package practiceNewThings.lambda.Ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona("pedro","gomez",19));
        listaPersona.add(new Persona("ana","sanchez", 39));
        listaPersona.add(new Persona("gema","blanco", 30));

        List<Persona> nuevaB = buscarPersonaPorNombre("pedro",listaPersona);

        for (Persona p : listaPersona){
            System.out.printf("persona: %s %s %s %n",p.getNombre(), p.getApellidos(), p.getEdad());
        }
        //metodo para ordenar
//        Collections.sort(listaPersona);

    }

    public static List<Persona> buscarPersonaPorNombre(String nombre, List<Persona> miLista){
        List<Persona> listaFiltro = new ArrayList<Persona>();
        for (Persona p : listaFiltro){
            if (p.getNombre().contentEquals(nombre)){
                listaFiltro.add(p);
            }
        }
        return listaFiltro;
    }
}
