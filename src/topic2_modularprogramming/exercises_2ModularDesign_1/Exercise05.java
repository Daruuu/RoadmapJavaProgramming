package topic2_modularprogramming.exercises_2ModularDesign_1;

import java.util.Scanner;

/*
Ens han demanat que fem una gestió molt simple de reserves d'un cinema.
El programa ha de complir els següents requisits:

1. S'ha d'iniciar amb un nombre total d'entrades lliures.
2. Ha d'anar preguntant el nombre d'entrades que volem reservar.

En cada reserva ha de comprovar:
si hi ha suficients localitats lliures. En cas afirmatiu, ha de calcular el preu total de la
reserva a raó de 6 euros l'entrada.

3. El programa ha d'acabar quan li demanem un nombre d'entrades que sobrepassa l'aforament
disponible. Quan això passi s'ha de mostrar el nombre total d'entrades venudes per aquella
sessió i la recaudació total que s'ha realitzat.
 */
public class Exercise05 {

    private static int entradasLibres;
    private static int numeroEntradasAReservar;
    private static final int entrada = 6;
    private static int numButacas;

    public static void main(String[] args) {
        reserva();
    }

    public static void menuPrograma() {
        reserva();
    }

    /*
    Ha d'anar preguntant el nombre d'entrades que volem reservar.
    En cada reserva ha de comprovar si hi suficients localitats lliures.
    En cas afirmatiu, ha de calcular el preu
    total de la reserva a raó de 6 euros l'entrada.
     */
    //entradasAReservar 20;
    //enrtadaslibres = 100;
    public static int reserva() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce el numero total de entradas libres:");
        numeroEntradasAReservar = sc.nextInt();
        int precioPorEntrada;
        if (numeroEntradasAReservar> 0 && numeroEntradasAReservar > entradasLibres ){
            return numeroEntradasAReservar =sc.nextInt();
        }else {
            precioPorEntrada = numeroEntradasAReservar * entrada;
        }
        return precioPorEntrada;
    }


}
