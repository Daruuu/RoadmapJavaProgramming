package topic6_databases.newdb.modelo;

import examenDB.conexion.Conexio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Actors extends Person{

    private static Connection connectionDb = Conexio.getConnection();

    public Actors() {
    }

    public Actors(int id, String name, int birth) {
        super(id, name, birth);
    }

    public void getActors(int idPerson) throws SQLException {
        String sql = "SELECT people.*, movies.* FROM " +
                "people JOIN movies ON people.person_id = movies.movie_id " +
                "WHERE people.person_id = ?";

        Person person = null;

        try (PreparedStatement ps = connectionDb.prepareStatement(sql)){
            ps.setInt(1,idPerson);

            ResultSet rs = ps.executeQuery();
            rs.next();

        }catch (Exception e){

        }

    }

}
