package topic6_databases.albumBasicJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Artist {
    private int artistId;
    private String name;
    private static Connection connection = Connexio.getConnection();

    public Artist() {
    }

    public Artist(int artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                '}';
    }

    // 1. Ten en cuenta ahora qué ocurre cuando insertamos o modificamos un Álbum con un artista que no existe. Cómo modificarías el código inicial para vigilarlo.
    public boolean comprobarIdArtistaV1(int artistId) throws SQLException {

        String query = "SELECT * FROM Artist WHERE ArtistId = ?";
        boolean found = false;

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, artistId);

        //rs ejecuta la query
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next() && rs.getInt(1) != 0) {
                found = true;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return found;
    }

    boolean comprobarIdV2(int artistId) {
        boolean found = false;
        try {
            String query = "SELECT * FROM Artist WHERE ArtistId = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, artistId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int thisArtistId = rs.getInt("ArtistId");
                if (thisArtistId == artistId) {
                    found = true;
                    break;
                } else {
                    return false;
                }
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return found;
    }

    //1.2 Añade la clase Artista y haz que se cargue el objeto Artista correspondiente a un álbum (como atributo de Album) al recuperar


}
