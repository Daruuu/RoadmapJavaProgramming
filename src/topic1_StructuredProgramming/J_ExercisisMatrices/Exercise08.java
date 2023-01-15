package topic1_StructuredProgramming.J_ExercisisMatrices;

//8. L'objectiu d'aquest exercici és convertir una matriu (array de dos dimensions) en un vector (array d'una dimensió). Per fer-ho hem de recórrer la matriu d'esquerra a dreta i de dalt a baix i anar omplint el vector, de la següent manera:
//Matriu = {
// {1,2,3},
// {7,8,9},
// {15,12,45}
// }
//Passarà a ser el següent vector: {1,2,3,7,8,9,15,12,45}
public class Exercise08 {
    public static void main(String[] args) {
        int[][] matriu = {{1, 2, 3}, {7, 8, 9}, {15, 12, 45}};
        int[] array = new int[matriu.length * matriu[0].length];

        int k = 0;
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                array[k] = matriu[i][j];
                k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
