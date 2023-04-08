package ex3;

public class Piramide extends Figures3D implements Calculs3D {

    public double costat;
    public double altura;
    public double apBase;
    public double apPoliedre;

    public Piramide(int idFigura, double costat, double altura, double apBase, double apPoliedre) {
        super(idFigura);
        this.costat = costat;
        this.altura = altura;
        this.apBase = apBase;
        this.apPoliedre = apPoliedre;
    }

    @Override
    public double area() {
        return Math.pow(costat,2) + (apPoliedre * costat / 2) * 4;

    }

    @Override
    public double perimetre() {
        return costat*4 + (Math.sqrt(Math.pow(apPoliedre,2) + Math.pow(costat/2,2)))*4;

    }

    @Override
    public double volum() {
        return Math.pow(costat,2)*altura/3;
    }
}
