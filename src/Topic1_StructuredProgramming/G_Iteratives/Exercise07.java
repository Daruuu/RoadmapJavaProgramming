package Topic1_StructuredProgramming.G_Iteratives;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //factorial de un NUMERO
        // es la multiplication de los numero que van de 1 a dicho NUMERO
        //1 x2 x3 x4 x5 x6
        int numero = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= numero){
            System.out.println(factorial);
            factorial *= i;
            i++;
        }
    }
}
