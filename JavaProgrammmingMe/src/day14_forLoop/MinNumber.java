package src.day14_forLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int minNumber;
        System.out.println("enter a number");
        minNumber = scan.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println("enter a number");
            number = scan.nextInt();
            if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println("max number is "+ minNumber);
    }
}
