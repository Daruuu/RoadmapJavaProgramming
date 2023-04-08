package topic3_oop_programming.interficies05.ex03;

public class Cilindre {
    private int base;
    private int altura;
    private int radio;

    public Cilindre(int base, int altura, int radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
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

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Cilindre{" +
                "base=" + base +
                ", altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
