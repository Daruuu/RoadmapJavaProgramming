package topic3_objectorientedprogramming.herencia02.ex04.biblioteca;

public class Revista extends Fitxa{
    private short any;
    private short numero;

    public Revista(String referencia, String titol, short any, short numero) {
        super(referencia, titol);
        this.any = any;
        this.numero = numero;
    }

    public short getAny() {
        return any;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "any=" + any +
                ", numero=" + numero +
                '}';
    }
}
