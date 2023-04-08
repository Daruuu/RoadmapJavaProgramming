/*
 * Sweet.java        1.0 02/05/2012
 *
 * Copyright 2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package sweets;

public class Sweet {
    /** The name of the sweet */
    private String name;
    /** The price of the sweet */
    protected double price;
    /** VAT */
    protected static final double VAT = 18;

    public Sweet(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    /**
     * Calculates the final price of the sweet.
     * 
     * @return the price
     */
    public double finalPrice() {
        return this.price + this.price * Sweet.VAT / 100;
    }

}
