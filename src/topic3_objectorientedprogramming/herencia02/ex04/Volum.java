package topic3_objectorientedprogramming.herencia02.ex04;

public class Volum extends Obra{
    private short numero;

    public Volum(String referencia, String titol) {
        super(referencia, titol);
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }
}
