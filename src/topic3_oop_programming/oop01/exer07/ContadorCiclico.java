package topic3_oop_programming.oop01.exer07;

/*
7. Crea i testeja una classe que emuli un comptador cíclic d'un dígit (0-9)
amb mètodes que ens permeti posar el comptador a 0,
incrementar-lo i
consultar el seu valor.
 */
public class ContadorCiclico {
    private int contador;

    public ContadorCiclico() {
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public ContadorCiclico(int contador) {
        this.contador = contador;
    }

    public int reiniciarContador() {
        return contador = 0;
    }

    public void aumentarContador() {
        if (contador == 9) {
            contador = 0;
        }
        contador++;
        System.out.println(contador);
    }

    @Override
    public String toString() {
        return "ContadorCiclico{" +
                "contador=" + contador +
                '}';
    }
}
