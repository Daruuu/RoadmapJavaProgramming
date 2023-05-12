package scrum.sprintdao;

import java.io.IOException;
import java.util.*;

public class WadRasMain {
    //DNI
    private HashMap<String, Reclusa> reclusasHashMap;
    private FichaTecnica fichaTecnica;
    static Scanner read = new Scanner(System.in);

    public WadRasMain() {
        this.reclusasHashMap = new HashMap<String, Reclusa>();
        this.fichaTecnica = new FichaTecnica();
    }

    public WadRasMain(HashMap<String, Reclusa> reclusasHashMap, FichaTecnica fichaTecnica) {
        this.reclusasHashMap = reclusasHashMap;
        this.fichaTecnica = fichaTecnica;
    }

    public HashMap<String, Reclusa> getReclusasHashMap() {
        return reclusasHashMap;
    }

    public void setReclusasHashMap(HashMap<String, Reclusa> reclusasHashMap) {
        this.reclusasHashMap = reclusasHashMap;
    }

    public FichaTecnica getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(FichaTecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }

    public static void main(String[] args) throws IOException {
        WadRasMain wadRasMain = new WadRasMain();
        wadRasMain.menuWadRas();
    }

    public void menuWadRas() throws IOException {
        boolean salir = false;
        ControlVisitas listadoVisitas = new ControlVisitas();
        while (!salir) {
            int opcion = opcionesMenuWadRas();
            switch (opcion) {
                case 1:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 1:\033[0m");
                    linea();
                    fichaTecnica.importarDatosCSV();
                    reclusasHashMap = fichaTecnica.getResultadoArchivo();
                    linea();
                    break;
                case 2:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 2:\033[0m");
                    linea();
                    listarReclusasHashMap();
                    linea();
                    break;
                case 3:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 3:\033[0m");
                    linea();
                    System.out.print("Cantidad de reclusas a agregar: ");
                    int cantidad = read.nextInt();
                    agregarReclusa(cantidad);
//                    fichaTecnica.agregarNuevasReclusasCSV(cantidad, reclusasHashMap);
                    linea();
                    break;
                case 4:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 4:\033[0m");
                    linea();
                    listarReclusasHashMap();
                    linea();
                case 5:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 5:\033[0m");
                    linea();
                    System.out.println("introduce dni:");
                    read.nextLine();
                    String dniKey = read.nextLine();
                    buscarReclusaDni(dniKey);
                    linea();
                    break;
                case 6:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 6:\033[0m");
                    linea();
                    System.out.print("introduce dni:");
                    read.nextLine();
                    // modificar por id
                    String dniAModificar = read.nextLine();
                    modificaReclusa(dniAModificar);
                    linea();
                    break;
                case 7:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 7:\033[0m");
                    linea();
                    System.out.print("Introduce dni de reclusa: ");
                    read.nextLine();
                    String dni = read.nextLine();
                    eliminaReclusa(dni);
                    linea();
                    break;
                case 8:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 8:\033[0m");
                    linea();

                    linea();
                    break;
                case 9:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 9:\033[0m");
                    linea();

                    linea();
                    break;
                case 10:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 10:\033[0m");
                    linea();
                    listadoVisitas.anadirVisita(listadoVisitas);
                    linea();
                    break;
                case 11:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 11:\033[0m");
                    linea();
                    listadoVisitas.eliminarVisita(listadoVisitas);
                    linea();
                    break;
                case 12:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 12:\033[0m");
                    linea();
                    listadoVisitas.modificarVisita(listadoVisitas);
                    linea();
                    break;
                case 13:
                    System.out.println("\033[36mSELECCIONASTE LA OPCION 13:\033[0m");
                    linea();
                    System.out.println(listadoVisitas);
                    linea();
                    break;
                case 14:
                    System.out.println("----------FIN DEL PROGRAMA----------");
                    salir = true;
                    break;
                default:
                    System.out.println("SELECCIONA UNA OPCION CORRECTA:");
            }
        }
    }

    public int opcionesMenuWadRas() {
        System.out.print("\033[35mGESTION DE LA PRISION WADRAS\033[0m\n" +
                "[1]- CARGAR DATOS DESDE CSV\n" +
                "[2]- LISTAR RECLUSAS CSV\n" +
                "[3]- INTRODUCIR NUEVAS RECLUSAS\n" +
                "[4]- LISTAR CSV + NUEVAS RECLUSAS\n" +
                "[5]- BUSCAR RECLUSA POR DNI\n" +
                "[6]- MODIFICAR RECLUSA POR ATRIBUTO\n" +
                "[7]- ELIMINAR RECLUSA POR DNI\n" +
                "[8]- RECLUSAS DE 3R GRADO QUE PUEDEN SALIR AL PATIO\n" +
                "[9]- CONTROL ENTRADA Y SALIDA DE LAS RECLUSAS\n" +
                "[10]- AGREGAR CONTROL DE VISITAS FAMILIARES/AMIGOS DE LAS RECLUSAS\n" +
                "[11]- ELIMINAR CONTROL DE VISITAS FAMILIARES/AMIGOS DE LAS RECLUSAS\n"+
                "[12]- MODIFICAR CONTROL DE VISITAS FAMILIARES/AMIGOS DE LAS RECLUSAS\n"+
                "[13]- LISTA DE VISITAS FAMILIARES/AMIGOS DE LAS RECLUSAS\n"+
                "[14]- FINALIZA PROGRAMA\n" +
                "INTRODUCE UNA OPCION: ");
        return read.nextInt();
    }

    public static void linea() {
        System.out.println("\033[36m--------------------------------\033[0m");
    }

    public void listarReclusasHashMap() {
        for (Map.Entry<String, Reclusa> entry : reclusasHashMap.entrySet()) {
            String dniKey = entry.getKey();
            Reclusa reclusa = entry.getValue();
            System.out.println("DNI: " + dniKey + "\nReclusa: " + reclusa.toString());
        }
    }

    public void agregarReclusa(int cantidad) throws InputMismatchException {
        int i = 0;
        while (i < cantidad) {
            System.out.print("Introduce el DNI: ");
            read.nextLine();
            String dni = read.nextLine();
            if (dni == null) {
                dni = read.nextLine();
            }
            System.out.print("Introduce el nombre de la reclusa: ");
            String nombre = read.nextLine();
            System.out.print("Introduce el apellido de la reclusa: ");
            String apellido = read.nextLine();

            System.out.print("Introduce la edad de la reclusa: ");
            int edad = read.nextInt();
            if (edad < 0 || edad > 100) {
                throw new InputMismatchException("La edad no es valida/ fuera de rango!");
            }

            System.out.print("Introduce el grado de la reclusa: ");
            int grado = read.nextInt();
            if (grado < 1 || grado > 5) {
                throw new InputMismatchException("El grado esta fuera de rango!!");
            }

            System.out.print("Introduce el dia de visita de la reclusa: ");
            int diaVisita = read.nextInt();
            if (diaVisita < 1 || diaVisita > 5) {
                throw new InputMismatchException("Numero de dia invalido");
            }
            Reclusa nuevaReclusa = new Reclusa(nombre, apellido, edad, grado, diaVisita);
            reclusasHashMap.put(dni, nuevaReclusa);
            i++;
            //read.nextLine();    // consume la linea siguiente dado que agregamos un numero
        }
        if (cantidad != 1)
            System.out.println(i + " reclusas agregadas!");
        else
            System.out.println(i + " reclusa agregada!");
    }

    public void modificaReclusa(String dni) throws IllegalArgumentException {

        System.out.println("Reclusa : " + fichaTecnica.getResultadoArchivo().get(dni));
        int respuesta = 0;
        do {
            System.out.println("""
                    Que desea modificar? :
                    1.Nombre
                    2.Apellido
                    3.Edad
                    4.Grado
                    5.Dia Visita
                    6.Volver al menu principal
                    7.Salir del programa""");
            try {
                respuesta = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero valido.");
                read.nextLine();
                continue;
            }
            read.nextLine();
            switch (respuesta) {
                case 1:
                    System.out.print("Ingresa nuevo nombre: ");
                    String nombre = read.nextLine();
                    fichaTecnica.getResultadoArchivo().get(dni).setNombre(nombre);
                    System.out.println("Nombre modificado");
                    break;
                case 2:
                    System.out.println("Ingresa apellido : ");
                    String apellido = read.nextLine();
                    fichaTecnica.getResultadoArchivo().get(dni).setApellido(apellido);
                    System.out.println("Apellido modificado");
                    break;
                case 3:
                    System.out.println("Ingresa edad : ");
                    reclusasHashMap.get(dni).setEdad(read.nextInt());
                    System.out.println("Edad modificado");
                    break;
                case 4:
                    System.out.println("Ingresa grado");
                    reclusasHashMap.get(dni).setGrado(read.nextInt());
                    System.out.println("Grado modificado");
                    break;
                case 5:
                    System.out.println("Ingresa dia de visita");
                    reclusasHashMap.get(dni).setDiaVisita(read.nextInt());
                    System.out.println("Dia de visita modificado");
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("No existe opcion a modificar");
            }
        } while (respuesta != 7);
    }

    public void buscarReclusaDni(String dni) {
        if (reclusasHashMap.containsKey(dni))
            System.out.println("Reclusa encontrada: " + reclusasHashMap.get(dni));
        else
            System.out.printf("Reclusa con DNI: %s no encontrado\n", dni);
    }

    public void eliminaReclusa(String dni) {
        if (reclusasHashMap.containsKey(dni)){
            reclusasHashMap.remove(dni);
            System.out.println("Reclusa con " + dni + " eliminada");
        }else System.out.println("No hay una reclusa con este dni");
    }

    public void listarReclusasPorAtributo() {

        System.out.println("Por que parámetro desea usted ordenar la lista de reclusas?");
        System.out.println("1. Id\n2. Nombre\n3. Edad");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1 -> {
                try {
                    reclusasHashMap.keySet().stream().sorted().forEach(
                            id -> System.out.println(reclusasHashMap.get(id))
                    );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            case 2 -> {
                try {
                    reclusasHashMap.values().stream().sorted(
                            Comparator.comparing(Reclusa::getNombre)
                    ).forEach(System.out::println);
                } catch (NullPointerException e) {
                    System.err.print("Algun nombre esta vacio" + e.getMessage());
                }
            }
            case 3 -> {
                try {
                    reclusasHashMap.values().stream().sorted(
                            Comparator.comparingInt(Reclusa::getEdad)
                    ).forEach(System.out::println);
                } catch (NullPointerException e) {
                    System.err.println("Modifique las edades sin valor" + e.getMessage());
                }
            }
        }
    }
}
