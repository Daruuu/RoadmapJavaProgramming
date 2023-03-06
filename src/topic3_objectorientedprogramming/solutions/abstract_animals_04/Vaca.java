/*
 * Vaca.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package topic3_objectorientedprogramming.solutions.abstract_animals_04;

/**
 * Classe que simula una vaca.
 * 
 * @author Mònica Ramírez Arceda
 * @version 15/04/2010
 * 
 */
public class Vaca extends Animal {

    public Vaca(String nom, int edat) {
        super(nom, edat);
    }

    @Override
    public String parla() {
        return "muuuu";
    }

    public String rumia() {
        return "requetenyam requetenyam";
    }

}
