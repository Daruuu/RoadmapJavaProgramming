package topic2_modularprogramming.exercises_1ModularBasic;

import java.util.Scanner;

/*
6. (sumaArray) Fer una funció que rebi un vector numèric i retorni la suma dels seuselements.
 */
public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("longitud array: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10);
        }
        sumaArray(vector);
    }

    public static void sumaArray(int [] array){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            contador+= array[i];
        }
        System.out.println(contador);
    }
}
