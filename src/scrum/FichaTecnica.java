package scrum;

import java.util.ArrayList;

public class FichaTecnica {
    public static void main(String[] args) {

        System.out.println("Ficha tecnica presas\n");
   /*
   informacion para poner de cada presa
   años de condena
   años que le queda de condena
   grado
   edad
   dni
   nombre
   apellidos
    */
        ArrayList<String> infoPresa = new ArrayList<>();

        infoPresa.add("45332891S - Nascimento - Juana - edad 29" +
                "\n 20 años de condena " +
                "\n Falta 15 años de condena" +
                "\n Grado 2\n");
        infoPresa.add("79435580G - Dos Santos - Eloisa - edad 42" +
                "\n 10 años de condena" +
                "\n Falta 5 años de condena" +
                "\n Grado 3\n");
        infoPresa.add("80903421X - Libert - Giovana - edad 33" +
                "\n 18 años de condena" +
                "\n Falta 4 años de condena" +
                "\n Grado 3");

        for (int i = 0; i < infoPresa.size(); i++) {
            System.out.println(infoPresa.get(i));
        }
    }


}
