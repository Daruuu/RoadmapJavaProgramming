package topic2_ModularProgramming.recursion.ampliacion;

public class Ampliacio01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(m(0, a));
    }

    public static int m(int i, int[] a) {
        if (i == a.length)
            return 1;
        return a[i] * m(i + 1, a);
    }
}
