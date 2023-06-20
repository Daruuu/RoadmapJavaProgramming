package topic6_databases.newdb.daoimplement;

import examenDB.conexion.Conexio;
import examenDB.dao.RatingDAO;
import examenDB.modelo.Movie;
import examenDB.modelo.Rating;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingDAOImpl implements RatingDAO {

    private static Connection connectionDb = Conexio.getConnection();

    @Override
    public Rating read(Movie movie) throws SQLException {
        String query = "SELECT movies.*, ratings.* FROM " +
                "movies JOIN ratings ON movies.id = ratings.movie_id " +
                "WHERE rating.id = ?";

        try(PreparedStatement ps = connectionDb.prepareStatement(query)){
            ResultSet rs = ps.executeQuery();


        }

//        return movie;
    }
}
