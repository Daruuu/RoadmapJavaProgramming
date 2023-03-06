import java.util.Date;

public class Vehicle {
    protected String matricula;
    protected final float preuBase = 10;
    protected int dies;

    public Vehicle(String matricula, int dies) {
        this.matricula = matricula;
        this.dies = dies;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getPreuBase() {
        return preuBase;
    }

    public int getDies() {
        return dies;
    }

    public void setMatricula(String matricula) {this.matricula = matricula;}

    public void setDies(int dies) {
        this.dies = dies;
    }

    public float getPreu(){
        return dies * preuBase;
    }

    @Override
    public String toString() {
        return "Vehicle:" + "\n" +
                "matricula = " + matricula + "\n" +
                "preuBase = " + preuBase + "\n" +
                "dies = " + dies;
    }
}
