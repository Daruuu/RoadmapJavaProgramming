package topic3_objectorientedprogramming.exerasociacionclases02.exer03;

import java.util.List;

public class Ferry {
    private String matricula;
    private String nombre;
    private String puertoDestino;
    private double precioCamionTonelada;
    private double pesoMaxToneladaPorCamion;
    private List<Camion> listaCamiones;
    private  List<Peaje> listaPeaje;

    public Ferry() {
    }

    public Ferry(String matricula, String nombre, String puertoDestino, double precioCamionTonelada, double pesoMaxToneladaPorCamion, List<Camion> listaCamiones, List<Peaje> listaPeaje) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.puertoDestino = puertoDestino;
        this.precioCamionTonelada = precioCamionTonelada;
        this.pesoMaxToneladaPorCamion = pesoMaxToneladaPorCamion;
        this.listaCamiones = listaCamiones;
        this.listaPeaje= listaPeaje;
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

    public List<Peaje> getListaPeaje() {
        return listaPeaje;
    }

    public void setListaPeaje(List<Peaje> listaPeaje) {
        this.listaPeaje = listaPeaje;
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
