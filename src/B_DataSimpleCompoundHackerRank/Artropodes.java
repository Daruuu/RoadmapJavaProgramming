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

        int resultado = 0, miriapodesDuesPotesTotal, miriapodesCuatrePotesTotal;

        if (numeroInsectes != 0) {
            resultado = numeroInsectes * insectesPotes;
        }
        if (numeroAracnids != 0) {
            resultado += (numeroAracnids * aracnidsPotes);
        }
        if (numeroCrustacis != 0) {
            resultado += (numeroCrustacis * crustacisPotes);
        }
        if (numeroMiriapodesDuesPotes != 0) {
            miriapodesDuesPotesTotal = numSegmentoMiriapodesDuesPotes * miriapodesDues * numeroMiriapodesDuesPotes;
            resultado += miriapodesDuesPotesTotal;
        }
        if (numeroMiriapodesCuatrePotes != 0) {
             miriapodesCuatrePotesTotal = numSegmentoMiriapodesCuatroPotes * miriapodesCuatre * numeroMiriapodesCuatrePotes;
             resultado += miriapodesCuatrePotesTotal;
        }
        System.out.println(resultado);
    }
}
