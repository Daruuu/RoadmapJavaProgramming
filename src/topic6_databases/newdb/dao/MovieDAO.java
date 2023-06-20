package topic6_databases.newdb.dao;

import examenDB.modelo.Movie;

import java.sql.SQLException;

public interface MovieDAO {

    // recibe un id de movie
    // retorna una peli con todos sus atributos.
    public Movie read(int movieId) throws SQLException;
}
