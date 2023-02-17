package topic3_objectorientedprogramming.objetos01.exer03;

import topic3_objectorientedprogramming.objetos01.exer01.Cotxe;
import topic3_objectorientedprogramming.objetos01.exer02.PermisConducir;

import java.util.Scanner;

/*
3. Crea una classe CotxePermis amb un mètode main que fagi el següent:
- Crear un objecte de la classe Cotxe i un altre objecte de la classe PermisConduir.
- Mostrar un menú per pantalla amb les següents opcions:
a) Modificar info cotxe: aquesta opció modificarà l'objecte Cotxe amb les noves dades que demanarà a l'usuari (model i matrícula).
b) Modificar info permis:  aquesta opció modificarà l'objecte PermisConduir amb les noves dades que demanarà a l'usuari (nom, tipus permís i punts).
c) Mostrar info: mostrar per pantalla tots els valors dels atributs dels objectes Cotxe i PermisConduir.
 */
public class CotxePermis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cotxe cotxe1 = new Cotxe("modelo0001", "1234POO");
        PermisConducir permisConducir1 = new PermisConducir("daruny", false, 10);
        CotxePermis cotxePermis = new CotxePermis();
        cotxePermis.menuPrograma(sc, cotxe1, permisConducir1);
    }

    public void menuOpciones() {
        System.out.print("[a]- Modificar info cotxe.\n" +
                "[b]- Modificar info permis\n" +
                "[c]- Mostrar info de Cotxe y PermisConducir\n" +
                "Elige una opcion: ");
    }

    public void menuPrograma(Scanner sc, Cotxe c1, PermisConducir pc1) {
        menuOpciones();
        String opcion = sc.nextLine();
        while (!opcion.matches("[a-z]")) {
            System.out.print("introduce una opcion correcta:");
            opcion = sc.nextLine();
        }
        switch (opcion) {
            case "a":
                System.out.print("modificar cotxe\nintroduce modelo nuevo: ");
                String modeloNuevo = sc.nextLine();
                c1.setModel(modeloNuevo);
                System.out.print("modificar cotxe\nintroduce matricula nueva: ");
                String matriculaNueva = sc.nextLine();
                c1.setMatricula(matriculaNueva);
                System.out.println("coche actualizado:\n" + c1.toString());
                break;
            case "b":
                System.out.print("modificar nom: ");
                String nomNou = sc.nextLine();
                pc1.setNom(nomNou);
                System.out.print("modificar tipus permis: ");
                boolean tipusPermis = Boolean.parseBoolean(sc.nextLine());
                pc1.setTipusPermis(tipusPermis);
                System.out.print("modificar punts: ");
                int puntsNou = sc.nextInt();
                pc1.setPunts(puntsNou);
                System.out.println("Permis Conduir modificado: \n" + pc1.toString());
                break;
            case "c":
                System.out.println(c1);
                System.out.println(pc1);
                break;
            default:
                System.out.println("introduce opcion correcta:");
        }
    }
}
