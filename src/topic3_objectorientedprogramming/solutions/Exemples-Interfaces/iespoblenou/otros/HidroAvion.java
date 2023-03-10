package edu.iespoblenou.otros;

import edu.iespoblenou.aviones.Volable;
import edu.iespoblenou.barcos.Navegable;

/**
 * Created by dcolomer on 21/04/17.
 */
public class HidroAvion implements Volable, Navegable {
    @Override
    public void despegar() {
        System.out.println("hidroavion despegando...");
    }

    @Override
    public void aterrizar() {
        System.out.println("hidroavion atracando...");
    }

    @Override
    public void zarpar() {
        System.out.println("hidroavion zarpando...");
    }

    @Override
    public void atracar() {
        System.out.println("hidroavion atracando...");
    }
}
