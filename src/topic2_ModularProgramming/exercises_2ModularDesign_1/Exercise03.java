package topic2_ModularProgramming.exercises_2ModularDesign_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
L'opció 'Mostra resum': ens mostra un informe on apareix el total d'ingressos i el total de despeses.
A més, en cas que hi hagi més ingressos que despeses ens mostrarà també la següent frase:
«L'empresa ha tingut uns beneficis de X euros», on X és la diferència entre ingressos i despeses.
En cas que les despeses siguin més grans que els ingressos la frase a mostrar és:
«L'empresa ha tingut un dèficit de X euros», on X és la diferència entre les despeses i els ingressos.

Les opcions històric ingressos i despeses mostraran un llistat dels ingressos i despeses realitzats respectivament, així com la data
exacte de la seva realització.

L'opció 'fi' fa que acabi el programa.

Usar arrays per a emmagatzemar els ingressos i despeses, així com les dates.
Usar la classe LocalDateTime per a representar les dates.
 */
public class Exercise03 {

    private static final List<Double> ingresos = new ArrayList<>();
    private static final List<Double> despeses = new ArrayList<>();
    private static final List<String> fechas = new ArrayList<>();

    public static void main(String[] args) {
        contabilidadEmpresa();
    }

    public static void contabilidadEmpresa() {
        Scanner sc = new Scanner(System.in);
        opciones();
        int opcion = sc.nextInt();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    //l'usuari introdueixi una nova partida per a l'ingrés.
                    System.out.println("Alta nuevo ingreso:");
                    String inicio = startTimer();
                    altaIngresos();
                    System.out.println(inicio);
                    break;
                case 2:
                    //l'usuari introdueixi una nova partida per a la despesa.
                    System.out.println("Alta despesa:");
                    altaDespesa();
                    String fin =finishTimer();
                    System.out.println(fin);
                    break;
                case 3:
                    //ens mostra un informe on apareix el total d'ingressos i el total de despeses.
                    System.out.println("Muestra resumen:");
                    String resumen = mostrarResumen();
                    System.out.println(resumen);
                    break;
                case 4:
                    System.out.println("Historic Ingresos:");
                    double histoIngresos = historicIngresos();
                    System.out.println(histoIngresos);
                    break;
                case 5:
                    System.out.println("Historic Despeses:");
                    double histoDespeses = historicDespeses();
                    System.out.println(histoDespeses);
                    break;
                default:
                    System.out.println("opcion introducida incorrecta");
            }
            opciones();
            opcion = sc.nextInt();
        }
    }

    public static void opciones() {
        System.out.print("\n1. Alta d'ingrés\n" +
                "2. Alta de despesa\n" +
                "3. Mostra resum\n" +
                "4. Històric ingressos\n" +
                "5. Històric despeses\n" +
                "6. Fi\n" +
                "Introduce una opcion: ");
    }

    public static void altaIngresos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cantidad: ");
        double nuevoIngreso = sc.nextDouble();
        ingresos.add(nuevoIngreso);
    }

    public static void altaDespesa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nuevo gasto: ");
        double nuevoGasto = sc.nextDouble();
        despeses.add(nuevoGasto);
    }

    public static String mostrarResumen() {
        double totalIngresos = 0.0;
        double totalDespeses = 0.0;
        for (Double ingreso : ingresos) {
            totalIngresos += ingreso;
        }
        for (Double gasto : despeses) {
            totalDespeses += gasto;
        }
        double diferenciaIngresosDespeses = totalIngresos - totalDespeses;
        if (totalIngresos > totalDespeses)
            return "L'empresa ha tingut uns beneficis de " + diferenciaIngresosDespeses + " euros";
        else return "L'empresa ha tingut un dèficit de" + diferenciaIngresosDespeses + " euros";
    }

    public static double historicIngresos() {
        double historial = 0.0;
        for (Double in : ingresos) {
            historial += in;
        }
        return historial;
    }

    public static double historicDespeses() {
        double historial = 0.0;
        for (Double des : despeses) {
            historial += des;
        }
        return historial;
    }

    public static String startTimer() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = ahora.format(formatter);
        fechas.add(formatDateTime);
        return formatDateTime;
    }

    public static String finishTimer() {
        LocalDateTime fin = LocalDateTime.now();
        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = fin.format(fechaFormato);
        fechas.add(formatDateTime);
        return formatDateTime;
    }
}
