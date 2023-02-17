package topic3_objectorientedprogramming.objetos01.exer01;

/*
Crea una altra classe CotxeTest amb un main on es creïn 2 objectes de tipus Cotxe i es provin els seus mètodes set i get.
*/
public class CotxeTest {
    public static void main(String[] args){
        Cotxe cotxe1 = new Cotxe("modelo1", "X3YYF");
        Cotxe cotxe2 = new Cotxe("modelo 2", "AAAF4");
        System.out.println(cotxe1.getModel());
        System.out.println("matricula cotxe 1: " + cotxe1.getMatricula());
        cotxe1.setMatricula("BABT86");
        System.out.println("nueva matricula cotxe 1: " + cotxe1.getMatricula());
    }
}
