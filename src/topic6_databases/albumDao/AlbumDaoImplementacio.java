package topic6_databases.albumDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlbumDaoImplementacio implements AlbumDao{

    static Connection con = Connexio.getConnection();

    @Override
    public int create(Album album) throws SQLException
    {
        String query = "insert into Album(Title, ArtistId) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, album.getNom());
        ps.setInt(2, album.getIdArtista());
        ps.executeUpdate();
        // Obtenim claus autogenerades
        ResultSet rs = ps.getGeneratedKeys();
        rs.next(); // Sabem que només n'hi ha una
        int n = rs.getInt(1);
        return n;
    }

    @Override
    public Album read(int id)
            throws SQLException
    {

        String query = "select * from Album where AlbumId= ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        Album album = new Album();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            album.setIdAlbum(rs.getInt("AlbumId"));
            album.setNom(rs.getString("Title"));
            album.setIdArtista(rs.getInt("ArtistId"));
        }

        if (check == true) {
            return album;
        }
        else
            return null;
    }

    @Override
    public void update(Album album) throws SQLException
    {
        String query= "update Album set Title=?, ArtistId= ? where AlbumId = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, album.getNom());
        ps.setInt(2, album.getIdArtista());
        ps.setInt(3, album.getIdAlbum());
        ps.executeUpdate();
    }

    @Override
    public void delete(int id) throws SQLException
    {
        String query = "delete from Album where AlbumId =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public List<Album> getAlbums() throws SQLException
    {
        String query = "select * from Album";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Album> ls = new ArrayList();

        while (rs.next()) {
            Album album = new Album();
            album.setIdAlbum(rs.getInt("AlbumId"));
            album.setNom(rs.getString("Title"));
            album.setIdArtista(rs.getInt("ArtistId"));
            ls.add(album);
        }
        return ls;
    }

}