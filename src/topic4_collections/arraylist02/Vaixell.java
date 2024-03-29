package topic4_collections.arraylist02;

public class Vaixell  {
    private String nom;
    private int preu;
    private int edad;

    public Vaixell() {
    }

    public Vaixell(String nom, int preu, int edad) {
        this.nom = nom;
        this.preu = preu;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   /* @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Vaixell))
            return false;

        Vaixell vaixell = (Vaixell) obj;
        return Objects.equals(this.nom, vaixell.nom);
    }
    */

    @Override
    public String toString() {
        return "Vaixell{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                ", edad=" + edad +
                '}';
    }
}