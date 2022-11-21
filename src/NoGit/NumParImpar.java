package NoGit;

import java.util.Scanner;

public class NumParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        NumParImpar test = new NumParImpar();
        test.parImparFor(num);
        test.parImparWhile(num);
    }

    public void parImparWhile(int num) {
        while (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num--;
        }
    }

    public void parImparFor(int num) {
        if (num % 2 == 0) {
            for (int i = num; i > 0; i--) {
                if (i % 2 == 0)
                    System.out.println(i);
            }
        } else {
            for (int i = num; i > 0; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
