package edu.iespoblenou;

import edu.iespoblenou.aviones.Avion;
import edu.iespoblenou.aviones.Avioneta;
import edu.iespoblenou.aviones.Boeing;
import edu.iespoblenou.aviones.Volable;
import edu.iespoblenou.barcos.Crucero;
import edu.iespoblenou.barcos.Navegable;
import edu.iespoblenou.barcos.Veleta;
import edu.iespoblenou.otros.HidroAvion;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Volable> aviones = new ArrayList<>();

        aviones.add(new Avioneta());
        aviones.add(new Boeing());
        aviones.add(new HidroAvion());

        aviones.forEach(e -> e.despegar());
        
        // ********************************************
        
        ArrayList<Navegable> barcos = new ArrayList<>();
        barcos.add(new Crucero());
        barcos.add(new Veleta());        
        barcos.add(new HidroAvion());

        for (Navegable barco : barcos) {
            barco.zarpar();
        }

    }
}
