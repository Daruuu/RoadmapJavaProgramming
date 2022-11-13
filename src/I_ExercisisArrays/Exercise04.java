package I_ExercisisArrays;


//4. Fes la suma de dos arrays posició a posició. Això significa que has d'introduir dos arrays d'igual tamany i en un tercer hi has de posar la suma element a element.
public class Exercise04 {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 7, 8, 14};
        int[] array2 = {20, 57, 6, 7, 8};

        System.out.println("array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\narray 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        int[] sumaArray = new int[5];
        System.out.println("\nsuma array1 + array2:");
        for (int i = 0; i < sumaArray.length; i++) {
            sumaArray[i] = array1[i] + array2[i];
            System.out.print(sumaArray[i] + " ");
        }
    }
}