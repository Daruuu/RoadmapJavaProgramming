package topic6_databases.newdb.modelo;

public class Rating {
    private float notaRating;
    private int votos;

    public Rating() {
    }

    public Rating(float notaRating, int votos) {
        this.notaRating = notaRating;
        this.votos = votos;
    }

    public float getNotaRating() {
        return notaRating;
    }

    public void setNotaRating(float notaRating) {
        this.notaRating = notaRating;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "notaRating=" + notaRating +
                ", votos=" + votos +
                '}';
    }
}
