package topic4_collections.hashmap02;

public class Dorsal {
    private int dorsal;

    public Dorsal() {
    }

    public Dorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Dorsal{" +
                "dorsal=" + dorsal +
                '}';
    }
}