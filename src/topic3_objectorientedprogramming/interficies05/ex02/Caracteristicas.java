package topic3_objectorientedprogramming.interficies05.ex02;

public abstract class Caracteristicas {
    private int codi;
    private String titulo;
    private int anyoPublicacion;

    public Caracteristicas() {
    }

    public Caracteristicas(int codi, String titulo, int anyoPublicacion) {
        this.codi = codi;
        this.titulo = titulo;
        this.anyoPublicacion = anyoPublicacion;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    //public abstract
    @Override
    public String toString() {
        return "Caracteristicas{" +
                "codi=" + codi +
                ", titulo='" + titulo + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                '}';
    }
}
