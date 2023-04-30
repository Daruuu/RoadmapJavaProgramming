package topic6_databases.sqlInjection;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public void menu(){
        System.out.println("Digues quina opció vols executar:\n"
                        + "1) Statement\n"
                        + "2) PreparedStatement\n"
                        + "0) Sortir\n"
                );
    }

    public static void main( String args[] ) throws SQLException {
        AlbumSQLInjection album = new AlbumSQLInjection();
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        main.menu();
        int opcio = sc.nextInt();sc.nextLine();
        while (opcio!=0){

            switch(opcio){
                case 1: {
                    System.out.println("Introdueix quin album vols veure");
                    String titol = sc.nextLine();
                    album.seleccionaAlbumPerTitolStatement(titol);
                    break;
                }
                case 2:{
                    System.out.println("Introdueix quin album vols veure");
                    String titol = sc.nextLine();
                    album.seleccionaAlbumPerTitolPreparedStatement(titol);
                    break;
                }
                case 0:{

                    break;
                }
                default:{
                    System.out.println("Introdueix un nombre vàlid del 0 al 6");
                    break;
                }
            }
            main.menu();
            opcio = sc.nextInt();sc.nextLine();
        }
    }
}