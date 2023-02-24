package topic3_objectorientedprogramming.herencia03.ex03;

public class Student extends Person {
    private String cycle;
    private int course;

    public Student(String name, String address, String cycle, int course) {
        super(name, address);
        this.cycle = cycle;
        this.course = course;
        System.out.println("Clase Student");
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}