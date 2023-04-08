/*
 * Gos.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package topic3_oop_programming.solutions.abstract_animals_04;

/**
 * 
 * Classe que simula un gos.
 * 
 * @author Mònica Ramírez Arceda
 * @version 14/04/2010
 * 
 */
public class Gos extends Animal {

    public Gos(String nom, int edat) {
        super(nom, edat);
    }

    @Override
    public String parla() {
        return "bup bup";
    }

}
