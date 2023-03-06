/*
 * Pedra.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package topic3_objectorientedprogramming.solutions.abstract_animals_04;

/**
 * Classe que simula una pedra.
 * 
 * @author Mònica Ramírez Arceda
 * @version 15/04/2010
 * 
 */
public class Pedra {
    private int edat;

    /**
     * Constructor de la classe Pedra
     * 
     * @param edat
     */
    public Pedra(int edat) {
        this.edat = edat;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

}
