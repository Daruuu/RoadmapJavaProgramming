package topic3_objectorientedprogramming.interficies04.ex04;

public class Pegasus extends Animal implements Bird, Horse{

    @Override
    public void birdNoise() {
        System.out.println("bird noise");
    }

    @Override
    public void HorseNoise() {
        System.out.println("horse noise");
    }
}
