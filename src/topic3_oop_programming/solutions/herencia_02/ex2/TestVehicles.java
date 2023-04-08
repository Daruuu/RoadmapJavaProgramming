import java.util.ArrayList;

public class TestVehicles {

    public static void main(String[] args) {
        Vehicle cotxe = new Cotxe("xxx", 10, 4);
        Vehicle furgoneta = new FurgonetaCarrega("xxx", 10, 10);
        Vehicle camio = new Camio("xxx", 10, 4);
        Vehicle microbus = new Microbus("xxx", 10, 15);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(cotxe);
        vehicles.add(furgoneta);
        vehicles.add(camio);
        vehicles.add(microbus);

        for (Vehicle v: vehicles) {
            if(v instanceof Cotxe){
                Cotxe c = (Cotxe)v;
                System.out.println(c+"\n");
            }
            if(v instanceof FurgonetaCarrega){
                FurgonetaCarrega f = (FurgonetaCarrega)v;
                System.out.println(f+"\n");
            }
            if(v instanceof Camio){
                Camio ca = (Camio)v;
                System.out.println(ca+"\n");
            }
            if(v instanceof Microbus){
                Microbus m = (Microbus)v;
                System.out.println(m+"\n");
            }

        }


    }
}
