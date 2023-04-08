package topic3_oop_programming.oop01.exer02;

//Crea una altra classe PermisTest amb un main on es creïn 2 objectes de tipus PermisConduir i es provin els seus mètodes set, imprimirPermis i restarPunts.
public class PermisTest {

    public static void main(String[] args) {
        PermisConducir permisConducir1 = new PermisConducir("daruny", true, 10);
        PermisConducir permisConducir2 = new PermisConducir("kenneth", true, 12);

        System.out.println("Permis 1:");
        permisConducir1.imprimirPermis();
        int restarPunts = permisConducir1.restarPunts(4);
        System.out.println("puntos restantes: " + restarPunts);
        System.out.println("get nom: " + permisConducir1.getNom());

        System.out.println("Permis 2:");
        System.out.println("puntos: " + permisConducir2.getPunts());
        permisConducir2.imprimirPermis();
        permisConducir2.setTipusPermis(false);
        permisConducir2.imprimirPermis();
    }
}
