package topic3_objectorientedprogramming.asociatiionoop02.exer04;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    private Float precioMinuto;
    private List<Llamada> listaLlamadas;

    public Cliente() {
    }

    public Cliente(String nombre, String dni, Float precioMinuto, List<Llamada> listaLlamadas) {
        this.nombre = nombre;
        this.dni = dni;
        this.precioMinuto = precioMinuto;
        this.listaLlamadas = listaLlamadas;
    }

    public Cliente(String nombre, String dni, Float precioMinuto) {
        this.nombre = nombre;
        this.dni = dni;
        this.precioMinuto = precioMinuto;
        listaLlamadas = new ArrayList<>();
    }

    public void contestarLlamada(Double minutos) {
//        listaLlamadas.add();
    }
}
