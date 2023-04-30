package topic6_databases.albumDao;

import java.sql.SQLException;
import java.util.List;

public interface AlbumDao {

    public int create(Album album) throws SQLException;
    public Album read(int idAlbum) throws SQLException;
    public void update(Album album) throws SQLException;
    public void delete(int idAlbum) throws SQLException;
    public List<Album> getAlbums() throws SQLException;
}
