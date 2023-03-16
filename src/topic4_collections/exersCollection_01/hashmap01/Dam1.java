package topic4_collections.exersCollection_01.hashmap01;

import java.util.Scanner;

public class Dam1 {
    public static void main(String[] args) {
        Dam1 dam1 = new Dam1();
        dam1.programa();
    }

    public void opciones() {
        System.out.print("Opciones programa\n" +
                "[1]- Agregar un movil\n" +
                "[2]- Treure movil\n" +
                "[3]- Buscar un mòbil a partir d'un dni\n" +
                "[4]- Buscar un dni a partir del número de mòbil\n" +
                "elige opcion: ");
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        InventarioMoviles im = new InventarioMoviles();
        opciones();
        int opcion = sc.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    String dni1 = "dni1";
                    Movil movil1 = new Movil("marca1", "modelo 1", 977543195);
                    im.movilHashMap.put(dni1, movil1);

                    System.out.print("Agregar un DNI: ");
                    sc.nextLine();
                    String dni = sc.nextLine();
                    if (dni == null) {
                        System.out.print("dni: ");
                        dni = sc.nextLine();
                    }
                    System.out.print("Agregar una movil\nmarca: ");
//                    sc.nextLine();
                    String marca = sc.nextLine();
                    if (marca == null) {
                        System.out.print("marca: ");
                        marca = sc.nextLine();
                    }
                    System.out.print("modelo: ");
                    String modelo = sc.nextLine();
                    if (modelo == null) {
                        System.out.print("modelo: ");
                        modelo = sc.nextLine();
                    }
                    System.out.print("numero: ");
                    int numero = sc.nextInt();
                    if (numero == 0) {
                        System.out.print("numero: ");
                        numero = sc.nextInt();
                    }
                    Movil nuevoMovil = new Movil(marca, modelo, numero);
                    im.addMovil(dni, nuevoMovil);
                    System.out.println("Movil agregado correctamente!");
                    break;
                case 2:
                    System.out.print("Eliminar un Movil:\n introduce dni: ");
                    sc.nextLine();
                    String dniAEliminar = sc.nextLine();
                    if (dniAEliminar == null) {
                        dniAEliminar = sc.nextLine();
                    }
                    im.removeMovil(dniAEliminar);
                    break;
                case 3:
                    System.out.print("Buscar un Movil:\n introduce dni: ");
                    sc.nextLine();
                    String dniABuscar = sc.nextLine();
                    if (dniABuscar == null) {
                        dniABuscar = sc.nextLine();
                    }
                    im.buscarMovil(dniABuscar);
                    break;
                case 4:
                    System.out.print("Buscar un Movil:\n introduce numero: ");
                    int numeroMovil = sc.nextInt();
                    if (numeroMovil == 0) {
                        numeroMovil = sc.nextInt();
                    }
                    im.buscarDni(numeroMovil);
                    break;
                default:
                    System.out.println("opcion incorrecta!");
            }
            opciones();
            opcion = sc.nextInt();
        }
    }
}
