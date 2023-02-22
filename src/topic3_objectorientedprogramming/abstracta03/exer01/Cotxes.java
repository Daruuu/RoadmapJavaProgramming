package topic3_objectorientedprogramming.abstracta03.exer01;

public class Cotxes extends Transports {
    private String tipoCombustible;
    private double litroCombustible;
    private int litroConsumoPorKm;

    public Cotxes(int id, int velocidadActualKMH, String tipoCombustible, double litroCombustible, int litroConsumoPorKm) {
        super(id, velocidadActualKMH);
        this.tipoCombustible = tipoCombustible;
        this.litroCombustible = litroCombustible;
        this.litroConsumoPorKm = litroConsumoPorKm;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getLitroCombustible() {
        return litroCombustible;
    }

    public void setLitroCombustible(double litroCombustible) {
        this.litroCombustible = litroCombustible;
    }

    public int getLitroConsumoPorKm() {
        return litroConsumoPorKm;
    }

    public void setLitroConsumoPorKm(int litroConsumoPorKm) {
        this.litroConsumoPorKm = litroConsumoPorKm;
    }

    @Override
    public int precioPagarUsuarioKm(int distanciaKm) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cotxes{" +
                "tipoCombustible='" + tipoCombustible + '\'' +
                ", litroCombustible=" + litroCombustible +
                ", litroConsumoPorKm=" + litroConsumoPorKm +
                '}';
    }
}