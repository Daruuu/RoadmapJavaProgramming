package S1_StructuredProgramming.N_Constest4Arrays;

import java.util.Scanner;

public class IgualesAlUltimo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        int contador = 0;
        for (int i = 0; i < numeros.length -1; i++) {
            int ultimoNumero = numeros[numeros.length -1];
            if (numeros[i] == ultimoNumero){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
