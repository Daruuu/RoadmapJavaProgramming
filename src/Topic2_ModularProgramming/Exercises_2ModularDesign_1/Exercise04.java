package Topic2_ModularProgramming.Exercises_2ModularDesign_1;

import java.util.Map;
import java.util.Random;

/*
4) Als Estats Units és molt popular un joc de daus amb apostes:
un jugador llença simultàniament dos daus i suma la puntuació obtinguda entre ells, el valor resultant de la suma és la puntuació
obtinguda en el llançament.
Regles del joc.
La puntuació obtinguda en el primer llançament s’anomena punt, que es memoritza.
Si el punt és 7 o 11 es guanya i s'acaba la partida.
Si el el punt és 2, 3 o 12 es perd i s'acaba la partida.
Pels altres valors del punt es seguix llançant els daus fins que es treu de nou el punt obtingut al primer llançament, llavors es
guanya i s'acaba la partida, o es treu un 7, llavors es perd i s'acaba la partida.
Exemples de partides:

7 (és el punt) Es guanya
11 (és el punt) Es guanya
2 (és el punt) Es perd
3 (és el punt) Es perd
12 (és el punt) Es perd
8 (és el punt), 9, 6, 5, 8 Es guanya
8 (és el punt), 9, 6, 5, 7 Es perd


Dissenyar i implementar una aplicació emprant la metodologia de disseny descendent (top-down) i el paradigma de la programació estructurada i modular que permeti:
1. Jugar una partida:
l'usuari llença els daus apretant la tecla espai i l'aplicació va informant del resultat i dels següents passos.

2. Determinar l'equitat del joc:
l'aplicació juga automàticament el nombre de partides que li entra l'usuari per teclat,
comptant el nombre de partides guanyades i perdudes i calculant la probabilitat de guanyar en %.
L'única diferència amb la partida interactiva (opció anterior) és que l'usuari no ha d'apretar l'espai per llançar els daus,
la resta de missatges per pantalla són els mateixos.

3. Obtenir ajuda en línia.
4. Sortir de l'aplicació.
 */
public class Exercise04 {
    private static final int[] arrayDados = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        juego();
    }

    public static int lanzarDados() {
        return arrayDados[(int) (Math.random() * arrayDados.length)];
    }

    public static void juego() {
        int lanzamiento1 = lanzarDados();
        int lanzamiento2 = lanzarDados();
        int punto = lanzamiento1 + lanzamiento2;
        System.out.println("lan 1: "+ lanzamiento1);
        System.out.println("lan 2: "+ lanzamiento2);
        System.out.println(punto);
        if (punto == 7 || punto == 11) {
            System.out.println(punto + "(es el punto) Es guanya");
        } else if (punto == 2 || punto == 3 || punto == 12) {
            System.out.println(punto + "(es el punt)Es perd");
        }
    }


}
