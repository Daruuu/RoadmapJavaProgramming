package ex3;

public class Rectangle extends Figures2D implements Calculs2D {

    public double base;
    public double altura;

    public Rectangle(int idFigura, double base, double altura) {
        super(idFigura);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetre() {
        return 2 * (base + altura);
    }
}
