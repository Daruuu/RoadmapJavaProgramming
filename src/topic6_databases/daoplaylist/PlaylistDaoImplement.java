package topic6_databases.daoplaylist;

import java.sql.SQLException;
import java.util.List;

public class PlaylistDaoImplement implements PlaylistDao{
    @Override
    public int create(Playlist playlist) throws SQLException {
        return 0;
    }

    @Override
    public void delete(int idPlaylist) {

    }

    @Override
    public Playlist read(int idPlaylist) {
        return null;
    }

    @Override
    public void update(Playlist playlist) {

    }

    @Override
    public List<Playlist> getPlaylists() throws SQLException {
        return null;
    }
}
