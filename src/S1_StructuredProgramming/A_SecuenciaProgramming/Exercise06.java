package S1_StructuredProgramming.A_SecuenciaProgramming;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un precio: ");
        float precio = sc.nextFloat();
        System.out.println("introduce el IVA en %: ");
        int iva = sc.nextInt();
        System.out.println("introduce el descuento en %: ");
        int descuento = sc.nextInt();
        float precioConIva = precio + precio * iva / 100;
        float precioIvaDescuento = precioConIva - precioConIva * descuento / 100;
        System.out.println("precio final : " + precioIvaDescuento);
    }
}
