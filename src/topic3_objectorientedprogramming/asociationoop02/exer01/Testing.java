package topic3_objectorientedprogramming.asociationoop02.exer01;

public class Testing {
    public static void main(String[] args) {
        String[] tiposSala = {"circular", "rectangular", "cuadrada", "pentagonal"};
        Casa casa1 = new Casa(80.5, "calle 2", new Sala(4, "circular"), new Cocina(false, 5));
        Cocina cocina1 = new Cocina();
        Sala sala1 = new Sala();
        Casa casa2 = new Casa(120, "diagonal", sala1, cocina1);
        Casa casa3 = new Casa(110, "diagonal 2", new Sala(5, tiposSala[0]), new Cocina(true, 6));

    }
}
