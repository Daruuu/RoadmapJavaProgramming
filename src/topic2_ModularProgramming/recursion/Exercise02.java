package topic2_ModularProgramming.recursion;

public class Exercise02 {
    /*
    2. Haz un programa que escriba la suma de los N primeros números:

      Ej: N=5 5+4+3+2+1+0=15

      suma(N) = N + suma(N-1);
     */
    public static void main(String[] args) {

        System.out.println(suma(5));
    }

    public static int suma(int n){
        if (n<=0){
            return 0;
        }
        return (suma(n-1) + n);
    }






}
