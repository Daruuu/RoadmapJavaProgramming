public class ObjecteGeometric {

    private int coord_x;
    private int coord_y;
    private String color;

    public ObjecteGeometric (int coord_x,int coord_y, String color) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjectreGeometric.ObjecteGeometric{" +
                "coord_x=" + coord_x +
                ", coord_y=" + coord_y +
                ", color='" + color + '\'' +
                '}';
    }

    public int getCoord_x() {
        return coord_x;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public String getColor() {
        return color;
    }
}
