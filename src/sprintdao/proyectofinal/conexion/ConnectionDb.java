package scrum.sprintdao.proyectofinal.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                //Creació d’una instància del controlador JDBC
                //(es creen els objectes en carregar-se la classe)
                Class.forName("org.sqlite.JDBC");
                //Crear una connexió a la base de dades amb un objecte Connection
                connection = DriverManager.getConnection("jdbc:sqlite:wadras.sqlite");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
            System.out.println("Opened database successfully");
        }
        return connection;

    }
}
