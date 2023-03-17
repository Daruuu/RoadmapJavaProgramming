package topic4_collections.exersCollection_01.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter a value: ");
            int a = sc.nextInt();
            System.out.println(a * a);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
