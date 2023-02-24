package topic3_objectorientedprogramming.asociationoop02.exer05;

import java.util.List;

public class Persones {
    private String dni;
    private String nom;
    private List<Contractes> contractesList;

    public Persones() {
    }

    public Persones(String dni, String nom, List<Contractes> contractesList) {
        this.dni = dni;
        this.nom = nom;
        this.contractesList = contractesList;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Contractes> getContractesList() {
        return contractesList;
    }

    public void setContractesList(List<Contractes> contractesList) {
        this.contractesList = contractesList;
    }

    @Override
    public String toString() {
        return "Persones{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", contractesList=" + contractesList +
                '}';
    }
}
