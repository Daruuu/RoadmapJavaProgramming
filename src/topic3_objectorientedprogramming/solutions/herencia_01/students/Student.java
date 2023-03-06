/*
 * Student.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package students;

import java.util.ArrayList;

/**
 * A student is a person but has more features. A student inherits all person properties.
 */
public class Student extends Person {

    private String course;
    private int level;
    private ArrayList<String> enrolledSubjects = new ArrayList<String>();

    // Constructors

    public Student(String name, int age) {
        super(name, age);

    }

    public Student(String name, String surnames, String address, int age, String course, int level) {
        super(name, surnames, address, age);
        this.course = course;
        this.level = level;
    }

    // Getters & setters

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<String> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(ArrayList<String> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    // More methods

    /**
     * Enroll to a subject.
     * 
     * @param subject the subject
     */
    public void addSubject(String subject) {
        this.enrolledSubjects.add(subject);
    }

}
