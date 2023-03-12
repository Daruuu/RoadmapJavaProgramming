package topic4_collections.exersCollection_01.hashmap01;

public class Dni {
    private String dni;

    public Dni() {
    }

    public Dni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Dni{" +
                "dni='" + dni + '\'' +
                '}';
    }
}