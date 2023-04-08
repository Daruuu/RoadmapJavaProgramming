package topic3_oop_programming.abstracta04.exer01;

public abstract class Transports {
    private int id;
    private int velocidaKmH;

    public Transports(int id, int velocidadActualKMH) {
        this.id = id;
        this.velocidaKmH = velocidadActualKMH;
    }

    public Transports() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidaKmH() {
        return velocidaKmH;
    }

    public void setVelocidaKmH(int velocidaKmH) {
        this.velocidaKmH = velocidaKmH;
    }

    public int calcularPreuDistancia(int distanciaKm) {
        return (distanciaKm / velocidaKmH) % 60;
    }

    public abstract int precioPagarUsuarioKm(int distanciaKm);


    @Override
    public String toString() {
        return "Transports{" +
                "id=" + id +
                ", velocidadActualKMH=" + velocidaKmH +
                '}';
    }

}
