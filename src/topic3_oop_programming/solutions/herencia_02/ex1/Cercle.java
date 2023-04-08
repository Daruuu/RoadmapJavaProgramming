public class Cercle extends ObjecteGeometric {
        private int radi;

    public Cercle(int coord_x, int coord_y, String color, int radi) {
        super(coord_x, coord_y, color);
        this.radi = radi;
    }

    @Override
    public String toString() {
        return super.toString() + "ObjectreGeometric.Cercle{" +
                "radi=" + radi +
                '}';
    }

    public int perimetre() {
        int perimetreCercle = (int) (2*Math.PI*radi);

        return perimetreCercle;
    }
    public int area() {
        int areaCercle = (int) (Math.PI * radi * radi);
        return areaCercle;
    }

    public int getRadi() {
        return radi;
    }
}
