package M_Constest4Arrays;

import java.util.Scanner;

public class ElUtimoQueSuma_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array =  new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] nuevoArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i] + array[array.length -1];
        }
        for (int nums : nuevoArray) {
            System.out.print(nums + " ");
        }
    }
}
