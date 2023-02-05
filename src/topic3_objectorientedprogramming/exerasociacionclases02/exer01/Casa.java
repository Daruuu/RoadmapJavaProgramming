package topic3_objectorientedprogramming.exerasociacionclases02.exer01;

/*
- La casa tendrá los siguientes atributos de la clase:
superficie(double),
dirección(String),
salaCasa(tipo Sala) y
cocinaCasa (tipo Cocina).
Define un constructor por la clase Casa que establezca unos valores por defecto en los atributos simples
y que cree nuevos objetos por los atributos Objeto.
 */
public class Casa {
    private double superficie;
    private String direccion;
    private Sala salaCasa;
    private Cocina cocinaCasa;

    public Casa(double superficie, String direccion, Sala salaCasa, Cocina cocinaCasa) {
        this.superficie = superficie;
        this.direccion = direccion;
        this.salaCasa = salaCasa;
        this.cocinaCasa = cocinaCasa;
    }

    public Casa() {
        this.superficie = 120;
        this.direccion = "direccion 0";
        this.salaCasa = new Sala();
        this.cocinaCasa = new Cocina();
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Sala getSalaCasa() {
        return salaCasa;
    }

    public void setSalaCasa(Sala salaCasa) {
        this.salaCasa = salaCasa;
    }

    public Cocina getCocinaCasa() {
        return cocinaCasa;
    }

    public void setCocinaCasa(Cocina cocinaCasa) {
        this.cocinaCasa = cocinaCasa;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "superficie=" + superficie +
                ", direccion='" + direccion + '\'' +
                ", salaCasa=" + salaCasa +
                ", cocinaCasa=" + cocinaCasa +
                '}';
    }
}
