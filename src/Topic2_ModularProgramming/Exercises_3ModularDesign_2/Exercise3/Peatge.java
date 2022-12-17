package Topic2_ModularProgramming.Exercises_3ModularDesign_2.Exercise3;
/*

3. Gestió de peatge. Mitjançant un petit programa ens han demanat que portem la gestió d'un peatge.

El peatge està compost per 4 cues diferents per on poden passar els cotxes, es tracta de portar el control
numèric d'aquestes cues.
Un cotxe quan arriba a un peatge escull per defecte la cua que va menys carregada, en cas
d'empat escull en ordre incremental de la primera a la quarta. El valor màxim d'una cua és 5.

El programa principal, situat a Peatge.java, tindrà un menú que permet:
visualitzar l'estat de cada cua amb els cotxes que hi ha,
donar l'avís de l'arribada d'un nou cotxe,
donar l'avís de la sortida d'un cotxe d'una de les cues (indicant la cua).

També disposem d'una altra classe Cua.java que conté
una variable de classe per a cada cua i que contindrà el nombre de cotxes en aquella cua.
methods:
A part, contindrà els mètodes per saber quants cotxes hi ha en una cua,
incrementar el valor de la cua, decrementar el valor de la cua,
preguntar si una cua està plena i preguntar si una cua està buida.

Pista: vigilar amb els màxims i mínims.
 */

import java.util.Scanner;

public class Peatge {
    static int cotxes;
    static int[][] matrizPeaje = new int[4][5];

    public static void main(String[] args) {


    }
    /*
    Un cotxe quan arriba a un peatge escull per defecte la cua que va menys carregada, en cas
    d'empat escull en ordre incremental de la primera a la quarta. El valor màxim d'una cua és 5.
     */
   /*
    El programa principal, situat a Peatge.java, tindrà un menú que permet:
    visualitzar l'estat de cada cua amb els cotxes que hi ha,
    donar l'avís de l'arribada d'un nou cotxe,
    donar l'avís de la sortida d'un cotxe d'una de les cues (indicant la cua).
    */
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    //visualitzar l'estat de cada cua amb els cotxes que hi ha,

                    break;
                case 2:
                    //donar l'avís de l'arribada d'un nou cotxe,

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }
            opcion = sc.nextInt();
        }
    }

    public static void opciones(){

    }


}
