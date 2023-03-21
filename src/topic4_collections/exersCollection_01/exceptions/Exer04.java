package topic4_collections.exersCollection_01.exceptions;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        Exer04 e4 = new Exer04();

        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Introduce numero positivo: ");
            int p = sc.nextInt();
            e4.imprimirPositiu(p);

            System.out.print("Introduce numero negativo: ");
            int n = sc.nextInt();
            e4.imprimirNegatiu(n);
        }catch (Exception ePositivo){

//        }catch (Exception eNegativo){
        }
    }

    void imprimirPositiu(int p) {
        if (p >= 0)
            System.out.println("positiu-> " + p);
    }

    void imprimirNegatiu(int n) {
        if (n >= 0)
            System.out.println("negativo-> " + n);
    }
}
