package topic2_modularprogramming.recursion;

public class Exercise09 {
    public static void main(String[] args) {
        int[] vector = {3, 5, 8};
        System.out.println(sumaVector(vector, 0));
    }

    //9. Programa un algoritmo recursivo capaz de sumar el número de un vector.
    public static int sumaVector(int[] vector, int i) {
        if (i == vector.length)return 0;
        return vector[i] + sumaVector(vector, i + 1);
    }
}

