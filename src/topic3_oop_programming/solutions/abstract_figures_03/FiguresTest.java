/*
 * FiguresTest.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package figures;

/**
 * Tests rectangles and circumferences.
 */
public class FiguresTest {

    /**
     * Main program.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        Circumference c = new Circumference("blau", 4);
        Rectangle r = new Rectangle("verd", 5, 6);
        System.out.println("Circumferència");
        System.out.println("--------------");
        System.out.println("Color: " + c.getColour());
        System.out.println("Radi: " + c.getRadius());
        System.out.println("Àrea: " + c.area());
        System.out.println("Perímetre: " + c.perimeter());
        System.out.println("");
        System.out.println("Rectangle");
        System.out.println("---------");
        System.out.println("Color: " + r.getColour());
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getHeight());
        System.out.println("Àrea: " + r.area());
        System.out.println("Perímetre: " + r.perimeter());
    }
}
