package I_ExercisisArrays;
//3. Donat un array de 5 elements digues sí és creixent o decreixent. Ex: creixent {0,3, 5, 6, 9}, decreixent {34, 23, 19, 18, 3}

import java.util.EventListener;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] newArr1 = {0, 3, 5, 6, 9};
        int[] newArr2 = {34, 23, 19, 18, 3};

        boolean creciente = false;
        boolean decreciente = false;

        for (int i = 0; i < newArr1.length -1; i++) {

            if (newArr1[i] <= newArr1[i + 1]) {
                creciente = true;
            }
            if (newArr1[i] >= newArr1[i + 1]) {
                decreciente = true;
            }
            if (creciente && decreciente)
                break;
        }
        if (creciente) {
            System.out.println("array CRECIENTE");
        } else if (decreciente) {
            System.out.println("array DECRECIENTE");
        }
    }
}