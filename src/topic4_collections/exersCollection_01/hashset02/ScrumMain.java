package topic4_collections.exersCollection_01.hashset02;

import java.util.Scanner;

public class ScrumMain {
    public static void main(String[] args) {
        ScrumMain scrumMain = new ScrumMain();
        scrumMain.programa();

    }

    public void opciones() {
        System.out.print("Opciones programa\n" +
                "[1]-Introduce una tasca\n" +
                "[2]- Pasar de TO BE DONE A DOING\n" +
                "[3]- Pasar de DOING a DONE\n" +
                "[4]- Mostrar estados de las Tareas\n" +
                "elige opcion: ");
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        Scrum scrum = new Scrum();
        opciones();
        int opcion = sc.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    Tarea t1 = new Tarea("tarea 1", "descrip 1", "to be done");
                    Tarea t2 = new Tarea("tarea 2", "descrip 2 asfgasdf", "to be done");
                    Tarea t3 = new Tarea("tarea 3", "descrip 33333", "done");
                    Tarea t4 = new Tarea("tarea 4", "descrip 4", "doing");
                    scrum.agregarTarea(t1);
                    scrum.agregarTarea(t2);
                    scrum.agregarTarea(t3);
                    scrum.agregarTarea(t4);
                    System.out.print("Agregar una nueva tarea\nnombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    if (nombre == null) {
                        nombre = sc.nextLine();
                    }
                    System.out.print("descripcion: ");
                    String descripcion = sc.nextLine();
                    if (descripcion == null) {
                        descripcion = sc.nextLine();
                    }
                    System.out.print("estado: ");
                    String estado = sc.nextLine();
                    if (estado == null) {
                        System.out.print("estado: ");
                        estado = sc.nextLine();
                    }
                    Tarea nuevaTarea = new Tarea(nombre, descripcion, estado);
                    System.out.println("Tarea nueva agregada!");
                    scrum.agregarTarea(nuevaTarea);
                    break;
                case 2:
                    System.out.println("TO BE DONE a DOING:");
                    String nombreTarea = sc.nextLine();
                    if (nombreTarea == null) {
                        nombreTarea = sc.nextLine();
                    }
                    String nuevoEstado = sc.nextLine();
                    if (nuevoEstado == null) {
                        nuevoEstado = sc.nextLine();
                    }
                    scrum.moverTarea(nombreTarea, nuevoEstado);
                    break;
                case 3:
                    System.out.println("DOING a DONE:");
                    String nTarea = sc.nextLine();
                    if (nTarea == null) {
                        nTarea = sc.nextLine();
                    }
                    String nEstado = sc.nextLine();
                    if (nEstado == null) {
                        nEstado = sc.nextLine();
                    }
                    scrum.moverTarea(nTarea, nEstado);
                    break;
                case 4:
                    scrum.mostrarEstados();
                    break;
                default:
                    System.out.println("opcion incorrecta!");
            }
            opciones();
            opcion = sc.nextInt();
        }
    }
}
