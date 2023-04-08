package topic4_collections.hashmap01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.programa();
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
        String dni1 = "dni1";
        Movil movil1 = new Movil("marca1", "modelo 1", "977543195");
        String dni2 = "dni222";
        Movil movil2 = new Movil("marca2", "modelo 2", "977543445");
        String dni3 = "dni33";
        Movil movil3 = new Movil("marca322", "modelo 3432", "977543423");
        im.movilHashMap.put(dni1, movil1);
        im.movilHashMap.put(dni2, movil2);
        im.movilHashMap.put(dni3, movil3);
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.print("Agregar un DNI: ");
                    sc.nextLine();
                    String dni = sc.nextLine();
                    if (dni == null) {
                        System.out.print("dni: ");
                        dni = sc.nextLine();
                    }
                    System.out.print("Agregar una movil\nmarca: ");
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
                    String numero = sc.nextLine();
                    if (numero == null) {
                        System.out.print("numero: ");
                        numero = sc.nextLine();
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
                    sc.nextLine();
                    String numeroMovil = sc.nextLine();
                    if (numeroMovil == null) {
                        numeroMovil = sc.nextLine();
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
