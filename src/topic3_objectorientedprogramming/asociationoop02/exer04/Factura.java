package topic3_objectorientedprogramming.asociationoop02.exer04;

import java.util.ArrayList;
import java.util.Scanner;

public class Factura {
    private ArrayList<Cliente> clientesArrayList;

    public ArrayList<Cliente> getClientesArrayList() {
        return clientesArrayList;
    }

    public void setClientesArrayList(ArrayList<Cliente> clientesArrayList) {
        this.clientesArrayList = clientesArrayList;
    }

    public static void main(String[] args) {

    }

    public int menuPrograma(Scanner sc) {
        System.out.print("Menu:\n" +
                "[1]- Afegir un cliente\n" +
                "[2]- Afegir una trucada a un cliente\n" +
                "[3]- Mostrar en detalle la factura de un cliente\n" +
                "[4]- Listar todos los clientes,DNI,nom\n" +
                "Elige una opcion: ");
        return sc.nextInt();
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        int opcion = menuPrograma(sc);
        while (opcion != 5) {
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    break;
                default:
                    System.out.print("Introduce una opcion correcta:");
            }
            opcion = sc.nextInt();
        }
    }
}
