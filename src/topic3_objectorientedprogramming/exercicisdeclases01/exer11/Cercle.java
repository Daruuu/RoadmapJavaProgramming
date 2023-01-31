package topic3_objectorientedprogramming.exercicisdeclases01.exer11;

/*
11. Cercle:
D'un cercle ens interessa conèixer el radi i determinar el perímetre,
l'àrea i esbrinar quin de dos cercles és el més gran (comparació amb un altre objecte).
 */
public class Cercle {
    private float radi;

    public static void main(String[] args) {
        Cercle a = new Cercle(3);
        Cercle b = new Cercle(5);

    }

    public Cercle(float radi) {
        this.radi = radi;
    }

    public float getRadi() {
        return radi;
    }

    public void setRadi(float radi) {
        this.radi = radi;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radi=" + radi +
                '}';
    }

    public double perimetreCercle() {
        return 2 * Math.PI * radi;
    }

    public double areaCercle() {
        return Math.PI * radi * radi;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        Cercle cercle = (Cercle) obj;   //se crea el objeto para poder acceder a sus atributos y compararlos con los atributos de la instancia actual
        return Float.compare(cercle.radi, radi) == 0;
//        return super.equals(obj);
    }
}
