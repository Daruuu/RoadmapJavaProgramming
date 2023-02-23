package topic3_objectorientedprogramming.herencia02.ex04.biblioteca;

public class Obra extends Fitxa{
    private String autor;
    private short numPaginas;

    public Obra(String referencia, String titol) {
        super(referencia, titol);
    }

    public Obra(String referencia, String titol, String autor, short numPaginas) {
        super(referencia, titol);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
