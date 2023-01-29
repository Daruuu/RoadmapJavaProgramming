package topic3_objectorientedprogramming.exercicisdeclases01.exer07;

/*
7. Crea i testeja una classe que emuli un comptador cíclic d'un dígit (0-9)
amb mètodes que ens permeti posar el comptador a 0,
incrementar-lo i
consultar el seu valor.
 */
public class ContadorCiclico {
    private int numero;

    public void iniciaContadorCiclico() {
        if (numero == 9) {
            numero = 0;
        }
        numero++;
    }

    public int reiniciar() {
        return numero = 0;
    }

    public ContadorCiclico(int contador) {
        this.numero = contador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContadorCiclico{" +
                "contador=" + numero +
                '}';
    }
}
