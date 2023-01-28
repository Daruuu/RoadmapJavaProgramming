package topic3_objectorientedprogramming.exercicisdeclases01.exer04;

public class Alumne {
    private String nom;

    public void saluda(){
        System.out.println("Hello " + this.nom);
    }

    public Alumne() {
    }

    public Alumne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
