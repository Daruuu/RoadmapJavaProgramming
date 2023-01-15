package nuwe;

public class SmallestMinimumMultiple {
    public static void main(String[] args) {
        int number = -1;
        for (int i = 20; i < Integer.MAX_VALUE; i++) {
            if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0
                    && i % 16 == 0 && i % 14 == 0 && i % 13 == 0
                    && i % 11 == 0){
                number = i;
                break;
            }
        }
        System.out.println(number);
    }
}
