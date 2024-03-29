package topic3_oop_programming.oop01.exer09;

public class Position {
    private int x;
    private int y;

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.y = y;
        this.x = x;
    }
    public Position getXY() {
        return new Position(x,y);
    }


    public int incX() {
        return this.x = x++;
    }

    public int decX() {
        return this.x = x--;
    }

    public int incY() {
        return this.y = y++;
    }

    public int decY() {
        return this.y = y--;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
