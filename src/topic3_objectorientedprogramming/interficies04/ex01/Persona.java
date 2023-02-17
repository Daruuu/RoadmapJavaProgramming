package topic3_objectorientedprogramming.interficies04.ex01;

import java.util.ArrayList;

public class Persona implements Cantant{
    private String nom;
    private int edat;

    public Persona() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    @Override
    public void canta() {
        System.out.println("canta persona" );
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Cantant> cantantsArraylist = new ArrayList<>();
        cantantsArraylist.add(new Persona());
        cantantsArraylist.add(new Canari());

    }
}
