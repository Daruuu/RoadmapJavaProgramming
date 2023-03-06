package ex3;

public class Cilindre extends Figures3D implements Constants,Calculs3D {

    public double radi;
    public double altura;

    public Cilindre(int idFigura, double radi, double altura) {
        super(idFigura);
        this.radi = radi;
        this.altura = altura;

    }

    @Override
    public double area() {
        Cercle cercle = new Cercle(1,this.radi);
        Rectangle rectangle = new Rectangle(1,cercle.perimetre(), altura);
        return cercle.area() * 2 + rectangle.area();
    }

    @Override
    public double perimetre() {
        Cercle cercle = new Cercle(1,this.radi);
        return cercle.perimetre() * 2;
    }

    @Override
    public double volum() {
        Cercle cercle = new Cercle(1,this.radi);
        return cercle.area() * altura;
    }
}
