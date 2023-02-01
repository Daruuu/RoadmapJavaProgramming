package topic3_objectorientedprogramming.exerclases01.exer02;
/*
    Crea una classe PermisConduir que tingui els atributs nom, tipusPermis i punts, i els corresponents mètodes set i get per a cada un d'ells.
    Afegeix un mètode anomenat imprimirPermis que imprimeixi per pantalla tots els atributs.
    Afegeix un mètode anomenat restarPunts que resti del total de punts del permís el número de punts que rebi com a paràmetre.
    Crea una altra classe PermisTest amb un main on es creïn 2 objectes de tipus PermisConduir i es provin els seus mètodes set, imprimirPermis i restarPunts.
*/
public class PermisConducir {
    private String nom;
    private Boolean tipusPermis;
    private Integer punts;

    //Afegeix un mètode anomenat imprimirPermis que imprimeixi per pantalla tots els atributs.
    public void imprimirPermis() {
        System.out.println("----------------------\nNombre: " + getNom() +
                "\ntipusPermis: " + getTipusPermis() +
                "\npuntosCarnet: " + getPunts()+ "\n-----------------------");
    }

    //Afegeix un mètode anomenat restarPunts que resti del total de punts del permís el número de punts que rebi com a paràmetre.
    public int restarPunts(int puntos) {
        return getPunts() - puntos;
    }

    public PermisConducir() {
    }

    public PermisConducir(String nom, Boolean tipusPermis, Integer punts) {
        this.nom = nom;
        this.tipusPermis = tipusPermis;
        this.punts = punts;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Boolean getTipusPermis() {
        return tipusPermis;
    }

    public void setTipusPermis(Boolean tipusPermis) {
        this.tipusPermis = tipusPermis;
    }

    public Integer getPunts() {
        return punts;
    }

    public void setPunts(Integer punts) {
        this.punts = punts;
    }

    @Override
    public String toString() {
        return "PermisConducir: " +
                "nom='" + nom + '\'' +
                ", tipusPermis=" + tipusPermis +
                ", punts=" + punts;
    }
}
