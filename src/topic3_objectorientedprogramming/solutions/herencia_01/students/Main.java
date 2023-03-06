/*
 * Main.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package students;

/**
 * A main program to test Person and Student classes.
 */
public class Main {

    public static void main(String[] args) {
        // Create an instance of Person
        Person person1 = new Person("Maria", "Terrat Rius", "C/Urgell 187, 3er 4a", 54);
        System.out.print("Dades de la persona\n");
        System.out.print("-----------------\n");
        System.out.print("Nom: " + person1.getName() + "\n");
        System.out.print("Cognoms: " + person1.getSurnames() + "\n");
        System.out.print("Adreça: " + person1.getAddress() + "\n");
        System.out.print("Edat: " + person1.getAge() + "\n");

        // Create an instance of Student that inherits all fields and methods of Person, and adds the features of
        // Student.
        Student student1 = new Student("Joan", 19);
        student1.setSurnames("Gràcia Puig");
        student1.setAddress("C/Lepant 213, 1er 2a");
        student1.setCourse("DAM");
        student1.addSubject("M1");
        student1.addSubject("M2");
        student1.addSubject("M3");
        System.out.print("Dades de l'alumne\n");
        System.out.print("-----------------\n");
        System.out.print("Nom: " + student1.getName() + "\n");
        System.out.print("Cognoms: " + student1.getSurnames() + "\n");
        System.out.print("Edat: " + student1.getAge() + "\n");
        System.out.print("Mòduls: ");
        for (String module : student1.getEnrolledSubjects()) {
            System.out.print(module + " ");
        }

        // Create a Person reference using Student constructor
        Person person2 = new Student("Marc", 21);
        person2.setSurnames("Gràcia Pou");        

        // Student methods can't be called until this person is converted to a Student
        Student student2 = (Student) person2;
        student2.setCourse("DAM");
        student2.addSubject("M1");
        System.out.print("\n\nDades de l'alumne\n");
        System.out.print("-----------------\n");
        System.out.print("Nom: " + student2.getName() + "\n");
        System.out.print("Cognoms: " + student2.getSurnames() + "\n");
        System.out.print("Edat: " + student2.getAge() + "\n");
        System.out.print("Credits: ");
        for (String module : student2.getEnrolledSubjects()) {
            System.out.print(module + " ");
        }

        // Get the class of an object
        System.out.print("\n\n\nL'objecte person1 és de tipus: " + person1.getClass() + "\n");
        System.out.print("L'objecte person2 és de tipus: " + person2.getClass() + "\n");
        System.out.print("L'objecte student1 és de tipus: " + student1.getClass() + "\n");
        System.out.print("L'objecte student2 és de tipus: " + student2.getClass() + "\n");

        // Check if an object is of a type.
        if (person1 instanceof Person) {
            System.out.print("\n\nperson1 és de tipus Person");
        }

        if (person1 instanceof Student) {
            System.out.print("\nperson1 és de tipus Student");
        }
        
        if (person2 instanceof Person) {
            System.out.print("\nperson2 és de tipus Person");
        }

        if (person2 instanceof Student) {
            System.out.print("\nperson2 és de tipus Student");
        }

        if (student1 instanceof Person) {
            System.out.print("\nstudent1 és de tipus Person");
        }

        if (student1 instanceof Student) {
            System.out.print("\nstudent1 és de tipus Student");
        }
               
        if (student2 instanceof Person) {
            System.out.print("\nstudent2 és de tipus Person");
        }

        if (student2 instanceof Student) {
            System.out.print("\nstudent2 és de tipus Student");
        }

    }
}
