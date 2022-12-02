package Topic1_StructuredProgramming.B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class perimetroRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coordAX = sc.nextInt();
        int coordAY = sc.nextInt();
        int coordBX= sc.nextInt();
        int coordBY= sc.nextInt();

        int ladoA = coordAX - coordBX;
        int ladoB = coordAY - coordBY;
        int perimetroRectangle = (ladoA * 2) + (ladoB * 2);
        System.out.println(perimetroRectangle);
    }
}
