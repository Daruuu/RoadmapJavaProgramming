package examenpoo.problema01;

public class Camio extends Vehiculo{
    private String tamany;
    private int anyosExperiencia;
    private boolean sortirPais;

    public Camio() {
    }

    public Camio(String tamany, int anyosExperiencia, boolean sortirPais) {
        this.tamany = tamany;
        this.anyosExperiencia = anyosExperiencia;
        this.sortirPais = sortirPais;
    }

    public Camio(String model, int velocidad, int precioCompra, boolean vendido, String tamany, int anyosExperiencia, boolean sortirPais) {
        super(model, velocidad, precioCompra, vendido);
        this.tamany = tamany;
        this.anyosExperiencia = anyosExperiencia;
        this.sortirPais = sortirPais;
    }

    public String getTamany() {
        return tamany;
    }

    public void setTamany(String tamany) {
        this.tamany = tamany;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public boolean isSortirPais() {
        return sortirPais;
    }

    public void setSortirPais(boolean sortirPais) {
        this.sortirPais = sortirPais;
    }

    @Override
    public String toString() {
        return "Camio{" +
                "tamany='" + tamany + '\'' +
                ", anyosExperiencia=" + anyosExperiencia +
                ", sortirPais=" + sortirPais +
                '}';
    }
}
