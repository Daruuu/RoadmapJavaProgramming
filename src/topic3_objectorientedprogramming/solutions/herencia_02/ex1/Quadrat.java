public class Quadrat extends ObjecteGeometric {
    private int costat;

    public Quadrat(int coord_x, int coord_y, String color, int costat) {
        super(coord_x, coord_y, color);
        this.costat = costat;
    }

    public int perimetre () {
       int perimetreQuadrat = (4*costat);
       return perimetreQuadrat;
    }

    public int area() {
        int areaQuadrat = (costat * costat);
        return areaQuadrat;
    }
    public int getCostat() {
        return costat;
    }

    @Override
    public String toString() {
        return super.toString() + "ObjectreGeometric.Quadrat{" +
                "costat=" + costat +
                '}';
    }


}
