package topic4_collections.exersCollection_01.hashmap02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.programa();
    }

    public void opciones() {
        System.out.print("Opciones programa\n" +
                "[1]- Introducir jugadores" +
                "[2]- Buscar un jugador por Dorsal\n" +
                "[3]- Buscar un jugador por nombre\n" +
                "[4]- Listar jugadores ordenados por numero\n" +
                "[5]- Listar jugadores por edad\n" +
                "[6]- Listar jugadores por posicion\n" +
                "elige opcion: ");
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        EquipoFutbol equipoFutbol = new EquipoFutbol();

        opciones();
        int opcion = sc.nextInt();

        while (opcion != 8) {
            switch (opcion) {
                case 1:
                    System.out.print("Agregar un Dorsal\ndorsalABuscar: ");
                    int dorsal = sc.nextInt();
                    if (dorsal == 0) {
                        System.out.print("dorsalABuscar: ");
                        dorsal = sc.nextInt();
                    }
                    System.out.print("Agregar una Jugador\nnombre: ");
                    String nombre = sc.nextLine();
                    if (nombre == null) {
                        System.out.print("nombre: ");
                        nombre = sc.nextLine();
                    }
                    System.out.print("edad: ");
                    int edad = sc.nextInt();
                    if (edad < 12) {
                        System.out.print("edad no valida\nedad: ");
                        edad = sc.nextInt();
                    }
                    System.out.print("posicion: ");
                    String posicion = sc.nextLine();
                    if (posicion == null) {
                        System.out.print("posicion: ");
                        posicion = sc.nextLine();
                    }
                    Dorsal dorsal1 = new Dorsal(dorsal);
                    Jugador jugador1 = new Jugador(nombre, edad, posicion);
                    equipoFutbol.addJugadorHashMap(dorsal1, jugador1);
                    System.out.println("Jugador agregado correctamente!");
                    break;
                case 2:
                    System.out.println("Buscar jugador por Dorsal");
                    System.out.println();
                    System.out.print("dorsal: ");
                    int dorsalABuscar = sc.nextInt();
                    if (dorsalABuscar == 0) {
                        System.out.print("dorsal: ");
                        dorsalABuscar = sc.nextInt();
                    }
                    Dorsal dBuscar = new Dorsal(dorsalABuscar);
                    equipoFutbol.searchJugadorPorDorsal(dBuscar);
                    break;
                case 3:
                    System.out.println("Buscar jugador por nombre");
                    System.out.println();
                    System.out.print("nombre: ");
                    String nombreABuscar = sc.nextLine();
                    if (nombreABuscar == null) {
                        System.out.print("nombre: ");
                        nombreABuscar = sc.nextLine();
                    }
                    equipoFutbol.searchJugadorPorNombre(nombreABuscar);
                    break;
                case 4:
                    System.out.print("Listar Jugadores ordenados por numero");
                    System.out.println();
                    equipoFutbol.listarOrdenat();
                    break;
                case 5:
                    System.out.print("Listar Jugadores por edad");
                    System.out.println();
                    equipoFutbol.listarPorEdad();
                    break;
                case 6:
                    System.out.print("Listar Jugadores por posicion usando Comparator");
                    System.out.println();
                    equipoFutbol.listarPorPosicionComparator();
                    break;
                case 7:
                    System.out.print("Listar Jugadores por posicion usando Stream");
                    System.out.println();
                    equipoFutbol.listarPorPosicionStream();
                    break;
                default:
                    System.out.println("opcion incorrecta!");
            }
            opciones();
            opcion = sc.nextInt();
        }
    }
}
