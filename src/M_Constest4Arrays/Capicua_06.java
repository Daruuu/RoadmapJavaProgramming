package M_Constest4Arrays;

import java.util.Scanner;

public class Capicua_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0){
                boolean b = array[i] == array[array.length - 1];
            }
        }
    }
}
