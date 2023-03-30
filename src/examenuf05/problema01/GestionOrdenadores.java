package examenuf05.problema01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestionOrdenadores {
    private ArrayList<Ordenador> ordinadorsArraylist;

    public GestionOrdenadores() {
        this.ordinadorsArraylist = new ArrayList<>();
    }

    public GestionOrdenadores(ArrayList<Ordenador> ordinadorsArraylist) {
        this.ordinadorsArraylist = ordinadorsArraylist;
    }

    public ArrayList<Ordenador> getOrdinadorsArraylist() {
        return ordinadorsArraylist;
    }

    public void setOrdinadorsArraylist(ArrayList<Ordenador> ordinadorsArraylist) {
        this.ordinadorsArraylist = ordinadorsArraylist;
    }

    public void agregarOrdenador(Ordenador ordenador) {
        ordinadorsArraylist.add(ordenador);
        System.out.println("agregado correctamente!");
    }

    public void listarOrdenadores() {
        for (Ordenador ordenador : ordinadorsArraylist) {
            System.out.println(ordenador);
        }
    }

    public void buscarOrdenadorPorMac(String mac) {
        boolean encontrado = false;
        for (Ordenador o : ordinadorsArraylist) {
            if (o.getMac().equals(mac)) {
                System.out.println("indice numero ->" + ordinadorsArraylist.indexOf(o));
                encontrado = true;
            }
        }
        if (!encontrado)
            System.out.printf(" Ordenador con %s no encontrado.", mac);
    }

    public void ordenarPorPrecio(){
        Collections.sort(ordinadorsArraylist, new ComparatorPorPrecio());
    }


    public void menuOpciones() {
        System.out.print("[1]- Agregar ordenador\n" +
                "[2]- listar ordenadores\n" +
                "[3]- buscar ordenador por MAC\n" +
                "elige una opcion: ");
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        menuOpciones();
        int opcion = sc.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.println("Agregar nuevo ordenador:");
                    System.out.print("mac: ");
                    sc.nextLine();
                    String mac = sc.nextLine();
                    System.out.print("modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("precio: ");
                    int precio = sc.nextInt();
                    Ordenador nuevoOrdenador = new Ordenador(mac, modelo, precio);
                    agregarOrdenador(nuevoOrdenador);
                    break;
                case 2:
                    System.out.println("listar odenadores");
                    listarOrdenadores();
                    break;
                case 3:
                    System.out.print("Introduce la MAC: ");
                    sc.nextLine();
                    String macABuscar = sc.nextLine();
                    buscarOrdenadorPorMac(macABuscar);
                    break;
                default:
                    System.out.println("introduce opcion correcta!");
            }
            menuOpciones();
            opcion = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        GestionOrdenadores go = new GestionOrdenadores();
        Ordenador o1 = new Ordenador("00120", "Asus", 990);
        Ordenador o2 = new Ordenador("00130", "Lenovo", 1100);
        Ordenador o3 = new Ordenador("00142", "Acer", 1400);
        Ordenador o4 = new Ordenador("00214", "Huawei", 1380);
        go.ordinadorsArraylist.add(o1);
        go.ordinadorsArraylist.add(o2);
        go.ordinadorsArraylist.add(o3);
        go.ordinadorsArraylist.add(o4);
        go.programa();
    }

    @Override
    public String toString() {
        return "GestionOrdenadores{" +
                "ordinadorsArraylist=" + ordinadorsArraylist +
                '}';
    }
}
