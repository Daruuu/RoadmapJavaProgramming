package topic3_oop_programming.herencia03.ex01;

public class Quadrat extends ObjecteGeometric {
    private int costat;

    public Quadrat(int coord_x, int coord_y, String color, int costat) {
        super(coord_x, coord_y, color);
        this.costat = costat;
    }

    public Quadrat(int costat) {
        this.costat = costat;
    }

    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    public int perimetre() {
        return 4 * costat;
    }

    public int area() {
        return costat * costat;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "costat=" + costat +
                '}';
    }
}
