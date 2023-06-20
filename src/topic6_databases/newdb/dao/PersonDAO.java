package topic6_databases.newdb.dao;

import examenDB.modelo.Person;

import java.sql.SQLException;

public interface PersonDAO {

    // recibe un id de persona
    //retorna una persona con sus atributos de la DB
    public Person read(int personId) throws SQLException;

}
