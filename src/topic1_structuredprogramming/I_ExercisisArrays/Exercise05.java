package topic1_structuredprogramming.I_ExercisisArrays;

//5. Introdueix un Array d'enters i calcula el % d'elements que són més grans que la mitjana aritmètica dels elements de la taula. Escriu els elements de l'Array, la mitjana i el nombre d'elements més grans que la mitjana.
public class Exercise05 {
    public static void main(String[] args) {

        int sumaArr = 0;
        int mediaAritmeticaArr = 0;
        int mediaSuperiorArr = 0;
        int[] array1 = {10, 20, 30, 40, 50, 60, 70, 80};

        for (int i = 0; i < array1.length; i++) {
            sumaArr += array1[i];
        }
        System.out.println("suma elementos array: " + sumaArr);
        mediaAritmeticaArr = sumaArr/array1.length;
        System.out.println("media aritmetica del array: " + mediaAritmeticaArr);
        System.out.println("elementos mas grandes q la media del array: ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > mediaAritmeticaArr){
//                mediaSuperiorArr++;
                System.out.println(mediaAritmeticaArr++);
            }
        }

    }
}
