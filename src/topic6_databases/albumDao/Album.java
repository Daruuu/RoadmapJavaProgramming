package topic6_databases.albumDao;

public class Album {
    private int idAlbum;
    private String nom;
    private int idArtista;

    public Album(int idAlbum, String nom, int idArtista) {
        this.idAlbum = idAlbum;
        this.nom = nom;
        this.idArtista = idArtista;
    }

    public Album() {
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    @Override
    public String toString() {
        return "\nAlbum: " +
                "id=" + idAlbum +
                ", nom='" + nom + '\'' +
                ", artista id=" + idArtista;
    }
}
