package topic6_databases.p1;

public class Genre {
    private int genreID;
    private String name;

    public Genre() {
    }

    public Genre(int genreID, String name) {
        this.genreID = genreID;
        this.name = name;
    }

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreID=" + genreID +
                ", name='" + name + '\'' +
                '}';
    }
}
