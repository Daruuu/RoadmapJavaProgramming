package B_DataSimpleCompoundHackerRank;

import java.util.Scanner;

public class Artropodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroInsectes = sc.nextInt();
        int numeroAracnids = sc.nextInt();
        int numeroCrustacis = sc.nextInt();

        int numeroMiriapodesDuesPotes = sc.nextInt();
        int numSegmentoMiriapodesDuesPotes = sc.nextInt();

        int numeroMiriapodesCuatrePotes = sc.nextInt();
        int numSegmentoMiriapodesCuatroPotes = sc.nextInt();

        int insectesPotes = 6;
        int aracnidsPotes = 8;
        int crustacisPotes = 10;
        int miriapodesDues = 2;
        int miriapodesCuatre = 4;

        int resultado = 0;
        int resultado1 = 0;
        int resultado2 = 0;
        int resultado3 = 0;
        int resultado4 = 0;
        int miriapodesDuesPotesTotal = 0;
        int miriapodesCuatrePotesTotal = 0;

        if (numeroInsectes != 0)
            resultado = numeroInsectes * insectesPotes;
        System.out.println(resultado);

        if (numeroAracnids != 0)
            resultado1 = resultado + (numeroAracnids * aracnidsPotes);
        System.out.println(resultado1);

        if (numeroCrustacis != 0)
            resultado2 = resultado1 + (numeroCrustacis * crustacisPotes);
        System.out.println(resultado2);

        if (numeroMiriapodesDuesPotes != 0)
            resultado3 = resultado2 + (numSegmentoMiriapodesDuesPotes * miriapodesDues);
        System.out.println(resultado3);
        //System.out.println(miriapodesDuesPotesTotal + " segmento * 2 potes");

        if (numeroMiriapodesCuatrePotes != 0)
            resultado4 = resultado3 + (numSegmentoMiriapodesCuatroPotes * miriapodesCuatre);
        System.out.println(resultado4);

        //System.out.println(miriapodesCuatrePotesTotal + " segmento * 4 potes");

        //System.out.println(resultado);

    }
}
