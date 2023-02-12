package topic3_objectorientedprogramming.exerherencia.ex01;

public class Cercle extends ObjecteGeometric {
    private double radio;

    public Cercle(int coord_x, int coord_y, String color, double radio) {
        super(coord_x, coord_y, color);
        this.radio = radio;
    }

    public Cercle(double radio) {
        this.radio = radio;
    }

    public double perimetre() {
        return 2 * Math.PI * radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radio=" + radio +
                '}';
    }
}
