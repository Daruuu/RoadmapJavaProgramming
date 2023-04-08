package topic3_oop_programming.interficies05.ex01;

public class CantantOpera extends Persona{

    public CantantOpera() {
    }

    public CantantOpera(String nom, int edat) {
        super(nom, edat);
    }

    public void cantantOpera(){
        System.out.println("Persona canta una opera");
    }

}
