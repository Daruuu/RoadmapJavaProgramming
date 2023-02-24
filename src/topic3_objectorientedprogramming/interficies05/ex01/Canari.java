package topic3_objectorientedprogramming.interficies05.ex01;

public class Canari implements Cantant{
    private String color;
    private String pais;

    public Canari() {
    }

    public Canari(String color, String pais) {
        this.color = color;
        this.pais = pais;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Canari{" +
                "color='" + color + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    @Override
    public void canta() {
        System.out.println("canari canta");
    }
}
