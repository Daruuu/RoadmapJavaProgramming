package topic4_collections.exersCollection_01.hashset02;

import java.util.Scanner;

public class ScrumMain {
    public static void main(String[] args) {
        Scrum scrum = new Scrum();

    }

    public int opciones(Scanner sc) {
        System.out.print("Opciones programa\n" +
                "[1]-Introduce una tasca\n" +
                "[2]- Pasar de TO BE DONE A DOING\n" +
                "[3]- Pasar de DOING a DONE\n" +
                "[4]- Mostrar estados de las Tareas\n" +
                "elige opcion: ");
        return sc.nextInt();
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        int opcion = opciones(sc);
        System.out.println(opcion);
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
                    System.out.println("opcion incorrecta!");
                    opciones(sc);
            }
        }
    }
}
