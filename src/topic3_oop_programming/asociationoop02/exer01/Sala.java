package topic3_oop_programming.asociationoop02.exer01;

/*
- La clases Sala tiene como atributos
numeroDeTelevisions(int) y tipoSala(String)
y dispone de un constructor que lo inicializa a 0 y "desconocido".
 */
public class Sala {
    private int numeroDeTelevisions;
    private String tipoSala;

    public Sala() {
        this.numeroDeTelevisions = 0;
        this.tipoSala = "desconocido";
    }

    public Sala(int numeroDeTelevisions, String tipoSala) {
        this.numeroDeTelevisions = numeroDeTelevisions;
        this.tipoSala = tipoSala;
    }

    public int getNumeroDeTelevisions() {
        return numeroDeTelevisions;
    }

    public void setNumeroDeTelevisions(int numeroDeTelevisions) {
        this.numeroDeTelevisions = numeroDeTelevisions;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numeroDeTelevisions=" + numeroDeTelevisions +
                ", tipoSala='" + tipoSala + '\'' +
                '}';
    }
}
