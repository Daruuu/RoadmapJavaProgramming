package N_Constest4Arrays;

import java.util.Scanner;

public class AlturaMinima_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] alturas = new float[n];
        for (int i = 0; i < n; i++) {
            alturas[i] = sc.nextFloat();
        }
        float m = sc.nextFloat();
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] >= m){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
    }
}
