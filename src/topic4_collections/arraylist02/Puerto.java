package topic4_collections.arraylist02;

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
                    System.out.println("introduce un nuevo vaixell:");
                    sc.nextLine();

                    System.out.print("nombre: ");
                    String nombre = sc.nextLine();
                    if (!nombre.equals("")) {
                        System.out.println("nombre correcto");
                    } else {
                        nombre = sc.nextLine();
                    }

                    System.out.print("preu: ");
                    int preu = sc.nextInt();
                    if (preu == 0) {
                        preu = sc.nextInt();
                    } else {
                        System.out.println("preu correcto");
                    }

                    System.out.print("edad: ");
                    int edad = sc.nextInt();
                    if (edad != 0) {
                        System.out.println("edad correcto");
                    } else {
                        edad = sc.nextInt();
                    }

                    Vaixell nuevoVaixell = new Vaixell(nombre, preu, edad);
                    introducirVaixell(nuevoVaixell);
                    break;
                case 3:
                    System.out.print("eliminar un vaixell:\nintroduce el nombre del vaixell: ");
                    sc.nextLine();
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
            System.out.println(v);
        } else {
            System.out.println("vaixell NO encontrado");
        }
    }

    public void modificarVaixell(String nombre) {
        Scanner sc = new Scanner(System.in);

        boolean encontrado = false;
        for (Vaixell v : vaixellList) {
            if (v.getNom().equals(nombre)) {
                System.out.println("Modificando vaixell: " + nombre);
                System.out.print("introduce nuevo nomrbe: ");
                v.setNom(sc.nextLine());
                System.out.print("introduce nuevo precio: ");
                v.setPreu(sc.nextInt());
                System.out.print("introduce nueva edad: ");
                v.setEdad(sc.nextInt());
                System.out.println("Vaixell modificado correctamente!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado)
            System.out.printf("Vaixell con nombre %s no encontrado\n", nombre);
    }

    public void eliminarVaixell(String nomVaixell) {
        for (Vaixell i : vaixellList) {
            if (!i.getNom().equals(nomVaixell)) {
                System.out.println("vaixell no encontrado!");
                break;
            } else {
                vaixellList.remove(i);
                System.out.println("Vaixell eliminado correctamente!");
                break;
            }
        }
    }

    public void listarVaixellsPorAntiguedad() {
        Collections.sort(vaixellList, new VaixellsPorAntiguedad());
        for (Vaixell v : vaixellList){
            System.out.println(v);
        }
    }

    public void listarVaixellsPorNombreYPreu() {
        Collections.sort(vaixellList, new VaixellsPorNombrePrecio());
        for (Vaixell v : vaixellList){
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "vaixellList=" + vaixellList +
                '}';
    }
}
