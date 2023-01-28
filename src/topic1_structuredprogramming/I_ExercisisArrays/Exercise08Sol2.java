package topic1_structuredprogramming.I_ExercisisArrays;

import java.util.Arrays;

/*
8. Escriu un programa que donat un vector que guarda els pesos de 20 persones (valors enters positius entre 50 i 100), escrigui per pantalla un histograma que representi el nombre de persones per cada pes especificat.
Consideracions:

- A l'histograma només apareixeran els pesos amb una o més persones.
- El vector de pesos s'ha de definir en el codi, NO cal preguntar-los a l'usuari.
- Els vector de pesos no està ordenat. PISTA: usar el mètode Arrays.sort(...) per ordenar-lo.

Exemple:
pesos[20]={55,61,65,70,55,61,65,70,61,70,61,70,70,65,65,65,65,65,65,65}

Histograma
--------------------------------------
55 **
61 ****
65 *********
70 *****
 */
public class Exercise08Sol2 {
    public static void main(String[] args) {

        int[] weightPeople = new int[]{55, 61, 65, 70, 55, 61, 65, 70, 61, 70, 61, 70, 70, 65, 65, 65, 65, 65, 65, 65};
        int[] numeroVeces = new int[101];
        Arrays.sort(weightPeople);
        for (int i = 0; i < weightPeople.length; i++) {
            numeroVeces[weightPeople[i]]++;
        }
        for (int i = 0; i < numeroVeces.length; i++) {
            if (numeroVeces[i] > 0){
                System.out.print(i + " ");
                for (int j = 0; j < numeroVeces[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
