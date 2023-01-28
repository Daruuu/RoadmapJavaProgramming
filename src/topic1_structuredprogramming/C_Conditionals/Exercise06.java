package topic1_structuredprogramming.C_Conditionals;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 4 numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        if (num1 == num2 && num1 == num3 && num1 == num4) System.out.println("son iguales");
        else System.out.println("los numeros son diferentes");

        int maximo = 0;
        int minimo = 0;
        if (num1 > num2 && num1 > num3 && num1 > num4) maximo = num1;
        else if (num2 > num1 && num2 > num3 && num2 > num4) { maximo = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) { maximo = num3;
        } else if (num4 > num1 && num4 > num2 && num4 > num3) { maximo = num4;
        }

        if (num1 < num2 && num1 < num3 && num1 < num4) minimo = num1;
        else if (num2 < num1 && num2 < num3 && num2 < num4) { minimo = num2;
        } else if (num3 < num1 && num3 < num2 && num3 < num4) { minimo = num3;
        } else if (num4 < num1 && num4 < num2 && num4 < num3) { minimo = num4;
        }
        System.out.println("resultado de numero maximo - numero minimo: ");
        System.out.print(maximo - minimo);
    }
}
