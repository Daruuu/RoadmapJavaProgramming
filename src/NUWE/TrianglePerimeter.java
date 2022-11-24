package NUWE;

/*
If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?

Encuentre la suma de todos los números enteros positivos n que no excedan 100 000 000 tal que para cada divisor d de n, d + n / d es primo.

 */
public class TrianglePerimeter {
    public static void main(String[] args) {

        for (int i = 0; i < 100000000; i++) {
            int suma = 0;
            if (i % 3 == 0) {
                suma += i;
                System.out.println(suma);

            }
        }

    }
}
