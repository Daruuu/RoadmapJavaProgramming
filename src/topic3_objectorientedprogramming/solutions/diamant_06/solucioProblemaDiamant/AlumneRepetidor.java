package diamant.solucioProblemaDiamant;

import java.util.Scanner;

public class AlumneRepetidor implements Alumne1rDAM, Alumne2nDAM{
    public void imparteix(){
        System.out.println("Vols saber mòduls de 1r o 2n?");
        Scanner sc= new Scanner(System.in);
        if("1r".equals(sc.next())){
            Alumne1rDAM.super.imparteix();
        }else{
            Alumne2nDAM.super.imparteix();
        }
    }

    public static void main(String[] args) {
        AlumneRepetidor ar = new AlumneRepetidor();
        ar.imparteix();
    }
}
