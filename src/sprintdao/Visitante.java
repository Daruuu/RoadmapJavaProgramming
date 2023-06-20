package scrum.sprintdao;

import scrum.sprintdao.proyectofinal.modelo.Persona;

public class Visitante extends Persona {

    private String dni;

    public Visitante(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Visitante(String nombre, String apellido, int edad, String dni) {
        super(nombre, apellido, edad);
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Visitante{" +
                "dni='" + dni + '\'' +
                '}';
    }
}

