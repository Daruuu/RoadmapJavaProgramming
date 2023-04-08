package edu.iespoblenou.aviones;

/**
 * Created by dcolomer on 21/04/17.
 */
public class Boeing extends Avion {

    @Override
    public void despegar() {
        System.out.println("boeing despengando...");
    }

    @Override
    public void aterrizar() {
        System.out.println("boeing aterrizando...");
    }
}
