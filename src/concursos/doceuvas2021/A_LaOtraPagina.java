package concursos.doceuvas2021;

import java.util.Scanner;

public class A_LaOtraPagina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        if (casosPrueba > 2 && casosPrueba < 1000) {
            for (int i = 0; i < casosPrueba; ++i) {
                int numeroPagina = sc.nextInt();
                if (numeroPagina % 2 == 1)  // si la pagina es impar
                    System.out.println(numeroPagina - 1);
                else // mostramos la pagina de la derecha o impar
                    System.out.println(numeroPagina + 1);
            }
        }
    }
}
