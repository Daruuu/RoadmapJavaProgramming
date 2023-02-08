package topic3_objectorientedprogramming.exerasociacionclases02.exer03;

import java.util.List;

public class Ferry {
    private String matricula;
    private String nombre;
    private String puertoDestino;
    private double precioCamionTonelada;
    private double pesoMaxToneladaPorCamion;
    private List<Camion> listaCamiones;

    public Ferry() {
    }

    public Ferry(String matricula, String nombre, String puertoDestino, double precioCamionTonelada, double pesoMaxToneladaPorCamion, List<Camion> listaCamiones, List<Peaje> listaPeaje) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.puertoDestino = puertoDestino;
        this.precioCamionTonelada = precioCamionTonelada;
        this.pesoMaxToneladaPorCamion = pesoMaxToneladaPorCamion;
        this.listaCamiones = listaCamiones;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuertoDestino() {
        return puertoDestino;
    }

    public void setPuertoDestino(String puertoDestino) {
        this.puertoDestino = puertoDestino;
    }

    public double getPrecioCamionTonelada() {
        return precioCamionTonelada;
    }

    public void setPrecioCamionTonelada(double precioCamionTonelada) {
        this.precioCamionTonelada = precioCamionTonelada;
    }

    public double getPesoMaxToneladaPorCamion() {
        return pesoMaxToneladaPorCamion;
    }

    public void setPesoMaxToneladaPorCamion(double pesoMaxToneladaPorCamion) {
        this.pesoMaxToneladaPorCamion = pesoMaxToneladaPorCamion;
    }

    public List<Camion> getListaCamiones() {
        return listaCamiones;
    }

    public void setListaCamiones(List<Camion> listaCamiones) {
        this.listaCamiones = listaCamiones;
    }


    public void embarcarCamion(String matricula){

    }

    // 1. Determinar el peso total de los camiones embarcados.
    //Debe devolver la suma de los pesos de camiones que tiene el ferry embarcado.
    public double pesoTotalCamionesEnFerry() {
        double sumaPesoCamiones = 0;
        for (int i = 0; i < listaCamiones.size(); i++) {
            if (listaCamiones.get(i).getPesoTonelada() > 0) {
                sumaPesoCamiones += listaCamiones.get(i).getPesoTonelada();
            }
        }


        return 0;
    }
    @Override
    public String toString() {
        return "Ferry{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puertoDestino='" + puertoDestino + '\'' +
                ", precioCamionTonelada=" + precioCamionTonelada +
                ", pesoMaxToneladaPorCamion=" + pesoMaxToneladaPorCamion +
                ", listaCamiones=" + listaCamiones +
                '}';
    }
}
