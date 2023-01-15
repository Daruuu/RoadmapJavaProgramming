package topic2_ModularProgramming.exercises_3ModularDesign_2.Exercise2;

import java.util.Scanner;

/*
2. Comandament a distància.
Crearem una classe Comandament.java que farà la funció d'un comandament a distància.
Aquesta classe tindrà un menú amb diferents funcionalitats:

- Tindrà botons numèrics que seran els canals de l'1 al 6.
- Tindrà una opció que serà el volum (valor numèric) que es pot pujar o baixar
- Tindrà una opció per habilitar els subtítols.
- Tindrem també una variable numèrica que serà l'hora.
- Tindrà una altra opció per canviar d'idioma.
En el nostre programa tindrem una altra classe que es dirà Canals.java, i el que farà aquesta classe serà mostrar el programa que fan en cada canal quan es cliqui el seu número.
Dissenya i implementa el comandament a distància, primer només amb les dues classes, i després amb atributs de classe: numCanal, nomPrograma, volum, subtitol i idioma.
 */
public class Comandament {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    botonesCanales();
                    break;
                case 2:
                    int vol = sc.nextInt();
                    volumen(vol);
                    break;
                case 3:
                    System.out.println("elige si activar los subtitulos o no : si o no");
                    String subtitul = sc.nextLine();
                    subtitulos(subtitul);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    opcion = sc.nextInt();
                    break;
            }
        }
    }

    public static void opciones() {
        System.out.println("");
    }

    public static void botonesCanales() {
        Scanner sc = new Scanner(System.in);
        int canal = sc.nextInt();
        switch (canal) {
            case 1:
                System.out.println("Canal 1");
                break;
            case 2:
                System.out.println("Canal 2");
                break;
            case 3:
                System.out.println("Canal 3");
                break;
            case 4:
                System.out.println("Canal 4");
                break;
            case 5:
                System.out.println("Canal 5");
                break;
            case 6:
                System.out.println("Canal 6");
                break;
        }
    }

    //- Tindrà una opció que serà el volum (valor numèric) que es pot pujar o baixar
    public static void volumen(int volumen) {
        if (volumen == 1) {
            System.out.println("volumen sube");
        } else {
            System.out.println("volumen baja");
        }
    }

    //- Tindrà una opció per habilitar els subtítols.
    public static void subtitulos(String subt) {
        if (subt.equals("si"))
            System.out.println("subtitulos activados");
        else if (subt.equals("no"))
            System.out.println("subtitulos desactivados");
    }
}
