/* Exemple de classe que hereda d'una altre classe.
 * Professor té tot el que te Persona, i a més a més:
 * - Té un nou atribut "sou"
 * - El constructor crida al codi constructor de la classe pare Persona
 *   i a continuació inicialitza el sou 
 * - El mètode "complirAnys" crida al codi de la classe pare Persona
 *   i a continuació multiplica el sou per 2
 * - El mètode "toString" retorna el que retornava la classe pare Persona
 *   i li concatena informació del sou
 */

public class Professor extends Persona {

	private int sou;

	public Professor(String nom, int edat, int sou) {
		super(nom, edat);
		this.sou = sou;
	}

	public void complirAnys() {
		super.complirAnys();
		sou = sou*2;
	}

	public String toString() {
		return (super.toString() + "   Sou: " + sou);
	}

}