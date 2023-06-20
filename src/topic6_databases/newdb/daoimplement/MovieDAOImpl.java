package topic6_databases.newdb.daoimplement;

import examenDB.conexion.Conexio;
import examenDB.dao.MovieDAO;
import examenDB.modelo.Movie;

import java.sql.Connection;
import java.sql.SQLException;

public class MovieDAOImpl implements MovieDAO {

    private static Connection connectionDb = Conexio.getConnection();
    @Override
    public Movie read(int movieId) throws SQLException {


        return null;
    }
}
