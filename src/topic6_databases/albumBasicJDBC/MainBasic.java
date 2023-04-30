package topic6_databases.albumBasicJDBC;

import java.sql.*;
import java.util.Scanner;

public class MainBasic {
    public void menu() {
        System.out.println("Diguis quina opció vols executar:\n"
                + "1) Llista els albums\n"
                + "2) Selecciona un sol album\n"
                + "3) Introdueix un album\n"
                + "4) Modifica un album\n"
                + "5) Elimina un album\n"
                + "0) Sortir\n"
        );
    }

    public static void main(String args[]) throws SQLException {
        Album album = new Album();
        Artist artist = new Artist();
        Scanner sc = new Scanner(System.in);
        MainBasic main = new MainBasic();
        main.menu();
        int opcio = sc.nextInt();
        sc.nextLine();

        while (opcio != 0) {
            switch (opcio) {
                case 1: {
                    System.out.println(album.seleccionaAlbums());
                    break;
                }
                case 2: {
                    System.out.println("Introdueix quin album vols veure");
                    int idAlbum = sc.nextInt();
                    sc.nextLine();
//                    Album albumLlegit = album.llegeixAlbum(idAlbum);
                    Album leerAlbumTodo = album.leerAlbumCompleto(idAlbum);
                    System.out.println(leerAlbumTodo);
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("Introdueix el titol nou");
                    String titol = sc.nextLine();
                    System.out.println("Introdueix idArtista nou");
                    int idArtista = sc.nextInt();
                    sc.nextLine();
/*
                    if (artist.comprobarIdArtistaV1(idArtista)) {
                        System.out.println(album.creaAlbum(titol, idArtista));
                    } else {
                        System.out.println("ID ARTISTA NO EXISTE!");
                    }
*/
                    if (artist.comprobarIdV2(idArtista)) {
                        album.creaAlbum(titol, idArtista);
                    } else {
                        System.out.println("ID ARTISTA NO EXISTE!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Introdueix quin album vols modificar");
                    int idAlbum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introdueix el nou títol");
                    String titol = sc.nextLine();
                    System.out.println("Introdueix el idArtista nou");
                    int idArtista = sc.nextInt();
                    sc.nextLine();
                    album.modificaAlbum(idAlbum, titol, idArtista);
                    break;
                }
                case 5: {
                    System.out.println("Introdueix quin album vols eliminar");
                    int idAlbum = sc.nextInt();
                    sc.nextLine();
                    album.eliminaAlbum(idAlbum);
                    break;
                }
                case 0: {

                    break;
                }
                default: {
                    System.out.println("Introdueix un nombre vàlid del 0 al 6");
                    break;
                }
            }

            main.menu();
            opcio = sc.nextInt();
            sc.nextLine();
        }

    }
}