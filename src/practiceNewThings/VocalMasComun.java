package practiceNewThings;

import java.util.Scanner;
/*
 * Reto #47
 * VOCAL MÁS COMÚN
 * Fecha publicación enunciado.txt: 21/11/22
 * Fecha publicación resolución: 28/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un texto y retorne la vocal que más veces se repita.
 * Si no hay vocales podrá devolver vacío.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */
public class VocalMasComun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        str = str.replaceAll(" ", "");
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {

        }


    }
}
