package topic4_collections.exersCollection_01.arraylist02;

import java.util.*;

public class Puerto {
    private ArrayList<Vaixell> vaixellList;

    public static void main(String[] args) {
        Puerto puerto = new Puerto();
        puerto.programa();
    }

    public void menu() {
        System.out.print("[1]- listar vaixells\n" +
                "[2]- introduir vaixells\n" +
                "[3]- eliminar vaixells\n" +
                "[4]- buscar vaixell\n" +
                "[5]- modificar vaixell\n" +
                "[6]- listar por antiguedad(viejo a nuevo)\n" +
                "[7]- listar por nombre y precio(caro a barato\n" +
                "elige una opcion: ");
    }

    public void programa() {
        Scanner sc = new Scanner(System.in);
        vaixellList = new ArrayList<>();
        Vaixell v1 = new Vaixell("barco 1", 16250, 7);
        Vaixell v2 = new Vaixell("barco 2", 25000, 9);
        Vaixell v3 = new Vaixell("barco 3", 15200, 7);
        Vaixell v4 = new Vaixell("barco 4", 11000, 4);
        Vaixell v5 = new Vaixell("barco 5", 9000, 2);
        vaixellList.add(v1);
        vaixellList.add(v2);
        vaixellList.add(v3);
        vaixellList.add(v4);
        vaixellList.add(v5);
        menu();
        int opcion = sc.nextInt();
        while (opcion != 8) {
            switch (opcion) {
                case 1:
                    listarVaixells();
                    break;
                case 2:
                    System.out.println("introudce un nuevo vaixell:");
                    sc.nextLine();
                    Vaixell nuevoVaixell = new Vaixell(sc.nextLine(), sc.nextInt(), sc.nextInt());
                    introducirVaixell(nuevoVaixell);
                    break;
                case 3:
                    System.out.print("eliminar un vaixell:\nintroduce el nombre del vaixell: ");
                    String nombreVaixell = sc.nextLine();
                    eliminarVaixell(nombreVaixell);
                    break;
                case 4:
                    System.out.print("Buscar vaixell por indice: ");
                    buscarVaixell(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Modificar vaixell:\nintroduce el nombre dle vaixell: ");
                    sc.nextLine();
                    modificarVaixell(sc.nextLine());
                    break;
                case 6:
                    listarVaixellsPorAntiguedad();
                    break;
                case 7:
                    listarVaixellsPorNombreYPreu();
                    break;
                default:
                    System.out.println("introudce opcion correcta");
                    break;
            }
            System.out.print("elige una opcion: ");
            opcion = sc.nextInt();
        }
        sc.close();
    }

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
        for (Vaixell v : vaixellList) {
            System.out.println(v.toString());
        }
    }

    public void buscarVaixell(int indice) {
        if (indice >= 0 && indice < vaixellList.size()) {
            Vaixell v = vaixellList.get(indice);
            System.out.printf("Este vaixell %s existe\n", v);
        } else {
            System.out.println("vaixell NO encontrado");
        }
    }

    public void modificarVaixell(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Modificando vaixell " + nombre);
        boolean encontrado = false;
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
                encontrado = true;
                break;
            }
        }
        if (!encontrado)
            System.out.printf("Vaixell con nombre %s no encontrado\n", nombre);
    }

    public void eliminarVaixell(String nomVaixell) {
        vaixellList.removeIf(v -> v.getNom().equals(nomVaixell));
        System.out.println("Vaixell eliminado correctamente");
        /*for (Vaixell i : vaixellList) {
            if (i.getNom().equals(nomVaixell)) {
                vaixellList.remove(i);
                break;
            }
        }
         */
    }

    public void listarVaixellsPorAntiguedad() {
        Collections.sort(vaixellList, new VaixellsPorAntiguedad());
    }

    public void listarVaixellsPorNombreYPreu() {
        Collections.sort(vaixellList, new VaixellsPorNombrePrecio());
    }

    @Override
    public String toString() {
/*
        StringBuilder sb = new StringBuilder();
        for (Vaixell v : vaixellList)
            sb.append(v.toString()).append("\n");
        return sb.toString();
*/
        return "Puerto{" +
                "vaixellList=" + vaixellList +
                '}';
    }
}
