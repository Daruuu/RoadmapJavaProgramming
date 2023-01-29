package topic3_objectorientedprogramming.exercicisdeclases01.exer09;

/*
- Classe Player: representarà un jugador que tindrà com a atributs
la posició en la qual es troba (representada per un objecte de la classe Position)
i el nom del jugador. Els mètodes necessaris són:

Constructor al qual se li passa com a paràmetre la posició inicial
on s'ha de situar el jugador.
Ha de crear l'objecte Position que guardarà la posició.

Mètodes per moure el jugador, tindran per noms: moveRight, moveLeft, jump, fall.

Mètodes per establir i consultar el nom del jugador (getter i setter).
Mètode que ens retorna la posició del jugador (getter).
 */
public class Player {
    Position p;
    private String name;

    public void moveRight() {
        p.incX();
    }

    public void moveLeft() {
        p.incY();
    }

    public void jump() {
        p.decY();
    }

    public void fall() {
        p.decX();
    }

    public Player(Position p, String name) {
        this.p = p;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "p=" + p +
                ", name='" + name + '\'' +
                '}';
    }
}
