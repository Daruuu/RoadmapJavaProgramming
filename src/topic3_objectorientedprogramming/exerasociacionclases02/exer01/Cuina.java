package topic3_objectorientedprogramming.exerasociacionclases02.exer01;

/*
- La classe Cuina ha de tenir com atributs
esIndependent (boolean) i
 nombreDeFogons(int) i
 un constructor que els inicialitza a false i 0.
 */
public class Cuina {
    private boolean esIndependiente;
    private int nombreDeFogons;

    public Cuina() {
        this.esIndependiente = false;
        this.nombreDeFogons = 0;
    }

    public boolean isEsIndependiente() {
        return esIndependiente;
    }

    public void setEsIndependiente(boolean esIndependiente) {
        this.esIndependiente = esIndependiente;
    }

    public int getNombreDeFogons() {
        return nombreDeFogons;
    }

    public void setNombreDeFogons(int nombreDeFogons) {
        this.nombreDeFogons = nombreDeFogons;
    }

    @Override
    public String toString() {
        return "Cuina{" +
                "esIndependiente=" + esIndependiente +
                ", nombreDeFogons=" + nombreDeFogons +
                '}';
    }
}
