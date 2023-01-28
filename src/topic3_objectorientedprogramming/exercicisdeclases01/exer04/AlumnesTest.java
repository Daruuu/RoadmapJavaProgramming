package topic3_objectorientedprogramming.exercicisdeclases01.exer04;

/*
4. Modifiquem la classe AlumneTest de l'exemple fet a classe de manera que queda com es mostra a baix. Prova el nou codi i contesta les següents preguntes:

Quants objectes Alumne es creen al programa?
Les assignacions entre variables del tipus Alumne (com per exemple alumne3 = alumne1) fan una còpia de l'objecte?
Les assignacions entre variables del tipus Alumne (com per exemple alumne3 = alumne1) fan que les dues variables apuntin al mateix objecte (és a dir podem accedir al mateix objecte amb els dos noms: alumne1 i alumne3)?
 */
public class AlumnesTest {
    public static void main(String[] args) {
        //crea un objecte uf4.exemples.Alumne i l'assigna a la variable alumne1
        Alumne alumne1 = null;
        Alumne alumne2 = null;
        Alumne alumne3 = null;

        alumne1 = new Alumne();
        alumne1.setNom("Ramon");

        alumne2 = new Alumne();
        alumne2.setNom("Sonia");

        alumne3 = alumne1;
        alumne3.saluda();
        alumne1.saluda();

        alumne1 = alumne2;
        alumne1.saluda();

        alumne2.setNom("Moncho");

        alumne1.saluda();
    }
}
