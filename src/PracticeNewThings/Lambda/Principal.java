package PracticeNewThings.Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona("pedro","gomez",19));
        listaPersona.add(new Persona("ana","sanchez", 39));
        listaPersona.add(new Persona("gema","blanco", 30));
        for (Persona p : listaPersona){
            //System.out.println(p.getNombre());
            System.out.printf("persona: %s %s %s %n",p.getNombre(), p.getApellidos(), p.getEdad());
        }
        //metodo para ordenar
        Collections.sort(listaPersona);
    }
}
