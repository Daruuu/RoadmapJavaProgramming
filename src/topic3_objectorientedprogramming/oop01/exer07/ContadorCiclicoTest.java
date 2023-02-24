package topic3_objectorientedprogramming.oop01.exer07;

import java.util.Scanner;

public class ContadorCiclicoTest {
    ContadorCiclico contadorCiclico = new ContadorCiclico();

    public static void main(String[] args) {
    }

    public int opciones(Scanner sc) {
        System.out.println("[1]- Poner el contador a 0 " +
                "[2]- Incrementar el valor del contador" +
                "[3]- Consultar el valor del contador" +
                "elige una opcion:\n");
        return sc.nextInt();
    }

    public void menuPrograma() {
        Scanner sc = new Scanner(System.in);
        int opcio = opciones(sc);
        while (opcio != 4) {
            if (opcio == 1) {
                contadorCiclico.reiniciarContador();
                opcio = sc.nextInt();
            }
            if (opcio == 2) {
                contadorCiclico.aumentarContador();
                opcio = sc.nextInt();
            }
            if (opcio == 3) {
                contadorCiclico.toString();
            }
        }
    }
}
