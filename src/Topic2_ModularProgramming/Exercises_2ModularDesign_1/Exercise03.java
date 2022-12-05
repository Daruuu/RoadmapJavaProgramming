package Topic2_ModularProgramming.Exercises_2ModularDesign_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Fes el disseny modular i la seva posterior implementació en Java d'un programa que porti la comptabilitat d'una empresa. L'objectiu és controlar els ingressos i les despeses que hi ha hagut durant un període de temps. El programa té un menú amb les següents opcions:
1. Alta d'ingrés
2. Alta de despesa
3. Mostra resum
4. Històric ingressos
5. Històric despeses
6. Fi

L'opció 'Alta d'ingrés': l'usuari introdueixi una nova partida per a l'ingrés.
L'opció 'Alta de despesa': l'usuari introdueixi una nova partida per a la despesa.
L'opció 'Mostra resum': ens mostra un informe on apareix el total d'ingressos i el total de despeses. A més, en cas que hi hagi més ingressos que despeses ens mostrarà també la següent frase:«L'empresa ha tingut uns beneficis de X euros», on X és la diferència entre ingressos i despeses. En cas que les despeses siguin més grans que els ingressos la frase a mostrar és: «L'empresa ha tingut un dèficit de X euros», on X és la diferència entre les despeses i els ingressos.
Les opcions històric ingressos i despeses mostraran un llistat dels ingressos i despeses realitzats respectivament, així com la data exacte de la seva realització.
L'opció 'fi' fa que acabi el programa.

Usar arrays per a emmagatzemar els ingressos i despeses, així com les dates. Usar la classe LocalDateTime per a representar les dates.

 */
public class Exercise03 {

    private static int[] ingresos;
    private static int[] despeses;

    public static void main(String[] args) {
        contabilidadEmpresa();

    }


    public static void contabilidadEmpresa(){
        Scanner sc = new Scanner(System.in);
        opciones();
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                //l'usuari introdueixi una nova partida per a l'ingrés.
                System.out.println("Alta ingreso:");

                break;
            case 2:
                //l'usuari introdueixi una nova partida per a la despesa.
                System.out.println("Alta despesa:");

                break;
            case 3:
                //ens mostra un informe on apareix el total d'ingressos i el total de despeses.
                System.out.println("Muestra resumen:");

        }
    }
    public static void opciones(){
        System.out.print("1. Alta d'ingrés\n" +
                "2. Alta de despesa\n" +
                "3. Mostra resum\n" +
                "4. Històric ingressos\n" +
                "5. Històric despeses\n" +
                "6. Fi");
    }
    public static void altaIngresos(){


    }
    public static void altaDespesa(){

    }
    public static void mostrarResumen(){

    }

}
