package practiceNewThings.lambda.Ejemplo1;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {
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

//    @Override
 //   public int compareTo(@NotNull Persona o) {
   //     return this.getNombre().compareTo(o.getNombre());
  //  }

    //methodo de una instancia
    public boolean estaJubilado() {
        return this.getEdad() < 65;

    }

    @Override
    public int compareTo(Persona o) {
        return 0;
    }
}