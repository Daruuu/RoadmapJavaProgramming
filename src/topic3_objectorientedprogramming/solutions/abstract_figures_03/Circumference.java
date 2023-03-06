/*
 * Circumference.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package figures;

/**
 * Modelizes a circumference. A circumference is a figure.
 */
public class Circumference extends Figure {

    private double radius;

    // Constructor

    public Circumference(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    // Getters & setters

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
