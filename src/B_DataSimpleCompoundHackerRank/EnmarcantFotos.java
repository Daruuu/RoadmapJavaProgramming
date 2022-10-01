package B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class EnmarcantFotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladoSuperiorFotoAX = sc.nextInt();  //1
        int ladoSuperiorFotoAY = sc.nextInt();  //2

        int ladoInferiorFotoBX = sc.nextInt();  //0
        int ladoInferiorFotoBY = sc.nextInt();  //0

        int ladoSuperiorMarcoAX = sc.nextInt(); //4
        int ladoSuperiorMarcoAY = sc.nextInt(); //2

        int ladoInferiorMarcoBX = sc.nextInt(); //2
        int ladoInferiorMarcoBY = sc.nextInt(); //1

        int distFotoX = ladoSuperiorFotoAX - ladoInferiorFotoBX;
        int distFotoY = ladoSuperiorFotoAY - ladoInferiorFotoBY;

        int perimetroFoto = (distFotoX * 2) + (distFotoY * 2);

        int distanciaMarcoA = ladoSuperiorMarcoAX - ladoInferiorMarcoBX;
        int distanciaMarcoB = ladoSuperiorMarcoAY - ladoInferiorMarcoBY;

        int perimetroMarco = (distanciaMarcoA * 2) + (distanciaMarcoB * 2);// son proporcionales
        System.out.println(perimetroMarco % perimetroFoto == 0);

    }
}
