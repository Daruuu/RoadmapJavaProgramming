/* Crea la classe Persona que té:
 * - Atributs: nom, edat
 * - Mètodes: constructor, complirAnys(), toString()
 * D'aquesta classe derivaran les classes Alumne i Professor
 */

public class Persona {

	private String nom;
	private int edat;

	public Persona(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}

	public void complirAnys() {
		edat = edat + 1;
	}

	public String toString() {
		return ("Nom: " + nom + "   Edat: " + edat);
	}

}
