/*
 * Bagain.java        1.0 02/05/2012
 *
 * Copyright 2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package sweets;

public class Bargain extends Sweet {

    /** Discount for the bargain sweet */
    public double discount;

    public Bargain(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    /**
     * Calculates the final price of the bargain sweet.
     * 
     * @return the price
     */
    public double finalPrice() {
        return super.finalPrice() - this.price * this.discount / 100;
    }

}
