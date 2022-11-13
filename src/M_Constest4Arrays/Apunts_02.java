package M_Constest4Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Apunts_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //numero de paginas
        //int[] numPagina = new int[n];
        String[] paginas = new String[n+1];
        for (int i = 0; i <= n; i++) {
            //numPagina[i] = sc.nextInt();
            paginas[i] = sc.nextLine();
        }
        Arrays.sort(paginas);

        for (String array : paginas) {
            System.out.println(array + " ");
        }
        /*
        String [] nuevo = new String[paginas.length];
        int i = 0; int j =0;
        for (int k = 0; k < numPagina.length; k++) {
            if (i == numPagina.length){
//                nuevo[k] =
            }
        }

         */






//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (numPagina[i] < numPagina[i+1]){
//                    numPagina[i] =
//                }
//            }
//        }



        /*
        String[] nuevoArray = new String[n];
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 1; j <= n; j++) {
                if (paginas[i].charAt(0) == j){
                    nuevoArray[k] = paginas[i];
                    k++;
                }else if (paginas[i].charAt(0) == ){
            }
        }
         */


    }

}
