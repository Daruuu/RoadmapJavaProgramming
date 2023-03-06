package ex3;

public class Cercle extends Figures2D implements Constants, Calculs2D {

    public double radi;

    public Cercle(int idFigura, double radi) {
        super(idFigura);
        this.radi = radi;
    }


    @Override
    public double area() {
        return NOMBREPI * Math.pow(radi,2);
    }

    @Override
    public double perimetre() {
        return 2 * NOMBREPI * radi;
    }
}
