package B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class LigaFutbol {
    public static void main(String[] args) {
        /*
        un equipo recibe 3 puntos si gana un partido,
        1 punto si empata y
        0 puntos si pierde.
        en caso de empate se mira la diferencia entre los goles marcados y los goles recibidos.
         */
        Scanner sc = new Scanner(System.in);
        int cantidadPartidosGanadosA = sc.nextInt();
        int cantidadPartidosEmpatadosA = sc.nextInt();
        int cantidadPartidosPerdidosA = sc.nextInt();
        int cantidadGolesAFavorA = sc.nextInt();
        int cantidadGolesEnContraA = sc.nextInt();

        int cantidadPartidosGanadosB = sc.nextInt();
        int cantidadPartidosEmpatadosB = sc.nextInt();
        int cantidadPartidosPerdidosB = sc.nextInt();
        int cantidadGolesAFavorB = sc.nextInt();
        int cantidadGolesEnContraB = sc.nextInt();

        int puntosA = (cantidadPartidosGanadosA * 3) + cantidadPartidosEmpatadosA;
        int puntosB = (cantidadPartidosGanadosB* 3) + cantidadPartidosEmpatadosB;
        int diferenciaA = cantidadGolesAFavorA - cantidadGolesEnContraA;
        int diferenciaB = cantidadGolesAFavorB - cantidadGolesEnContraB;
        if (puntosA > puntosB){
            System.out.println(true);
        }else if (puntosA == puntosB){
            if (diferenciaA > diferenciaB) System.out.println(true);
            else System.out.println(false);
        } else {
            System.out.println(false);
        }
    }
}
