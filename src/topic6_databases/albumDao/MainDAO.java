package topic6_databases.albumDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainDAO
{
    public void menu(){
        System.out.println("Diguis quina opció vols executar:\n"
                + "1) Llista els albums\n"
                + "2) Selecciona un sol album\n"
                + "3) Introdueix un album\n"
                + "4) Modifica un album\n"
                + "5) Elimina un album\n"
                + "0) Sortir\n"
        );
    }

    public static void main( String args[] ) throws SQLException {
        Connection c = Connexio.getConnection();
        AlbumDao albumDao = new AlbumDaoImplementacio();
        MainDAO mainDAO = new MainDAO();

        mainDAO.menu();
        Scanner sc = new Scanner(System.in);
        int opcio = sc.nextInt(); sc.nextLine();

        while (opcio!=0){
            switch(opcio){
                case 1: {
                    System.out.println(albumDao.getAlbums());
                    break;
                }
                case 2:{
                    System.out.println("Introdueix quin album vols veure");
                    int idAlbum = sc.nextInt();sc.nextLine();
                    System.out.println(albumDao.read(idAlbum));
                    break;
                }
                case 3:{
                    System.out.println("Introdueix el titol nou");
                    String titol = sc.nextLine();
                    System.out.println("Introdueix idArtista nou");
                    int idArtista = sc.nextInt();sc.nextLine();
                    System.out.println("Creat album: " + albumDao.create(new Album(0, titol, idArtista)));
                    break;
                }
                case 4:{
                    System.out.println("Introdueix quin album vols modificar");
                    int idAlbum = sc.nextInt();sc.nextLine();
                    System.out.println("Introdueix el nou títol");
                    String titol = sc.nextLine();
                    System.out.println("Introdueix el idArtista nou");
                    int idArtista = sc.nextInt();sc.nextLine();
                    albumDao.update(new Album(idAlbum, titol, idArtista));
                    break;
                }
                case 5:{
                    System.out.println("Introdueix quin album vols eliminar");
                    int idAlbum = sc.nextInt();sc.nextLine();
                    albumDao.delete(idAlbum);
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

            mainDAO.menu();
            opcio = sc.nextInt();sc.nextLine();
        }

        c.close();
    }
}