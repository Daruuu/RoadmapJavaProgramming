package topic2_ModularProgramming.exercises_3ModularDesign_2.Exercise3;

/*
També disposem d'una altra classe Cua.java que conté
una variable de classe per a cada cua i que contindrà el nombre de cotxes en aquella cua.
methods:
A part, contindrà els mètodes per saber quants cotxes hi ha en una cua,
incrementar el valor de la cua, decrementar el valor de la cua,
preguntar si una cua està plena i preguntar si una cua està buida.

Pista: vigilar amb els màxims i mínims.
 */
public class Cua {
    public static int numeroCochesCola;
    public static int[] colas = new int[4];

    // saber quants cotxes hi ha en una cua:
    // cola 1: [0] = 3 coches
    // cola 2: [1] = 4 coches
    // cola 3: [2] = 3 coches
    // cola 4: [3] = 0 coches

    public static void estadoDeColasCoches(int numeroCochesCola) {// cola menos cargada
        for (int i = 0; i < colas.length; i++) {
            int colaRestante = 5 - i;
            // cola[0]= 3  < 5 && 2 >=(5-3)=2
            if (colas[i] < 5 && numeroCochesCola >= colaRestante) {
                colas[i] = colas[i + numeroCochesCola];
            } else {
                System.out.println("cola " + colas[i] +" esta llena");
            }
        }
    }

    //incrementar el valor de la cua, decrementar el valor de la cua,
    public static void incrementarValorCola() {

    }

    public static void decrementarValorCola() {

    }

    //preguntar si una cua està plena i preguntar si una cua està buida.
    public static void colaPeajeLlena() {

    }

}
