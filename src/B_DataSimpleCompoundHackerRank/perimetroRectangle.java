package B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class perimetroRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("coordenadas A");
        int coordAX = sc.nextInt();
        int coordAY = sc.nextInt();
        System.out.println("coordenadas B");
        int coordBX= sc.nextInt();
        int coordBY= sc.nextInt();

        int ladoA = coordAX - coordBX;
        int ladoB = coordAY - coordBY;
        int perimetroRectangle = ladoA * ladoB;

    }
}
