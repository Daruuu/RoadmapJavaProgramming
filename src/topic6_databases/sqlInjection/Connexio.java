package topic6_databases.sqlInjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexio {

    private static Connection con = null;
    public static Connection getConnection()
    {
        if (con == null ){
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:Chinook_Sqlite.sqlite");
            }
            catch (ClassNotFoundException | SQLException e) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Opened database successfully");
        }
        return con;
    }
}
