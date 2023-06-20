package sprintdao.proyectofinal.modelo;

public class Reclusa extends Persona {
    private int reclusasId;
    private int grado;
    private int diaVisita;
    private int idVisita;
    private int condenaRestante;


    public Reclusa() {
    }

    public Reclusa(int grado, int diaVisita) {
        this.grado = grado;
        this.diaVisita = diaVisita;
    }

    public Reclusa(String id, String nombre, String apellido, int edad, int grado, int idVisita) {
        super(Integer.parseInt(id), nombre, apellido, edad);
        this.grado = grado;
        this.idVisita = idVisita;
    }


    public Reclusa(String id, String nombre, String apellido, int edad, int grado, int diaVisita, int condenaRestante) {
        super(Integer.parseInt(id), nombre, apellido, edad);
        this.grado = grado;
        this.diaVisita = diaVisita;
        this.condenaRestante = condenaRestante;
    }


    public Reclusa(int reclusasId, String nombre, String apellido, int edad, int grado, int idVisita, int condenaRestante) {
        super(reclusasId, nombre, apellido, edad);
        this.grado = grado;
        this.idVisita = idVisita;
        this.condenaRestante = condenaRestante;
    }


    public Reclusa(String nom, String cognom, int edat, int grau, int visitid, int condemnaRes) {
        super(nom, cognom, edat);
        this.grado = grau;
        this.idVisita = visitid;
        this.condenaRestante = condemnaRes;
    }

    public int getReclusasId() {
        return reclusasId;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getCondenaRestante() {
        return condenaRestante;
    }

    public void setCondenaRestante(int condenaRestante) {
        this.condenaRestante = condenaRestante;
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
        return super.toString() +
                "Grado = " + grado +
                "Id Visita = " + idVisita +
                "CondenaRestante = " + condenaRestante + "\n";
    }
}