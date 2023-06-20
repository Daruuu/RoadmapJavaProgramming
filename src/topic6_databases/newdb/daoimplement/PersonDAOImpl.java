package topic6_databases.newdb.daoimplement;

import examenDB.conexion.Conexio;
import examenDB.dao.PersonDAO;
import examenDB.modelo.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDAOImpl implements PersonDAO {

    private static Connection connectionDb = Conexio.getConnection();

    @Override
    public Person read(int personId) throws SQLException {

        String sql = "SELECT * FROM people WHERE id = ?";
        Person personRead = null;

        try (PreparedStatement ps = connectionDb.prepareStatement(sql)) {

            ps.setInt(1, personId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                int birth = rs.getInt("birth");

                personRead = new Person(name, birth);
            }
        } catch (SQLException e) {
            System.out.println("id no inexistente " + e.getMessage());
        }

        return personRead;
    }
}
