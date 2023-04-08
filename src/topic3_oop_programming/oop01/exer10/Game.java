package topic3_oop_programming.oop01.exer10;

import topic3_oop_programming.oop01.exer09.Player;
import topic3_oop_programming.oop01.exer09.Position;

import java.util.Scanner;

/*
10. Crea una classe Game amb un mètode main que mostri un menú per pantalla amb les següents opcions (usant la classe Player de l'exercici anterior):

a) Afegir nou jugador: aquesta opció crearà un nou objecte de la classe Player. Demanarà a l'usuari el nom i les coordenades inicials.

b) Eliminar jugador: aquesta opció eliminarà l'últim jugador creat.

c) Reset de la partida: elimina tots els jugador creats.

d) Mostrar jugadors: mostrar per pantalla la informació de tots els jugadors.

Per guardar els jugadors al main cal crear un vector de Players de 10 posicions. Quan el vector estigui plè no es podran crear més jugadors fins que no se n'elimini un (si s'intenta donarà un error per pantalla).
 */
public class Game {

    private Player[] jugadores;

    public Game(Player[] jugadores) {
        this.jugadores = new Player[10];
    }

    public Game() {
    }

    public static void main(String[] args) {
        Game game1 = new Game();
//        game1.menuPrograma(jugadores);

    }

    public void menuOpciones() {
        System.out.print("Menu:" +
                "[a]- Afegir nou jugador" +
                "[b]- Eliminar jugador" +
                "[c]- Reset de la partida" +
                "[d]- Mostar jugadors");
    }

    public void menuPrograma(Player[] jugadores) {
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine().toLowerCase();
        while (!opcion.equals("e")) {
            switch (opcion) {
                case "a":
//                    game.crearJugador();
                    break;
                case "b":
                    //b) Eliminar jugador: aquesta opció eliminarà l'últim jugador creat.
                    for (int i = jugadores.length - 1; i > 0; i--) {
                        if (jugadores[i] != null) {
//                            jugadores[i] == ;
//                            jugadores[i-1] = ;
                        }
                    }
                    break;
                case "c":
                    System.out.println("Eliminar todos los jugadores");
                    break;
                case "d":
                    System.out.println("Mostrar info de jugadores:");
                    for (Player js : jugadores) {
                        System.out.println(js);
                    }
                    break;
                default:
                    System.out.println("introduce una letra valida");
            }
            opcion = sc.nextLine();
        }
    }

    public void crearJugador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Crear un nuevo jugador:\n" +
                "Introduce el nombre del nuevo jugador: \n");
        String nombre = sc.nextLine();
        System.out.print("Inicializar la posicion del jugador\n introduce coordenadas de x: ");
        int x = sc.nextInt();
        System.out.print("introduce coordenadas de y: ");
        int y = sc.nextInt();
        Position position1 = new Position(x, y);
        Player player1 = new Player(nombre, position1);
        jugadores[0] = player1;
    }

}
