package edu.iespoblenou.barcos;

/**
 * Created by dcolomer on 21/04/17.
 */
public class Crucero extends Barco {
    @Override
    public void zarpar() {
        System.out.println("crucero zarpando...");
    }

    @Override
    public void atracar() {
        System.out.println("crucero atracando...");
    }
}
