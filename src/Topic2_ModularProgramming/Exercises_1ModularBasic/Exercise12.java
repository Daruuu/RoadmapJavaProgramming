package Topic2_ModularProgramming.Exercises_1ModularBasic;

import java.util.Scanner;

/*
12. Fes un convertidor de temperatures.
El programa ha de demanar en quina magnitud entrem la temperatura (celsius, farenheit o kelvin),
tot seguit entrarem el valor numèric.
A continuació es mostrarà un menú on es permetrà fer la conversió adient:
de celsius a farenheit,
de celsius a kelvin,
de farenheit a celsius,
de farenheit a kelvin,
de kelvin a celsius i
de kelvin a farenheit.

Fes un menú amb aquestes opcions i una última opció per sortir.
Implementa les funcions que necessitis per a realitzar les conversions, en el main no hi pot haver cap conversió.
El programa ha de tenir en compte que si ens entren una determinada magnitud aquesta només
permetrà convertir a les altres dues... sinó ens ha de donar error.
Ex: si entrem la magnitud inicial amb Celsius, no podrem convertir de Farenheit a Celsius ja que ja ho tenim en Celsius.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listaOpciones();
        menuPrograma();

    }

    public static void listaOpciones() {
        System.out.print("[1]. Convertir de Celsius a Fahrenheit\n" +
                "[2]. Convertir de Celsius a Kelvin\n" +
                "[3]. Convertir de Fahrenheit a Celsius\n" +
                "[4]. Convertir de Fahrenheit a Kelvin\n" +
                "[5]. Convertir de kelvin a celsius\n" +
                "[6]. Convertir de kelvin a Fahrenheit\n" +
                "[7]. FIN PROGRAMA\n" +
                "Introduce una opcion: ");
    }

    public static void menuPrograma() {
        Scanner sc  =new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Convertir de Celsius a Fahrenheit");
                    break;
                case 2:
                    System.out.println("Convertir de Celsius a Kelvin");
                    break;
                case 3:
                    System.out.println("Convertir de Fahrenheit a Celsius");
                    break;
                case 4:
                    System.out.println("Convertir de Fahrenheit a Kelvin");
                    break;
                case 5:
                    System.out.println("Convertir de kelvin a celsius");
                    break;
                case 6:
                    System.out.println("Convertir de kelvin a Fahrenheit");
                    break;
                case 7:
                    System.out.println("FIN PROGRAMA");
                    salir = true;
                    break;
                default:
                    System.out.println("introduce una opcion valida:");
            }
        }
    }
    public static void convertirCelsiusAFahrenheit(){

    }

}
