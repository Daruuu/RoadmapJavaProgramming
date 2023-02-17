package topic3_objectorientedprogramming.interficies04.ex02;

public class Revista {
    private String nombre;

    public Revista(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
