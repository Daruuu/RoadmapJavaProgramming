package sprintdao;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlPatio extends Control {
    private int id;
    private String dni;
    public final String HORA_REGRESO_PATIO = "12:00";

    ArrayList<ControlPatio> controlDePatios;

    public ControlPatio(String horaEntrada,String horaSalida, int id, String dni) {
        super(horaEntrada,horaSalida);
        this.id = id;
        this.dni = dni;
        this.controlDePatios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ControlPatio{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                '}';
    }

    //codigo en proceso

    public void controlDePatioDeReclusas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora de regreso :");
        String horaDeRegreso = sc.nextLine();

        ArrayList<ControlPatio> regresoATiempo = new ArrayList<>();

        ArrayList<ControlPatio> regresoTarde = new ArrayList<>();


       /* for (ControlPatio control : controlDePatios) {
            if (!HORA_REGRESO_PATIO.compareTo(horaDeRegreso)<=0) {
                regresoATiempo.add(control);
            } else {
                regresoTarde.add(control);
            }
        }*/
        System.out.println("Reclusas que regresaron a tiempo:");
        for (int i = 0; i < regresoATiempo.size(); i++) {
            System.out.println(regresoATiempo.get(i) + "");

        }
        System.out.println("Reclusas que regresaron tarde:");
        for (int i = 0; i < regresoTarde.size(); i++) {
            System.out.println(regresoTarde.get(i));
        }
    }
}