package topic6_databases.daoplaylist;

import java.sql.SQLException;
import java.util.List;

public interface PlaylistDao {
    int create(Playlist playlist) throws SQLException;

    void delete(int idPlaylist);

    Playlist read(int idPlaylist);

    void update(Playlist playlist);

    List<Playlist> getPlaylists() throws SQLException;
}
