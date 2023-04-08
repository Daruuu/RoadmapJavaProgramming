package topic3_oop_programming.interficies05.ex03;

public class Piramide {
    private int base;
    private int altura;

    public Piramide(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
