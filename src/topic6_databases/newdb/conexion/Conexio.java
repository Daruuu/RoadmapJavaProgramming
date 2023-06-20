package topic6_databases.newdb.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexio {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {

                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:movies_tiny.db");
            } catch (SQLException | ClassNotFoundException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
            System.out.println("Conexion realizada a DB!");
        }
        return connection;
    }
}
