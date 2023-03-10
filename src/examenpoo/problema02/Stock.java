package examenpoo.problema02;

import examenpoo.problema01.Vehiculo;

import java.util.ArrayList;
import java.util.Arrays;

public class Stock {
    private int presupuestoCompra;
    private int gastat;
    public ArrayList<Vehiculo> vehiculoList = new ArrayList<>();

    public Stock() {
        this.presupuestoCompra = 1000;
        this.gastat = 0;
    }

    public int getPresupuestoCompra() {
        return presupuestoCompra;
    }

    public void setPresupuestoCompra(int presupuestoCompra) {
        this.presupuestoCompra = presupuestoCompra;
    }

    public int getGastat() {
        return gastat;
    }

    public void setGastat(int gastat) {
        this.gastat = gastat;
    }

    public boolean comprarVehicle(Vehiculo vehiculo) {
        if (getPresupuestoCompra() > 0) {
            vehiculoList.add(vehiculo);
            setGastat(getPresupuestoCompra() - vehiculo.getPrecioCompra());
            return true;
        }
        return false;
    }

    public void inventari() {
        if (!vehiculoList.isEmpty()) {
            Arrays.asList(vehiculoList);
        }
    }

//    public void vendaVehicle()



    @Override
    public String toString() {
        return "Stock{" +
                "presupuestoCompra=" + presupuestoCompra +
                ", gasta=" + gastat +
                '}';
    }
}
