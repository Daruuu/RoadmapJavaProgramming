package edu.iespoblenou.barcos;

/**
 * Created by dcolomer on 21/04/17.
 */
public class Veleta extends Barco {
    @Override
    public void zarpar() {
        System.out.println("veleta zarpando...");
    }

    @Override
    public void atracar() {
        System.out.println("veleta atracando...");
    }
}
