package scrum.sprintdao;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlVisitas extends Control {
    public static Scanner sc = new Scanner(System.in);

    ArrayList<Visitante> visitas;
    private int idVisita;

    public ControlVisitas(String horaEntrada, String horaSalida, ArrayList<Visitante> visitas, int idVisita) {
        super(horaEntrada, horaSalida);
        this.visitas = visitas;
        this.idVisita = idVisita;
    }

    public ControlVisitas() {
        super();
        this.visitas = new ArrayList<>();
        this.idVisita = 0;
    }

    public ArrayList<Visitante> getVisitas() {
        return visitas;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public void anadirVisita(ControlVisitas listadoVisitas) {

        /*fichaTecnica.toString();
        System.out.println("Ingresa el id de la reclusa a visitar");
        String idReclusa = sc.nextLine();
        Reclusa reclusa = fichaTecnica.getResultadoArchivo().get(idReclusa);
        if (reclusa==null){
            System.out.println("No existe reclusa con ese ID");
       }
        else {*/
        System.out.println("Introduce el dni de el visitante");
        String dni = sc.nextLine();
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu apellido");
        String apellido = sc.nextLine();
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la hora");
        String horaEntrada = sc.nextLine();
        setHoraEntrada(horaEntrada);
        System.out.println("Introduce hora de salida");
        String horaSalida = sc.nextLine();
        setHoraSalida(horaSalida);
        Visitante visitante = new Visitante(nombre, apellido, edad, dni);
        contadorVisitas();
        visitas.add(visitante);
    }

    public int contadorVisitas() {
        return ++idVisita;
    }

    public void eliminarVisita(ControlVisitas listadoVisita) {
        System.out.println(listadoVisita.toString());
        System.out.println("Introduce el id que desas eliminar");
        String eliminarVisita = sc.nextLine();
        for (Visitante v : visitas) {
            if (v.getDni().equals(eliminarVisita)) {
                visitas.remove(v);
                System.out.println("Visita eliminada");

            } else {
                System.out.println("Id no encontrado");
            }
        }
    }

    public void modificarVisita(ControlVisitas listadoVisita) {
        System.out.println(listadoVisita.toString());
        System.out.println("Introduce el id de la visita a modificar");
        String modificarVisita = sc.nextLine();
        for (Visitante v : visitas) {
            if (v.getDni().equals(modificarVisita)) {
                System.out.println("Introduce el nuevo id");
                v.setDni(sc.next());
                System.out.println("Introduce el nuevo nombre");
                v.setNombre(sc.next());
                System.out.println("Introduce el nuevo apellido");
                v.setApellido(sc.next());
                System.out.println("Introduce la nueva edad");
                sc.nextLine();
                v.setEdad(sc.nextInt());
                System.out.println("Introduce la nueva hora");
                setHoraEntrada(sc.next());
                System.out.println("Introduce la nueva hora de salida");
                setHoraSalida(sc.next());
            }
        }


    }

    public static void main(String[] args) {
        ControlVisitas listadoVisitas = new ControlVisitas();
        listadoVisitas.anadirVisita(listadoVisitas);
        System.out.println(listadoVisitas);
        listadoVisitas.modificarVisita(listadoVisitas);
        System.out.println(listadoVisitas);
        listadoVisitas.anadirVisita(listadoVisitas);
        listadoVisitas.eliminarVisita(listadoVisitas);
        System.out.println(listadoVisitas);
    }

    public String toString() {
        System.out.println("--------------------------------------------------\n");
        System.out.println("             Control de Visitas                    \n");
        System.out.println("--------------------------------------------------\n");
        System.out.println("IDvisita | Dni | Nombre y Apellido | Edad | Entrada | Salida \n");
        System.out.println("--------------------------------------------------\n");
        for (Visitante v : visitas) {
            System.out.println(idVisita + "   |   " + v.getDni() + "   |   " + v.getNombre() + " " + v.getApellido()
                    + " | " + v.getEdad() + "  |   " + getHoraEntrada() + "     |     " + getHoraSalida());

        }
        System.out.println("--------------------------------------------------\n");
        return "";
    }

}
