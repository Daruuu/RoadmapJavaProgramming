package ex3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<FiguraGeometrica> figuresGeometriques = new ArrayList<>();
        figuresGeometriques.add(new Cercle(1,3));
        figuresGeometriques.add(new Rectangle(1,2, 4));
        figuresGeometriques.add(new Cilindre(1,3, 10));
        figuresGeometriques.add(new Piramide(1,3, 4, 5,6));

        ArrayList<Constants> figuresCirculars = new ArrayList<>();
        ArrayList<Figures2D> figures2D = new ArrayList<>();
        ArrayList<Figures3D> figures3D = new ArrayList<>();

        for(FiguraGeometrica fg: figuresGeometriques){
            if (fg instanceof Constants) figuresCirculars.add((Cercle)fg);
            if (fg instanceof Figures2D) figures2D.add((Figures2D)fg);
            if (fg instanceof Figures3D) figures3D.add((Figures3D)fg);
        }

        for(Constants fg: figuresCirculars){
            if (fg instanceof Figures2D){
                Cercle cercle = (Cercle)fg;
                cercle.area();
                cercle.perimetre();
            }
            if (fg instanceof Figures3D){
                Cilindre cilindre = (Cilindre)fg;
                cilindre.area();
                cilindre.perimetre();
                cilindre.volum();
            }
        }

        for(Figures2D fg: figures2D){
            if (fg instanceof Rectangle){
                Rectangle rectangle = (Rectangle)fg;
                rectangle.area();
                rectangle.perimetre();
            }
            if (fg instanceof Cercle){
                Cercle cercle = (Cercle)fg;
                cercle.area();
                cercle.perimetre();
            }
        }

        for(Figures3D fg: figures3D){
            if (fg instanceof Piramide){
                Piramide piramide = (Piramide)fg;
                piramide.area();
                piramide.perimetre();
                piramide.volum();

            }
            if (fg instanceof Cilindre){
                Cilindre cilindre = (Cilindre)fg;
                cilindre.area();
                cilindre.perimetre();
                cilindre.volum();
            }
        }


    }
}
