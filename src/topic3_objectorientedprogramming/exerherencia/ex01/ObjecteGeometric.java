package topic3_objectorientedprogramming.exerherencia.ex01;

public class ObjecteGeometric {
    private int coord_x;
    private int coord_y;
    private String color;

    public ObjecteGeometric(int coord_x, int coord_y, String color) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.color = color;
    }

    public ObjecteGeometric() {
    }

    public int getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(int coord_x) {
        this.coord_x = coord_x;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(int coord_y) {
        this.coord_y = coord_y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjecteGeometric{" +
                "coord_x=" + coord_x +
                ", coord_y=" + coord_y +
                ", color='" + color + '\'' +
                '}';
    }

}
