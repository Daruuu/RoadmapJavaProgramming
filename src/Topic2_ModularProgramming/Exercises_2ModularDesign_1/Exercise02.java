package Topic2_ModularProgramming.Exercises_2ModularDesign_1;

/*
Feu un programa anomenat MesVocals que llegeixi una frase i, tot seguit,
mostri per pantalla quina és la paraula amb més vocals (sense importar majúscules i minúscules).
A mode d'exemple, el comportament del programa podria ser el següent:

Escriu una frase:
Hi havia una vegada una noia anomenada Caputxeta Vermella
La paraula amb mes vocals és "anomenada".
 */
public class Exercise02 {
    public static void main(String[] args) {
        String input = "Hi havia una vegada una noia anomenada Caputxeta Vermella";
        String result = mesVocales(input);
        System.out.println(result);

        String res2 = mesVocales2(input);
        System.out.println(res2);

    }

    public static String mesVocales(String str) {
        String[] nuevoStr = str.toLowerCase().split(" ");
        int contadorTotal = 0;
        String palabraMasVocales = "";
        for (int j = 0; j < nuevoStr.length; j++) {
            int contador = 0;
            for (int k = 0; k < nuevoStr[j].length(); k++) {
                if (nuevoStr[j].charAt(k) == 'a' || nuevoStr[j].charAt(k) == 'e' || nuevoStr[j].charAt(k) == 'i' || nuevoStr[j].charAt(k) == 'o' || nuevoStr[j].charAt(k) == 'u') {
                    contador++;
                }
            }
            if (contador > contadorTotal) {
                contadorTotal = contador;
                palabraMasVocales = nuevoStr[j];
            }
        }
        return palabraMasVocales;
    }

    public static String mesVocales2(String str) {
        String[] nuevoStr = str.toLowerCase().split(" ");
        int contadorTotal = 0;
        int posPalabraMasVocales = 0;
        for (int j = 0; j < nuevoStr.length; j++) {
            int contador = 0;
            for (int k = 0; k < nuevoStr[j].length(); k++) {
                if (nuevoStr[j].charAt(k) == 'a' || nuevoStr[j].charAt(k) == 'e' || nuevoStr[j].charAt(k) == 'i' || nuevoStr[j].charAt(k) == 'o' || nuevoStr[j].charAt(k) == 'u') {
                    contador++;
                }
            }
            if (contador > contadorTotal) {
                contadorTotal = contador;
                posPalabraMasVocales = j;
            }
        }
        return nuevoStr[posPalabraMasVocales];
    }
}
