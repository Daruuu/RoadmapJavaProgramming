package topic3_objectorientedprogramming.objetos01.exer09;

/*
- Classe Player: representarà un jugador que tindrà com a atributs
la posició en la qual es troba (representada per un objecte de la classe Position)
i el nom del jugador. Els mètodes necessaris són:

Constructor al qual se li passa com a paràmetre la posició inicial on s'ha de situar el jugador.
Ha de crear l'objecte Position que guardarà la posició.

Mètodes per moure el jugador, tindran per noms: moveRight, moveLeft, jump, fall.

Mètodes per establir i consultar el nom del jugador (getter i setter).
Mètode que ens retorna la posició del jugador (getter).
 */
public class Player {
    private String name;
    private Position position;

    // Constructor al qual se li passa com a paràmetre la posició inicial on s'ha de situar el jugador. Ha de crear l'objecte Position que guardarà la posició.
    public Player(int x, int y) {
        position = new Position(x, y);
    }

    public Player() {
    }

    public Player(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void moveRight() {
        position.incX();
    }

    public void moveLeft() {
        position.decX();
    }

    public void jump() {
        position.incX();
    }

    public void fall() {
        position.decY();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
