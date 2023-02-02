package topic3_objectorientedprogramming.exerasociacionclases02.exer02;

public class Alumne {
    private String nom;
    private String cognom;
    private int edat;
    private String dni;

    public Alumne(String nom, String cognom, int edat, String dni) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", dni='" + dni + '\'' +
                '}';
    }
}
