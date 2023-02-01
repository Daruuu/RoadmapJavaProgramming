package topic3_objectorientedprogramming.exerclases01.exer05;

/*
5. Crea i testeja una classe que modelitzi un triangle amb els següents atributs i mètodes:
Atributs:
side1: nombre real amb la longitud del primer costat del triangle.
side2: nombre real amb la longitud del segon costat del triangle.
side3: nombre real amb la longitud del tercer costat del triangle.

Mètodes:
Constructor per defecte amb els costats amb valors 3, 4 i 5.
Constructor que rep per paràmetre tots els valors corresponents als atributs del triangle.
Mètode perimetre() que ens calcularà el perímetre del triangle.
Mètode area() que ens calcularà la superfície del triangle.

Podeu usar la fórmula d'Heró (http://ca.wikipedia.org/wiki/F%C3%B3rmula_d%27Her%C3%B3).
 */
public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    public int perimetre() {
        return side1 + side2 + side3;
    }

    public int areaThis() {
        return (this.side1 + this.side2 + this.side3) / 2;
    }

    public double area() {
        double semiPerimetro = (side1 + side2 + side3) / 2;
        double area = semiPerimetro * (semiPerimetro - side1) * (semiPerimetro - side2) * (semiPerimetro - side3) / 2;
        return Math.sqrt(area);
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
