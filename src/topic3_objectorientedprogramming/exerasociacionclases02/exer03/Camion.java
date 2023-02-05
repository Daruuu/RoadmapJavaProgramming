package topic3_objectorientedprogramming.exerasociacionclases02.exer03;

public class Camion {
    private String matricula;
    private double pesoTonelada;

    public Camion(String matricula, double pesoTonelada) {
        this.matricula = matricula;
        this.pesoTonelada = pesoTonelada;
    }

    public Camion() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPesoTonelada() {
        return pesoTonelada;
    }

    public void setPesoTonelada(double pesoTonelada) {
        this.pesoTonelada = pesoTonelada;
    }


    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", pesoTonelada=" + pesoTonelada +
                '}';
    }
}
