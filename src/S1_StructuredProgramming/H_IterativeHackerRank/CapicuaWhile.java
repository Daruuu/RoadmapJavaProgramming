package S1_StructuredProgramming.H_IterativeHackerRank;

import java.util.Scanner;

public class CapicuaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copiaNum = num;
        int capicua = 0;
        while (num > 0){
            capicua = capicua * 10;
//            System.out.println(capicua);
            capicua = capicua + num % 10;
//            System.out.println(capicua);
            num = num / 10;
        }
        System.out.println((copiaNum == capicua) ? "TRUE" : "FALSE");
    }
}
