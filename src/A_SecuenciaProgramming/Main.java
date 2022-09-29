package A_SecuenciaProgramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("===============EXERCISE 1 ===============");
        //Escriu “Hola món!” per pantalla.
        System.out.println("Hello world!");

        System.out.println("===============EXERCISE 2 ===============");
        //2. Llegeix dos nombres reals i escriu la seva suma, resta, producte i quocient.
        System.out.print("introduce 2 numeros:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int producto = numero1 * numero2;
        int division = numero1 / numero2;
        System.out.println("suma: " + suma +
                "\nresta: " + resta +
                "\nmultiplicacion: " + producto +
                "\ndivision: " + division);

        System.out.println("===============EXERCISE 3 ===============");
        //3. Llegeix el radi d’un cercle i escriu el seu perímetre i àrea.
        System.out.println("introduce un numero: ");
        int radio = sc.nextInt();
        double areaCirculo = Math.PI * (radio * radio);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("area del circulo: " + areaCirculo + "\nperimetro del circulo: " + perimetro);

        System.out.println("===============EXERCISE 4 ===============");
        //4. Llegeix tres nombres reals i troba la seva mitja aritmètica.
        System.out.println("introduce 3 numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sumaNumeros = num1 + num2 + num3;
        int mediaAritmetica = sumaNumeros/3;
        System.out.println("media aritmetica: " + mediaAritmetica);

        System.out.println("===============EXERCISE 5 ===============");
       //5. Llegeix la base i l'altura d'un triangle i escriu la seva àrea.
        System.out.println("introduce la base del triangulo: ");
        int baseTriangulo = sc.nextInt();
        System.out.println("introduce la altura del triangulo: ");
        int alturaTriangulo = sc.nextInt();
        System.out.println("area del triangulo es " + (baseTriangulo * alturaTriangulo) /2);

        System.out.println("===============EXERCISE 6 ===============");
        //Llegeix el preu d'un producte, l'IVA (en %) i el descompte (en %) a aplicar. Escriu el
        //preu final del producte.
        System.out.println("introduce un precio: ");
        float precio = sc.nextFloat();
        System.out.println("introduce el IVA en %: ");
        int iva = sc.nextInt();
        System.out.println("introduce el descuento en %: ");
        int descuento = sc.nextInt();
        float precioConIva = precio + precio * iva/100;
        float precioIvaDescuento = precioConIva - precioConIva * descuento/100;
        System.out.println("precio final : " + precioIvaDescuento);

        System.out.println("===============EXERCISE 7 ===============");
        //Calcula l'àrea lateral i el volum d'un cilindre recte, introduint per teclat els valors del
        //radi i l'altura. V =PI⋅r²⋅h AL=2⋅PI⋅r⋅h
        System.out.println("radio: ");
        int radioCil = sc.nextInt();
        System.out.println("altura: ");
        int alturaCil = sc.nextInt();
        float volumenCil = (float) (Math.PI * radioCil * radioCil * alturaCil);
        float areaCil =(float) (2 * Math.PI * radioCil * alturaCil);
        System.out.println("volumen cilindro " + volumenCil + " area cilindro " + areaCil);

        System.out.println("===============EXERCISE 8 ===============");
        //Llegeix un nombre enter d’hores, minuts i segons i escriu el nombre de segons
        //equivalents.
        System.out.println("horas: ");
        int hora = sc.nextInt();    //1hora = 3600 segundos
        System.out.println("minutos: ");
        int minutos = sc.nextInt(); //1 minutos = 60 segundos
        System.out.println("segundos: ");
        int segundos = sc.nextInt();
        int segundosTotal = hora * 3600 + minutos * 60 + segundos;
        System.out.println("hora en segundos: " + segundosTotal);
*/
        System.out.println("===============EXERCISE 9 ===============");
        //Llegeix un nombre enter de segons i escriu el nombre d’hores, minuts i segons
        //equivalents en format h:m:s.
        System.out.println("introduce segundos totales: ");
        int segundosTotales = sc.nextInt();
        int horaTotal = segundosTotales/3600;
        int segundoRestante = segundosTotales % 3600;
        int minutosTotal = segundoRestante /60;
        int segundosFinal = segundoRestante % 60;
        System.out.println(horaTotal + ":" + minutosTotal + ":" + segundosFinal);

        System.out.println("===============EXERCISE 10 ===============");
        //Llegeix un nombre enter que designa un període de temps expressats en segons,
        //escriu l'equivalent en dies, hores, minuts i segons.
        System.out.println("leer segundos: ");
        int seconds = sc.nextInt();

    }
}