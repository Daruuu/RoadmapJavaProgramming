package topic3_objectorientedprogramming.exerasociacionclases02.exer03;

public class Ferry {
    private String matricula;
    private String nombre;
    private String puertoDestino;
    private double precioCamionTonelada;
    private double pesoMaxToneladaPorCamion;
    private Camion camion;

    public Ferry(String matricula, String nombre, String puertoDestino, double precioCamionTonelada, double pesoMaxToneladaPorCamion, Camion camion) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.puertoDestino = puertoDestino;
        this.precioCamionTonelada = precioCamionTonelada;
        this.pesoMaxToneladaPorCamion = pesoMaxToneladaPorCamion;
        this.camion = camion;
    }

    public Ferry() {
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

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }


    @Override
    public String toString() {
        return "Ferry{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puertoDestino='" + puertoDestino + '\'' +
                ", precioCamionTonelada=" + precioCamionTonelada +
                ", pesoMaxToneladaPorCamion=" + pesoMaxToneladaPorCamion +
                ", camion=" + camion +
                '}';
    }
}
