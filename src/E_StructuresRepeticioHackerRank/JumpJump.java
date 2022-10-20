package E_StructuresRepeticioHackerRank;

import java.util.Scanner;

public class JumpJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int acumulador = 0;
        while (n != -1) {
            acumulador += n;
            n = sc.nextInt();
        }
        System.out.println(acumulador/3);
    }
}
