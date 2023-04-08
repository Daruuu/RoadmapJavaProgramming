package topic3_oop_programming.asociationoop02.exer01;

/*
- La classe Cocina ha de tenir com atributs
esIndependent (boolean) i
 nombreDeFogons(int) i
 un constructor que els inicialitza a false i 0.
 */
public class Cocina {
    private boolean esIndependiente;
    private int nombreDeFogons;

    public Cocina() {
        this.esIndependiente = false;
        this.nombreDeFogons = 0;
    }

    public Cocina(boolean esIndependiente, int nombreDeFogons) {
        this.esIndependiente = esIndependiente;
        this.nombreDeFogons = nombreDeFogons;
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
        return "Cocina{" +
                "esIndependiente=" + esIndependiente +
                ", nombreDeFogons=" + nombreDeFogons +
                '}';
    }
}
