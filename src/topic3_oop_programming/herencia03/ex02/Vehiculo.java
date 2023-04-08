package topic3_oop_programming.herencia03.ex02;

public class Vehiculo {
    private String matricula;

    public Vehiculo() {
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }




    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
