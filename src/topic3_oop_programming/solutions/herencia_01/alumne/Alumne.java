/* Exemple de classe que hereda d'una altre classe.
 * Alumne té tot el que te Persona, i a més a més:
 * - Té un nou atribut "nota"
 * - El constructor crida al codi constructor de la classe pare Persona
 *   i a continuació inicialitza la nota 
 * - El mètode "complirAnys" crida al codi de la classe pare Persona
 *   i a continuació posa la nota a 10 
 * - El mètode "toString" retorna el que retornava la classe pare Persona
 *   i li concatena informació de la nota
 */

public class Alumne extends Persona {

	private float nota;

	public Alumne(String nom, int edat, float nota) {
		super(nom, edat);
		this.nota = nota;
	}

	public void complirAnys() {
		super.complirAnys();
		nota = 10;
	}

	public String toString() {
		return (super.toString() + "   Nota: " + nota);
	}

}