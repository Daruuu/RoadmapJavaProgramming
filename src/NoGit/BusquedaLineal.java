package NoGit;

public class BusquedaLineal {
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 5};
        int target = 3;
        boolean encontrado = false;
        int i = 0;
        while (i < v.length && !encontrado) {
            if (v[i] == target)
                encontrado = true;
            i++;
        }
    }
}
