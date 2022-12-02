package Topic2_ModularProgramming.Exercises_1ModularBasic;


/*
4. (max,min) Fer dues funcions que donats tres nombres ens retornin el màxim i el mínim, respectivament.
 */
public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("numero minimo:");
        int n1 = 8;
        int n2 = 4;
        int n3 = 9;
        numeroMinimo(n1, n2, n3);
        System.out.println("numero maximo:");
        numeroMaximo(n1, n2, n3);
    }

    public static void numeroMinimo(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) System.out.println(n1);
        if (n2 < n1 && n2 < n3) System.out.println(n2);
        else System.out.println(n3);
    }

    public static void numeroMaximo(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) System.out.println(n1);
        if (n2 > n1 && n2 > n3) System.out.println(n2);
        else System.out.println(n3);
    }

}
