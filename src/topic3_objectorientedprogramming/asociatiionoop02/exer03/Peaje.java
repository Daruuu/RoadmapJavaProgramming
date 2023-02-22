package topic3_objectorientedprogramming.asociatiionoop02.exer03;

public class Peaje {
    private double precio;

    public Peaje(double precio) {
        this.precio = precio;
    }

    public Peaje() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Peaje{" +
                "precio=" + precio +
                '}';
    }
}
