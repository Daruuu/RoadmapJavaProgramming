package topic3_objectorientedprogramming.herencia03.ex03;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> subjects;

    public Teacher(String name, String address, ArrayList<String> subjects) {
        super(name, address);
        this.subjects = subjects;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public boolean addSubject(String subject) {
        return subjects.add(subject);
    }

    public boolean removeSubject(String subject) {
        return subjects.remove(subject);
    }
}
