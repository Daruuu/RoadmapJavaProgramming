package topic3_objectorientedprogramming.herencia03.ex03;

public class InternationalStudent extends Student {
    private String country;

    public InternationalStudent(String name, String address, String cycle, int course) {
        super(name, address, cycle, course);
        System.out.println("clase international student");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
