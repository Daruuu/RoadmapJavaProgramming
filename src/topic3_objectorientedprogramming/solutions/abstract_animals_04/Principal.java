/*
 * Principal.java
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package topic3_objectorientedprogramming.solutions.abstract_animals_04;

import java.util.HashSet;

/**
 * Programa que testeja les classes Animal, Gat, Gos, Pedra, Persona i Vaca.
 *
 * @author Mònica Ramírez Arceda
 * @version 15/04/2010
 */
public class Principal {

    /**
     * Programa principal
     *
     * @param args No emprats.
     */
    public static void main(String[] args) {
        Persona per1 = new Persona("Pep", 36);
        Persona per2 = new Persona("Laia", 28);
        Gat ga1 = new Gat("Mixu", 3);
        Gat ga2 = new Gat("Tara", 7);
        Gat ga3 = new Gat("Pep", 8);
        Gos go1 = new Gos("Pelut", 6);
        Gos go2 = new Gos("Cotó", 6);
        Vaca v1 = new Vaca("Margarita", 5);
        Pedra ped1 = new Pedra(1000000);

        // Què fan les persones?
        System.out.print("Què fa el " + per1.getNom() + "?\n");
        System.out.print(per1.respira() + "\n");
        System.out.print(per1.menja() + "\n");
        System.out.print(per1.dorm() + "\n");
        System.out.print(per1.parla() + "\n");
        System.out.print(per1.estudiaJava() + "\n");

        // Què fan els gats?
        System.out.print("\n\nQuè fa el " + ga1.getNom() + "?\n");
        System.out.print(ga1.respira() + "\n");
        System.out.print(ga1.menja() + "\n");
        System.out.print(ga1.dorm() + "\n");
        System.out.print(ga1.parla() + "\n");
        System.out.print(ga1.ronroneja() + "\n");

        // Què fan els gossos?
        System.out.print("\n\nQuè fa el " + go1.getNom() + "?\n");
        System.out.print(go1.respira() + "\n");
        System.out.print(go1.menja() + "\n");
        System.out.print(go1.dorm() + "\n");
        System.out.print(go1.parla() + "\n");

        // Què fan les vaques?
        System.out.print("\n\nQuè fa la " + v1.getNom() + "?\n");
        System.out.print(v1.respira() + "\n");
        System.out.print(v1.menja() + "\n");
        System.out.print(v1.dorm() + "\n");
        System.out.print(v1.parla() + "\n");
        System.out.print(v1.menja() + "\n");
        System.out.print(v1.rumia() + "\n");

        // La casa de les persones
        HashSet<Persona> casaPersones = new HashSet<Persona>();
        casaPersones.add(per1);
        casaPersones.add(per2);
        System.out.print("\n\nQuè fan les persones?\n");
        for (Persona p : casaPersones) {
            System.out.print(p.getNom() + ": " + p.parla() + "\n");
            System.out.print(p.getNom() + ": " + p.estudiaJava() + "\n");
        }

        // La casa dels gats
        HashSet<Gat> casaGats = new HashSet<Gat>();
        casaGats.add(ga1);
        casaGats.add(ga2);
        casaGats.add(ga3);
        System.out.print("\n\nQuè fan els gats?\n");
        for (Gat g : casaGats) {
            System.out.print(g.getNom() + ": " + g.parla() + "\n");
            System.out.print(g.getNom() + ": " + g.ronroneja() + "\n");
        }

        // La casa dels gosso
        HashSet<Gos> casaGossos = new HashSet<Gos>();
        casaGossos.add(go1);
        casaGossos.add(go2);
        System.out.print("\n\nQuè fan els gossos?\n");
        for (Gos g : casaGossos) {
            System.out.print(g.getNom() + ": " + g.parla() + "\n");
            System.out.print(g.getNom() + ": " + g.menja() + "\n");
        }

        // La casa de les vaques
        HashSet<Vaca> casaVaques = new HashSet<Vaca>();
        casaVaques.add(v1);
        System.out.print("\n\nQuè fan les vaques?\n");
        for (Vaca v : casaVaques) {
            System.out.print(v.getNom() + ": " + v.parla() + "\n");
            System.out.print(v.getNom() + ": " + v.menja() + "\n");
            System.out.print(v.getNom() + ": " + v.rumia() + "\n");
        }

        // La casa de les pedres
        HashSet<Pedra> casaPedres = new HashSet<Pedra>();
        casaPedres.add(ped1);
        System.out.print("\n\nQuè fan les pedres?\n");
        for (Pedra p : casaPedres) {
            System.out.print(p.getEdat() + "\n");
        }

        // La casa dels animals
        HashSet<Animal> casaAnimals = new HashSet<Animal>();
        casaAnimals.add(per1);
        casaAnimals.add(per2);
        casaAnimals.add(ga1);
        casaAnimals.add(ga2);
        casaAnimals.add(ga3);
        casaAnimals.add(go1);
        casaAnimals.add(go2);
        casaAnimals.add(v1);
        System.out.print("\n\nQuè fan els animals?\n");
        for (Animal a : casaAnimals) {
            System.out.print(a.getNom() + ": " + a.parla() + "\n");
            System.out.print(a.getNom() + ": " + a.menja() + "\n");
        }

        // Algun animal ronroneja?
        System.out.print("\n\nAlgun animal ronroneja?\n");
        for (Animal a : casaAnimals) {
            if (a instanceof Gat) {
                Gat ga = (Gat) a;
                System.out.print(ga.getNom() + ": " + ga.ronroneja() + "\n");
            }
        }
    }
}