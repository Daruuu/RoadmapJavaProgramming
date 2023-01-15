package nuwe;

public class MultipleOfThreeFive {
    public static void main(String[] args) {
        //Find the sum of all the multiples of 3 or 5 below 1000.
        int i = 1;
        int suma = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
            i++;
        }
        System.out.println(suma);
    }
}
