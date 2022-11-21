package NoGit;

import java.util.Scanner;

public class api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaActual = sc.nextInt();
        int minutsActual = sc.nextInt();
        int segondsActual = sc.nextInt();

        int horaMotorista = sc.nextInt();
        int minutMotorista = sc.nextInt();
        int segonMotorista = sc.nextInt();

        int hora = (horaActual + horaMotorista) * 3600;
        int minuto = (minutsActual + minutMotorista) * 60;
        int segundos = (segondsActual + segonMotorista) % 60;

        int sumaSegonds = hora + minuto + segundos;
        int horaF = sumaSegonds / 3600;
        int segundosRestante = sumaSegonds % 3600;
        int minutoF = segundosRestante / 60;
        int segondF = segundosRestante % 60;
        System.out.println(horaF + ":" + minutoF + ":" + segondF);
    }
}
