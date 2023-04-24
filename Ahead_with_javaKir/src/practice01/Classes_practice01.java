package practice01;

import java.util.Scanner;
import java.util.Random;

public class Classes_practice01 {
    static void addTwoNumbers() {
        System.out.println("input two values to add them");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);
    }

    static void randomNumber() {
        Random random = new Random();
        double a = random.nextInt(100);
        double b = random.nextInt(100);
        double c = a + b;
        System.out.println(c);
    }

    static void calculateSqFt() {
        System.out.println("input two values in inches to get result in sq Feet");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = a * b / 144;
        System.out.println(c);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 999999; i++) {
            System.out.println("press 1 to add two numbers \npress 2 to calculate sq feet \npress 3 to get random number\npress 4 to exit");
            Scanner runS = new Scanner(System.in);
            int run = runS.nextInt();
            if (run == 1) {
                addTwoNumbers();
            } else if (run == 2) {
                calculateSqFt();
            } else if (run == 3) {
                randomNumber();
            }    else if (run == 4) {
                break;
            }
        }
    }
}


