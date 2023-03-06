/*
 * Rectangle.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package figures;

/**
 * Modelizes a rectangle. A rectangle is a figure.
 */
public class Rectangle extends Figure {
    private double base;
    private double height;

    // Constructor.

    public Rectangle(String colour, double base, double height) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    // Getters & setters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimeter() {
        return 2 * (base + height);
    }

}
