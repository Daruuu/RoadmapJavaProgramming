package topic4_collections.hashset01;

import java.util.HashSet;

public class Loteria {
    private SacoBolas saco;
    private HashSet<Jugador> jugadores;

    public static void main(String[] args) {
        Loteria loteria = new Loteria();

        loteria.jugadores = new HashSet<>(4);
        Boleto b1 = new Boleto();
        Boleto b2 = new Boleto();
        Boleto b3 = new Boleto();
        Boleto b4 = new Boleto();

        Jugador j1 = new Jugador("dni1", b1);
        Jugador j2 = new Jugador("dni2", b2);
        Jugador j3 = new Jugador("dni3", b3);
        Jugador j4 = new Jugador("dni4", b4);

        loteria.jugadores.add(j1);
        loteria.jugadores.add(j2);
        loteria.jugadores.add(j3);
        loteria.jugadores.add(j4);

        loteria.saco = new SacoBolas();
        HashSet<Integer> bolasParaSacar = new HashSet<>();
        // llmar a la funcion sacarBola

    }

    public Loteria() {
        saco = new SacoBolas();
        jugadores = new HashSet<>(4);
    }

    public Loteria(SacoBolas saco, HashSet<Jugador> jugadores) {
        this.saco = saco;
        this.jugadores = jugadores;
    }

    public SacoBolas getSaco() {
        return saco;
    }

    public void setSaco(SacoBolas saco) {
        this.saco = saco;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void extraerBolas(){
        // extaer bolas del saco
        //mostrar las bolas que he sacado
        // comprobar si un jugador tiene esa bola en el boleto
        // si alguno ghana eliminar su DNI
        while (true){
            int bola = saco.extraerUnaBola();

        }

    }
    @Override
    public String toString() {
        return "Loteria{" +
                "saco=" + saco +
                ", jugadores=" + jugadores +
                '}';
    }
}
