package examenuf05.problema03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Excepciones exer = new Excepciones();
        Scanner sc = new Scanner(System.in);
        try {
            int[] nuevoArr = exer.generateDatosArray();
            for (int i : exer.generateDatosArray()) {
                System.out.print(i + " ");
            }
            System.out.print("\nbuscar una posicion en array: ");
            int position = sc.nextInt();
            System.out.println(nuevoArr[position]);

            System.out.print("input string: ");
            String str = sc.nextLine();
            System.out.println(nuevoArr[Integer.parseInt(str)]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int[] generateDatosArray() {
        int[] array = new int[10];
        int i = 0;
        while (i < array.length) {
            array[i] = i;
            i++;
        }
        return array;
    }
}
