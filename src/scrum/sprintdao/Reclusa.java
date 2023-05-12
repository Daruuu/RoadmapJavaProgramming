package scrum.sprintdao;

public class Reclusa extends Persona {

    private int grado;
    private int diaVisita;

    public Reclusa() {
    }

    public Reclusa(int grado, int diaVisita) {
        this.grado = grado;
        this.diaVisita = diaVisita;
    }

    public Reclusa(String nombre, String apellido, int edad, int grado, int diaVisita) {
        super(nombre, apellido, edad);
        this.grado = grado;
        this.diaVisita = diaVisita;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getDiaVisita() {
        return diaVisita;
    }

    public void setDiaVisita(int diaVisita) {
        this.diaVisita = diaVisita;
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nGrado: " + grado +
                "\nDia de visita: " + diaVisita + "\n";
    }
}