package topic6_databases.newdb.dao;

import examenDB.modelo.Movie;
import examenDB.modelo.Rating;

import java.sql.SQLException;

public interface RatingDAO {
    // retorna el rating per a la peli pasada por param
    public Rating read(Movie movie) throws SQLException;

}
