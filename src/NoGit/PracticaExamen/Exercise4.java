package NoGit.PracticaExamen;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int sumaProductosMaximo = 0;
        int productosMinimo = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            int sumaProductos = 0;
            int sumaMinimo = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaProductos += matriz[j][i];
//                System.out.print(sumaProductos);
            }
            if (sumaProductos > sumaProductosMaximo) {
                sumaProductosMaximo = sumaProductos;
            }
            if (sumaProductos < productosMinimo){
                sumaMinimo = sumaMinimo;
            }
        }
        System.out.println("maximo " +sumaProductosMaximo );
        System.out.println("minimo " + productosMinimo);
//        for (int[] fila : matriz) {
//            for (int columna : fila) {
//                System.out.print(columna + " ");
//            }
//            System.out.println();
//        }
    }
}