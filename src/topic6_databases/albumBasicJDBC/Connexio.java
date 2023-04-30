package topic6_databases.albumBasicJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexio {
    private static Connection con;

    public static Connection getConnection() {
        if (con == null ) {
            try {
                //Creació d’una instància del controlador JDBC
                //(es creen els objectes en carregar-se la classe)
                Class.forName("org.sqlite.JDBC");
                //Crear una connexió a la base de dades amb un objecte Connection
                con = DriverManager.getConnection("jdbc:sqlite:Chinook_Sqlite.sqlite");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
            System.out.println("Opened database successfully");
        }
        return con;
    }
}
