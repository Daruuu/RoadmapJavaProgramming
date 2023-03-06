/*
 * Person.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package students;

/**
 * Modelizes a person.
 */
public class Person {

    protected String name;
    private String surnames;
    private String address;
    private int age;

    // Constructors

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person(String name, String surnames, String address, int age) {
        this.name = name;
        this.surnames = surnames;
        this.address = address;
        this.age = age;

    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // More methods

    /**
     * Add a year to person's age.
     */
    public void happyBirthday() {
        this.age++;
    }

}
