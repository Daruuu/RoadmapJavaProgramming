package edu.iespoblenou.aviones;

/**
 * Created by dcolomer on 21/04/17.
 */
public class Avioneta extends Avion {
    @Override
    public void despegar() {
        System.out.println("avioneta despengando...");
    }

    @Override
    public void aterrizar() {
        System.out.println("avioneta aterrizando...");
    }
}
