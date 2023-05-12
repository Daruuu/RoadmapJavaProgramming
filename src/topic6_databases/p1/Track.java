package topic6_databases.p1;


import topic6_databases.albumBasicJDBC.Connexio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Track {
    private int trackId;
    private String name;
    private int idAlbum;
    private int idMediaType;
    private int idGenre;
    private String composer;
    private int milliseconds;
    private int bytes;
    private float unitPrice;

    public static Connection connection = Connexio.getConnection();

    public Track() {
    }

    public Track(int trackId, String name, int idAlbum, int idMediaType, int idGenre, String composer, int milliseconds, int bytes, float unitPrice) {
        this.trackId = trackId;
        this.name = name;
        this.idAlbum = idAlbum;
        this.idMediaType = idMediaType;
        this.idGenre = idGenre;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public int getIdMediaType() {
        return idMediaType;
    }

    public void setIdMediaType(int idMediaType) {
        this.idMediaType = idMediaType;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", name='" + name + '\'' +
                ", idAlbum=" + idAlbum +
                ", idMediaType=" + idMediaType +
                ", idGenre=" + idGenre +
                ", composer=" + composer +
                ", milliseconds=" + milliseconds +
                ", bytes=" + bytes +
                ", unitPrice=" + unitPrice +
                '}';
    }

    private int getAlbumId(String albumName) throws SQLException {

        String query = "SELECT albumId FROM Album WHERE title = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, albumName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("AlbumId");
            } else {
                throw new SQLException("No existe el album con nombre " + albumName);
            }
        }
    }

    private int getGenreId(String genreName) throws SQLException {
        String query = "SELECT GenreId FROM Genre WHERE name = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, genreName);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("GenreId");
                } else {
                    throw new SQLException("No se encontro el genere " + genreName);
                }
            }
        }
    }

    private int getMediaTypeId(String mediaTypeName) throws SQLException {
        String query = "SELECT MediaTypeId FROM MediaType WHERE Name = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, mediaTypeName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("MediaTypeId");
            } else {
                throw new SQLException("No se encontro el tipo de conexion con nombre " + mediaTypeName);
            }
        }
    }


    public int createTrack(String nameTrack, String composer, int milliseconds, int bytesTrack, float unitPriceTrack, String albumNameFK, String mediaTypeNameFK, String genreNameFK) throws SQLException {

        int nuevoIdAlbum = -1;

        String query = "INSERT INTO Track(Name, AlbumId, MediaTypeId, GenreId, Composer, Milliseconds, Bytes, UnitPrice)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

//        PreparedStatement ps = connection.prepareStatement(query);
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            int idAlbum = getAlbumId(albumNameFK);
            int idMediaType = getMediaTypeId(mediaTypeNameFK);
            int idGenre = getGenreId(genreNameFK);

            ps.setString(1, nameTrack);
            ps.setInt(2, idAlbum);
            ps.setInt(3, idMediaType);
            ps.setInt(4, idGenre);
            ps.setString(5, composer);
            ps.setInt(6, milliseconds);
            ps.setInt(7, bytesTrack);
            ps.setDouble(8, unitPriceTrack);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            nuevoIdAlbum = rs.getInt(1);
            rs.next();

            ps.close();
            System.out.println("New record created successfully!");
            return nuevoIdAlbum;

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return nuevoIdAlbum;
    }

    public Track readTrack(int idTrack) throws SQLException {
        String query = "SELECT * FROM Track WHERE TrackId = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        Track track = null;

        ps.setInt(1, idTrack);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            //fk de la tabla Track
            int idAlbumFk = rs.getInt("AlbumId");
            int idMediaTypeFk = rs.getInt("MediaTypeId");
            int idGenreFk = rs.getInt("GenreId");

            // atributos de la tabla Track
            String name = rs.getString("Name");
            String Composer = rs.getString("Composer");
            int milliseconds = rs.getInt("Milliseconds");
            int bytes = rs.getInt("bytes");
            float unitPrice = rs.getFloat("UnitPrice");

//            Album a = getAlbumId(idAlbumFk);
//            MediaType mT = getMediaTypeId(idMediaTypeFk);
//            Genre g = getGenreId(idGenreFk);
//            track = new Track()

        }
        return null;
    }
}