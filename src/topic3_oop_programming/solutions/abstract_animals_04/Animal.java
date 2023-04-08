/*
 * Animal.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package topic3_oop_programming.solutions.abstract_animals_04;

/**
 * Classe que simula un animal.
 * 
 * @author Mònica Ramírez Arceda
 * @version 15/04/2010
 * 
 */
public abstract class Animal {
    private String nom;
    private int edat;

    public Animal(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String respira() {
        return "fff";
    }

    public String menja() {
        return "nyam nyam";
    }

    public String dorm() {
        return "zzzz";
    }

    public abstract String parla();

    // Getters i setters

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

}
