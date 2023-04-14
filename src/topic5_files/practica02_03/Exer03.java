package topic5_files.practica02_03;

import java.io.File;

public class Exer03 {
    public static void main(String[] args) {
        Exer03 exer03 = new Exer03();
        String ruta = "/home/daruuu/IdeaProjects/RoadmapJavaProgramming/src/topic5_files/practica02_03";
        String nombreFichero = "testexer03";
        String stringABuscar = "was";
//        exer03;
    }

    public void buscarFichero(String ruta, String nombreFichero){

        File directorio = new File(ruta);
        File[] listaDir = directorio.listFiles();
        try{
            if (!directorio.isDirectory()){
                System.out.println("ruta invalida");
            }else {
                for (File f : listaDir){
                    if (f.getName().equals(nombreFichero)){

                    }else {
                        System.out.println("fichero no encontrado!");
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void buscarString(String strABuscar){

    }
}
