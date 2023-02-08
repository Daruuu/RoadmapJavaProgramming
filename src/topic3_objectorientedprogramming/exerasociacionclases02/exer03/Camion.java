package topic3_objectorientedprogramming.exerasociacionclases02.exer03;

import java.util.List;

public class Camion {
    private String matricula;
    private double pesoTonelada;

    public Camion(String matricula, double pesoTonelada, List<Camion> listaCamiones) {
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

    // 1. Determinar el peso total de los camiones embarcados.
    //Debe devolver la suma de los pesos de camiones que tiene el ferry embarcado.
    public double pesoTotalCamionesEnFerry() {
        double sumaPesoCamiones = 0;
        for (int i = 0; i < .size(); i++) {
            if (listaCamiones.get(i).getPesoTonelada() > 0) {
                sumaPesoCamiones += listaCamiones.get(i).getPesoTonelada();
            }
        }


        return 0;
    }

    // 2. Determinar si un camión está embarcado.A partir de la matrícula del camión debe descubrirse si el camión está embarcado.
    public boolean camionEnFerry(Camion c) {
        return false;

    }

    public void embarcarCamion(Camion c) {
        
    }

    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", pesoTonelada=" + pesoTonelada +
                '}';
    }
}
