package topic3_oop_programming.oop01.exer13;

/*
13. Anillo: Un obrador de joyería fabrica alianzas de matrimonio de oro.
De las alianzas nos interesa conocer su modelo,
el diámetro de paso de dedo D (mm) y
el diámetro de la sección del anillo d (mm).

Queremos determinar el peso del anillo (gr) ,
el precio del oro (€) empleado en su fabricación,
y el precio de venta del anillo a los mayoristas (€).

El coste de fabricación de la alianza sin tener en cuenta el valor del oro es de 40€,
el precio del oro es de 10 € el gramo,
el margen de beneficio es del 210% del coste total del anillo y
el peso específico del oro es de 19,3 gr/cm3

donde R = D/2, r = d/2 y el volumen del toro = 2*Pi2 *R*r2
 */
public class Anell {
    private String modelo;
    private double diametroDePaso;
    private double diametroSeccion;
    private final static int PRECIO_BASE = 40;
    private final int PRECIO_ORO_GRAMO = 10;

    public Anell(String modelo, double diametroDePaso, double diametroSeccion) {
        this.modelo = modelo;
        this.diametroDePaso = diametroDePaso;
        this.diametroSeccion = diametroSeccion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getDiametroDePaso() {
        return diametroDePaso;
    }

    public void setDiametroDePaso(double diametroDePaso) {
        this.diametroDePaso = diametroDePaso;
    }

    public double getDiametroSeccion() {
        return diametroSeccion;
    }

    public void setDiametroSeccion(double diametroSeccion) {
        this.diametroSeccion = diametroSeccion;
    }

    public int getPRECIO_ORO_GRAMO() {
        return PRECIO_ORO_GRAMO;
    }

    public double pesoAnilloGramo() {
        return 0;
    }

    public double precioOroGramoAnillo() {
        return 0;
    }

    public double precioVentaMayorista() {
        return 0;
    }

    @Override
    public String toString() {
        return "Anell{" +
                "modelo='" + modelo + '\'' +
                ", diametroDePaso=" + diametroDePaso +
                ", diametroSeccion=" + diametroSeccion +
                ", PRECIO_ORO_GRAMO=" + PRECIO_ORO_GRAMO +
                '}';
    }
}
