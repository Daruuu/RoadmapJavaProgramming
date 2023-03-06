
public class Programa {

	public static void main(String[] args) {

		Persona p = new Persona("Pepe", 20);
		p.complirAnys();
		System.out.println(p);

		Alumne a = new Alumne("Ana", 30, 6);
		a.complirAnys();
		System.out.println(a);

		Professor p2 = new Professor("Alex", 40, 1000);
		p2.complirAnys();
		System.out.println(p2);
	}

}
