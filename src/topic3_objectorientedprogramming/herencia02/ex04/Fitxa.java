package topic3_objectorientedprogramming.herencia02.ex04;

public class Fitxa {
    private String referencia;
    private String titol;

    public Fitxa(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    @Override
    public String toString() {
        return "Fitxa{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                '}';
    }
}
