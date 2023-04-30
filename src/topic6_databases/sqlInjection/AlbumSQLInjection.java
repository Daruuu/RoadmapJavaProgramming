package topic6_databases.sqlInjection;

import topic6_databases.albumDao.Connexio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlbumSQLInjection {
    static Connection c = Connexio.getConnection();
    public void seleccionaAlbumPerTitolStatement(String titol)
    {
        Statement stmt = null;
        try {
            String query = "SELECT * FROM Album WHERE Title = '"+titol+"'";
            System.out.println(query);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int albumId = rs.getInt("AlbumId");
                String  title = rs.getString("Title");
                int  artistId = rs.getInt("ArtistId");
                System.out.println( "albumId : " + albumId );
                System.out.println( "title : " + title );
                System.out.println( "artistId : " + artistId );
                System.out.println();
            }
            rs.close();
            st.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    public void seleccionaAlbumPerTitolPreparedStatement(String titol)
    {
        Statement stmt = null;
        try {
            String query = "SELECT * FROM Album WHERE Title = ?";
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1,titol);

            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                int albumId = rs.getInt("AlbumId");
                String  title = rs.getString("Title");
                int  artistId = rs.getInt("ArtistId");
                System.out.println( "albumId : " + albumId );
                System.out.println( "title : " + title );
                System.out.println( "artistId : " + artistId );
                System.out.println();
            }
            rs.close();
            ps.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

}
