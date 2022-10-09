package C_Conditionals;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una letra: \n 1) Rectangulo \n 2) Cuadrado \n 3) Rombo");
        int numero = sc.nextInt();
        int longitudRectangulo = 15;
        int anchoRectangulo = 6;
        int ladoCuadrado = 8;
        int diagonalMayor = 9;
        int diagonalMenor = 4;
        int areaRectangulo = longitudRectangulo * anchoRectangulo;  //longitud * ancho
        int areaCuadrado = ladoCuadrado * ladoCuadrado;    //lado * lado
        int areaRombo = (diagonalMayor * diagonalMenor) / 2;   //diagonal *diaugonal / 2
        int resultado = 0;
        switch (numero) {
            case 1:
                System.out.println(areaRectangulo);
                break;
            case 2:
                System.out.println(areaCuadrado);
                break;
            case 3:
                System.out.println(areaRombo);
                break;
            default:
                System.out.println("introduce un numero correcto");
        }
    }
}
