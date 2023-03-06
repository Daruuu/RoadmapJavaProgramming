public class TestObjecte{

    public static void main(String[] args) {
        ObjecteGeometric objecte = new ObjecteGeometric(13,14,"blau");
        System.out.println(objecte);
        System.out.println();

        Cercle cercle = new Cercle(15,17,"vermell",10);
        System.out.println("Coordenades cercle");
        System.out.println(cercle);
        System.out.println("Perimetre cercle: " + cercle.perimetre());
        System.out.println("Area cercle: " + cercle.area());
        System.out.println();

        Quadrat quadrat = new Quadrat(14,20,"groc", 5);
        System.out.println("Coordenades quadrat");
        System.out.println(quadrat);
        System.out.println("Perimetre quadrat: " + quadrat.perimetre());
        System.out.println("Area quadrat: " + quadrat.area());
    }
}
