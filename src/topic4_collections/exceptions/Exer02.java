package topic4_collections.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("enter a value 1 :");
            int n1 = sc.nextInt();
            System.out.print("enter a value 2 :");
            int n2 = sc.nextInt();
            int resultado = n1 / n2;
            System.out.println("resultado de la division: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("error numerico");
        } catch (ArithmeticException e) {
            System.out.println("error de division entre 0");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
