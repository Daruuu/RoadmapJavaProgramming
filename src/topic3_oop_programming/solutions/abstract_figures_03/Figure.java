/*
 * Figure.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package figures;

/**
 * Modelizes a generic figure.
 */
public abstract class Figure {
    private String colour;

    // Constructor.

    public Figure(String colour) {
        this.colour = colour;
    }

    // Getters & setters

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Calculates the area.
     * 
     * @return the area
     */
    public abstract double area();

    /**
     * Calculates the perimeter.
     * 
     * @return the perimeter
     */
    public abstract double perimeter();

}
