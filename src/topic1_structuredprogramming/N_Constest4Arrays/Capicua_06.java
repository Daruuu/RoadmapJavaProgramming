package topic1_structuredprogramming.N_Constest4Arrays;

import java.util.Scanner;

public class Capicua_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        boolean capicua = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                capicua = false;
                break;
            }
        }
        String result = capicua ? "SI" : "NO";
        System.out.println(result);
//        if (capicua) System.out.println("SI");
//        else System.out.println("NO");
    }
}
