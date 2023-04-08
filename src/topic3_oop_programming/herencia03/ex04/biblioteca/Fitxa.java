package topic3_oop_programming.herencia03.ex04.biblioteca;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Fitxa))
            return false;

        Fitxa obj1 = (Fitxa) obj;

        return  (Objects.equals(this.referencia, obj1.referencia));
    }

    @Override
    public String toString() {
        return "Fitxa{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                '}';
    }
}
