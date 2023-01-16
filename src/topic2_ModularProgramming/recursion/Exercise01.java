package topic2_ModularProgramming.recursion;

public class Exercise01 {
    public static void main(String[] args) {
//        int recur1 = exerciseOne(3, 4);
//        System.out.println(recur1);
        exerciseOne(3,4);
    }

    public static int exerciseOne(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + exerciseOne(a, b - 1);
    }
}

