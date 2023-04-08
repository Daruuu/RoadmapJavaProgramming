package topic4_collections.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exer03 exer = new Exer03();

        try {
            int[] nuevoArr = exer.introDatosArray();
            for (int i : exer.introDatosArray()){
                System.out.print(i + " ");
            }
            System.out.print("\nbuscar una posicion en array: ");
            int position = sc.nextInt();
            System.out.println(nuevoArr[position]);

            System.out.print("input string: ");
            String str = sc.nextLine();
            System.out.println(nuevoArr[Integer.parseInt(str)]);

        } catch (ArrayIndexOutOfBoundsException excepcionTipoOutOFBound) {
            System.out.println(excepcionTipoOutOFBound.getMessage());
        } catch (InputMismatchException excepcioTipoInput) {
            System.out.println(excepcioTipoInput.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int[] introDatosArray() {
        int[] array = new int[10];
        int i = 0;
        while (i < array.length) {
            array[i] = i;
            i++;
        }
        return array;
    }
}
