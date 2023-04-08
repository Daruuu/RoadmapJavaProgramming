/*
 * Chocolate.java        1.0 02/05/2012
 *
 * Copyright 2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package sweets;

public class Chocolate extends Sweet {

    /** Extra charge for chocolate sweets */
    private static double extraCharge = 2;

    public Chocolate(String name, double price) {
        super(name, price);
    }

    /**
     * Calculates the final price of the chocolate sweet.
     * 
     * @return the price
     */

    public double finalPrice() {
        return super.finalPrice() + Chocolate.extraCharge;
    }

}
