package topic3_objectorientedprogramming.asociationoop02.exer02;

public class Matricula {
    private Alumne alumne;
    private Modul modul;
    private double nota;

    public Matricula(Alumne alumne, Modul modul, double nota) {
        this.alumne = alumne;
        this.modul = modul;
        this.nota = nota;
    }

    public Matricula(String nom, String cognom, int edat, String dni, String nomModul, double nota) {
        this.alumne = new Alumne(nom, cognom, edat, dni);
        this.modul = new Modul(nomModul);
        this.nota = nota;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "alumne=" + alumne +
                ", modul=" + modul +
                ", nota=" + nota +
                '}';
    }
}
