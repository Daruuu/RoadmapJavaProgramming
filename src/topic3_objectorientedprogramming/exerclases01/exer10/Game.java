package topic3_objectorientedprogramming.exerclases01.exer10;

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
    public static void main(String[] args) {


    }

    public void menuOpciones() {
        System.out.print("Menu:" +
                "[a]- Afegir nou jugador" +
                "[b]- Eliminar jugador" +
                "[c]- Reset de la partida" +
                "[d]- Mostar jugadors");
    }

    public void menuPrograma() {
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        while (!opcion.equals("e")) {

            opcion = sc.nextLine();
        }

    }

}
