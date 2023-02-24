package topic3_objectorientedprogramming.herencia03.ex04.biblioteca;

public class Volum extends Obra{
    private short numero;

    public Volum(String referencia, String titol) {
        super(referencia, titol);
    }

    public Volum(String referencia, String titol, short numero) {
        super(referencia, titol);
        this.numero = numero;
    }

    public Volum(String referencia, String titol, String autor, short numPaginas, short numero) {
        super(referencia, titol, autor, numPaginas);
        this.numero = numero;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Volum{" +
                "numero=" + numero +
                '}';
    }
}
