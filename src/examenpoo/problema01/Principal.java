package examenpoo.problema01;

import examenpoo.problema02.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cotxe cotxe1 = new Cotxe("citroen", 120, 930, false, 47000, "Italia");
        Cotxe cotxe2 = new Cotxe("ford", 210, 980, false, 65200, "Spain");

        Moto moto1 = new Moto("kawasaki", 260, 140, false, 27310, 10);
        Moto moto2 = new Moto(31420, 12);

        Camio camio1 = new Camio("man", 140, 870, false, "mitja", 9, true);
        Camio camio2 = new Camio("mercedez-benz", 180, 910, true, "gran", 6, true);

        Autobus autobus1 = new Autobus("scania", 140, 1100, false, 50);
        Autobus autobus2 = new Autobus("mercedez benz", 160, 900, true, 32);

        ArrayList<Vehiculo> vehiculosPendientes = new ArrayList<>();
        vehiculosPendientes.add(cotxe1);
        vehiculosPendientes.add(cotxe2);
        vehiculosPendientes.add(moto1);
        vehiculosPendientes.add(moto2);
        vehiculosPendientes.add(camio1);
        vehiculosPendientes.add(camio2);
        vehiculosPendientes.add(autobus1);
        vehiculosPendientes.add(autobus2);

    }

    public void menu() {
        System.out.print("Menu Programa\n" +
                "[1]- comprar vehiculo\n" +
                "[2]- imprimir inventario\n");
    }

    public void main() {
        Scanner sc = new Scanner(System.in);

        Stock stock1 = new Stock();

        Cotxe cotxe1 = new Cotxe("citroen", 120, 930, false, 47000, "Italia");
        Cotxe cotxe2 = new Cotxe("ford", 210, 980, false, 65200, "Spain");

        Moto moto1 = new Moto("kawasaki", 260, 140, false, 27310, 10);
        Moto moto2 = new Moto(31420, 12);

        Camio camio1 = new Camio("man", 140, 870, false, "mitja", 9, true);
        Camio camio2 = new Camio("mercedez-benz", 180, 910, true, "gran", 6, true);

        Autobus autobus1 = new Autobus("scania", 140, 1100, false, 50);
        Autobus autobus2 = new Autobus("mercedez benz", 160, 900, true, 32);

        ArrayList<Vehiculo> vehiculosPendientes = new ArrayList<>();
        vehiculosPendientes.add(cotxe1);
        vehiculosPendientes.add(cotxe2);
        vehiculosPendientes.add(moto1);
        vehiculosPendientes.add(moto2);
        vehiculosPendientes.add(camio1);
        vehiculosPendientes.add(camio2);
        vehiculosPendientes.add(autobus1);
        vehiculosPendientes.add(autobus2);

        menu();
        int opcion = sc.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    if (stock1.comprarVehicle(vehiculosPendientes.get(2)))

                        break;
                case 2:
                    break;
                default:
                    System.out.print("elige opcion correcta:");
            }
            opcion = sc.nextInt();
        }
    }
}
