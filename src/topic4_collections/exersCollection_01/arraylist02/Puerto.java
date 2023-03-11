package topic4_collections.exersCollection_01.arraylist02;

import java.util.*;

public class Puerto {
    ArrayList<Vaixell> vaixellList;

    public Puerto() {
    }

    public Puerto(ArrayList<Vaixell> vaixellList) {
        this.vaixellList = vaixellList;
    }

    public ArrayList<Vaixell> getVaixellList() {
        return vaixellList;
    }

    public void setVaixellList(ArrayList<Vaixell> vaixellList) {
        this.vaixellList = vaixellList;
    }

    public void introducirVaixell(Vaixell vaixell) {
        vaixellList.add(vaixell);
        System.out.println("Vaixell agregado correctamente");
    }

    public void listarVaixells() {
        Iterator<Vaixell> itr = vaixellList.iterator();
        while (itr.hasNext()) {
            Vaixell v = itr.next();
            System.out.println(v.toString());
        }
    }

    public void buscarVaixell(Vaixell vaixell) {
        for (Vaixell v : vaixellList) {
            if (v.equals(vaixell))
                System.out.printf("Este vaixell %s existe", vaixell);
            else
                System.out.print("vaixell NO encontrado");
        }
    }

    public void modificarVaixell(String nombre) {
        Scanner sc = new Scanner(System.in);
        for (Vaixell v : vaixellList) {
            if (v.getNom().equals(nombre)) {
                System.out.println("introduce nuevo nomrbe: ");
//                String nuevoNom = sc.nextLine();
                v.setNom(sc.nextLine());
                System.out.println("introduce nuevo precio: ");
//                int nuevoPrecio = sc.nextInt();
                v.setPreu(sc.nextInt());
                System.out.println("introduce nueva edad: ");
//                int nuevaEdad = sc.nextInt();
                v.setEdad(sc.nextInt());
                System.out.println("Vaixell modificado correctamente");
            }
        }
        System.out.printf("Vaixell con nombre %s no encontrado", nombre);
    }

    public void eliminarVaixell(String nomVaixell) {
        Iterator<Vaixell> itr = vaixellList.iterator();

        while (itr.hasNext()) {
            Vaixell i = itr.next();
            if (i.getNom().equals(nomVaixell)) {
                vaixellList.remove(i);
                System.out.println("Vaixell eliminado correctamente");
            }
        }
        System.out.println("Vaixell NO encontrado");
    }

    public void listarVaixellsPorAntiguedad() {
        Collections.sort(vaixellList, new VaixellsPorAntiguedad());
    }

    public void listarVaixellsPorNombreYPreu() {
        Collections.sort(vaixellList, new VaixellsPorNombrePrecio());
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "vaixellList=" + vaixellList +
                '}';
    }
}
