package topic3_oop_programming.asociationoop02.exer04;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    private float precioMinuto;
    private List<Llamada> listaLlamadas;

    public Cliente() {
    }

    public Cliente(String nombre, String dni, float precioMinuto, List<Llamada> listaLlamadas) {
        this.nombre = nombre;
        this.dni = dni;
        this.precioMinuto = precioMinuto;
        this.listaLlamadas = listaLlamadas;
    }

    public Cliente(String nombre, String dni, float precioMinuto) {
        this.nombre = nombre;
        this.dni = dni;
        this.precioMinuto = precioMinuto;
        listaLlamadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Float getPrecioMinuto() {
        return precioMinuto;
    }

    public void setPrecioMinuto(Float precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    public List<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(List<Llamada> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Cliente))
            return false;

        Cliente c1 = (Cliente) obj;

        return getDni().equals(c1.getDni());
//        return (!Objects.equals(this.dni, c1.dni));
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", precioMinuto=" + precioMinuto +
                ", listaLlamadas=" + listaLlamadas +
                '}';
    }
}
