package topic3_objectorientedprogramming.objetos01.exer01;

/*
1. Crea una classe Cotxe que tingui els atributs model i matrícula, i els corresponents mètodes set i get per a cada un.
Crea una altra classe CotxeTest amb un main on es creïn 2 objectes de tipus Cotxe i es provin els seus mètodes set i get.
 */
public class Cotxe {
    private String model;
    private String matricula;

    public Cotxe(String model, String matricula) {
        this.model = model;
        this.matricula = matricula;
    }

    public Cotxe() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "model='" + model + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
