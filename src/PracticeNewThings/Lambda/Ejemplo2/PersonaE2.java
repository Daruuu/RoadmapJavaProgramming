package PracticeNewThings.Lambda.Ejemplo2;

import PracticeNewThings.Lambda.Persona;
import org.jetbrains.annotations.NotNull;

public class PersonaE2 implements Comparable<PersonaE2> {
    private String nombre;
    private String apellidos;
    private int edad;

    public PersonaE2(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public PersonaE2() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(@NotNull PersonaE2 o) {
        return this.getNombre().compareTo(o.getNombre());
    }


}
