package topic3_objectorientedprogramming.exercicisdeclases01.exer12;

/*
12. Cilindre:
D'un cilindre ens interessa conèixer el radi de la base i l'altura i
determinar l'àrea total,
 el volum i esbrinar quin de dos cilindres és el més gran emprant el model del cercle de l'exercici anterior.
 */
public class Cilindre {
    private double radi;
    private int altura;

    public Cilindre(double radi, int altura) {
        this.radi = radi;
        this.altura = altura;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindre{" +
                "radi=" + radi +
                ", altura=" + altura +
                '}';
    }

    public double areaTotalCilindre() {
        return 2 * (Math.PI * radi * radi) + 2 * (Math.PI * radi * altura);
    }

    public double VolumenCilindre() {
        return Math.PI * radi * radi * altura;
    }

}
