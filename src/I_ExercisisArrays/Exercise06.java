package I_ExercisisArrays;

import java.util.Scanner;

//6. Donat un vector de nombres enters, determina si algun element està repetit.
public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int posicionArr;
        boolean seRepite = false;
        int posicionArrayCopia;

        int[] array = new int[n];
        for (; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (posicionArr = 0; posicionArr < array.length && !seRepite; posicionArr++) {
            for (posicionArrayCopia = posicionArr + 1; posicionArrayCopia < array.length && !seRepite; posicionArrayCopia++) {
                if (array[posicionArr] == array[posicionArrayCopia]) {
                    seRepite = true;
                    System.out.println("el numero esta repetido: " + array[posicionArr]);
                }
            }
        }
        for (int j = 0; j < array.length - 1 && !seRepite; j++) {
            if (array[j] == array[j + 1]) {
                seRepite = true;
            }
        }
        if (!seRepite)
            System.out.println("ningun numero se repite");
    }
}
