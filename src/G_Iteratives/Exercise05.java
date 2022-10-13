package G_Iteratives;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            double numeroAleatorio = Math.floor(Math.random() * (n2 - n1));
            System.out.println(numeroAleatorio);
        }
    }
}
