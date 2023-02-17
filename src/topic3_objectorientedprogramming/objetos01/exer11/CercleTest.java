package topic3_objectorientedprogramming.objetos01.exer11;

public class CercleTest {
    public static void main(String[] args) {
        Cercle a = new Cercle(3);
        Cercle b = new Cercle(5);

        if (a.equals(b))
            System.out.println("los objetos son iguales");
        else System.out.println("los objetos son diferentes");
    }
}