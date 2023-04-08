package topic3_oop_programming.interficies05.ex03;

public abstract class FiguraGeometrica {
    private int idFigura;

    public FiguraGeometrica(int idFigura) {
        this.idFigura = idFigura;
    }

    public int getIdFigura() {
        return idFigura;
    }

    public void setIdFigura(int idFigura) {
        this.idFigura = idFigura;
    }
}