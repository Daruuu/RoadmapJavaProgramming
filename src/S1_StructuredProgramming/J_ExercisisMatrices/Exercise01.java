package S1_StructuredProgramming.J_ExercisisMatrices;

import java.util.Scanner;

//Crea una matriu d'enters de 10x10 i omple-la amb números aleatoris. Després demana un número per teclat i busca si apareix a la matriu.
public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[][] matriu = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("numero a buscar: ");
        int buscarNum = sc.nextInt();
        boolean trobat = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriu[i][j] == buscarNum) {
                    trobat = true;
                }
            }
        }
        String result = trobat ? "numero encontrado" : "numero no encontrado";
        System.out.println(result);
    }
}

