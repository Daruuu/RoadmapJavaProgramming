package topic2_modularprogramming.exercises_1ModularBasic;

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

    public static double celsius;
    public static double fahrenheit;
    public static double kelvin;
    public static double resultado;
    public static int opcion;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        magnitudTemperatura();
        while (!salir) {
            int tipoTemperatura = sc.nextInt();
            switch (tipoTemperatura) {
                case 1:
                    System.out.println("[1]. Celsius a Fahrenheit\n[2]. Celsius a Kelvin");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Convertir de Celsius a Fahrenheit\nintroduce temperatura: ");
                            celsius = sc.nextDouble();
                            resultado = celsiusAFahrenheit(celsius);
                            System.out.println(resultado + "ºF");
                            break;
                        case 2:
                            System.out.println("Convertir de Celsius a Kelvin");
                            celsius = sc.nextDouble();
                            resultado = celsiusAKelvin(celsius);
                            System.out.println(resultado + "°C");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("[3]. Fahrenheit a Celsius\n[4]. Fahrenheit a Kelvin");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 3:
                            System.out.println("Convertir de Fahrenheit a Celsius");
                            fahrenheit = sc.nextDouble();
                            resultado = fahrenheitACelsius(fahrenheit);
                            System.out.println(resultado + "°C");
                            break;
                        case 4:
                            System.out.println("Convertir de Fahrenheit a Kelvin");
                            fahrenheit = sc.nextDouble();
                            resultado = fahrenheitAKelvin(fahrenheit);
                            System.out.println(resultado + "K");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("[5]. Kelvin a Celsius\n[6]. Kelvin a Fahrenheit");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 5:
                            System.out.println("Convertir de kelvin a celsius");
                            kelvin = sc.nextDouble();
                            resultado = kelvinACelsius(kelvin);
                            System.out.println(resultado + "K");
                            break;
                        case 6:
                            System.out.println("Convertir de kelvin a Fahrenheit");
                            kelvin = sc.nextDouble();
                            resultado = kelvinAFahrenheit(kelvin);
                            System.out.println(resultado + "K");
                            break;
                        case 7:
                            System.out.println("FIN PROGRAMA");
                            salir = true;
                            break;
                        default:
                            System.out.println("introduce una opcion valida:");
                    }
                    break;
            }
        }

        /*
        while (!salir) {
            listaOpciones();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Convertir de Celsius a Fahrenheit\nintroduce temperatura: ");
                    celsius = sc.nextDouble();
                    resultado = celsiusAFahrenheit(celsius);
                    System.out.println(resultado + "ºF");
                    break;
                case 2:
                    System.out.println("Convertir de Celsius a Kelvin");
                    celsius = sc.nextDouble();
                    resultado = celsiusAKelvin(celsius);
                    System.out.println(resultado + "°C");
                    break;
                case 3:
                    System.out.println("Convertir de Fahrenheit a Celsius");
                    fahrenheit = sc.nextDouble();
                    resultado = fahrenheitACelsius(fahrenheit);
                    System.out.println(resultado + "°C");
                    break;
                case 4:
                    System.out.println("Convertir de Fahrenheit a Kelvin");
                    fahrenheit = sc.nextDouble();
                    resultado = fahrenheitAKelvin(fahrenheit);
                    System.out.println(resultado + "K");
                    break;
                case 5:
                    System.out.println("Convertir de kelvin a celsius");
                    kelvin = sc.nextDouble();
                    resultado = kelvinACelsius(kelvin);
                    System.out.println(resultado + "K");
                    break;
                case 6:
                    System.out.println("Convertir de kelvin a Fahrenheit");
                    kelvin = sc.nextDouble();
                    resultado = kelvinAFahrenheit(kelvin);
                    System.out.println(resultado + "K");
                    break;
                case 7:
                    System.out.println("FIN PROGRAMA");
                    salir = true;
                    break;
                default:
                    System.out.println("introduce una opcion valida:");
            }
        }
         */
    }

    public static void magnitudTemperatura() {
        //El programa ha de demanar en quina magnitud entrem la temperatura (celsius, farenheit o kelvin),
            System.out.print("[1]. Introduce temperatura en CELSIUS\n[2]. Introduce temperatura en FAHRENHEIT\n[3]. Introduce temperatura en KELVIN\nopcion: ");
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitAKelvin(double celsius) {
        return (celsius - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinAFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

}
