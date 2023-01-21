package scrum.uf2;

import java.util.ArrayList;
import java.util.Scanner;

public class Presas {

    public static int [][]presasSalen;
    public static int indexRow = 0;
    public static int indexCol = 0;
    public static int contador=0;
    public static ArrayList<Integer> presasPermisSalida = new ArrayList<Integer>();
    //public static String[] atributos={'identificador', 'nombre', 'edad', 'sentencia','condenaRestante', 'tipo_grado', 'permisoSalida'};
    private static String[][] fichasTecnicas = {
            {"0001", "Juana Nascimento", "29", "20", "11", "3"},
            {"0002", "Giovana Libert", "42", "10", "5", "1"},
            {"0003", "Maria Lisa", "33", "8", "5", "3"},
            {"0004", "Marta Eulalia", "39", "4", "2", "2"},
            {"0005", "Carmen ", "65", "5", "1", "3"},


    };

    public static int opcionesMenuWadRas(Scanner sc) {
        System.out.println("1. FITXES PRESES\n" +
                "2. PRESES de 3R GRAU QUE PODEN SORTIR\n" +
                "3. TEMPS ENTRADA I SORTIDA PRESES\n" +
                "4. CONTROL VISITA FAMILIAR\n" +
                "5. SORTIR" +
                "introduce opcion:");
        return sc.nextInt();
    }
    public static int salida(){
        for (int i = 0; i < fichasTecnicas.length; i++) {
            for (int j = 0; j < fichasTecnicas[0].length; j++) {
                if(Integer.parseInt(fichasTecnicas[i][fichasTecnicas.length])==3 && Integer.parseInt(fichasTecnicas[i][fichasTecnicas.length-1])<9){
                    System.out.print("Presa con permiso de salida: "+fichasTecnicas[i][j]+ " "+fichasTecnicas[i][j+1]+ "\n");//error cuando añado las 10
                    indexRow=i;
                    i++;
                    break;
                }
            }
        }
        return indexRow;
    }
}